package com.ldh.web.reviewboard.board.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@PropertySource("classpath:/application.properties")
public class DatabaseConfig {
	
//	@Autowired
//	private ApplicationContext context;
	
	// 참조할 properties에 경로 선언, 정의된 Hikari 정보를 config에 자동 매핑하여 객체 생성
	@Bean
	@ConfigurationProperties(prefix = "spring.datasource.hikari")
	public HikariConfig hikariConfig() {
		return new HikariConfig();
	}
	
	//커넥션 풀을 지원하기 위한 인터페이스
	@Bean
	public DataSource dataSource() {
		// wrapper 
		return new HikariDataSource(hikariConfig());
	}
	
	//DB 커넥션과 SQL 실행에 대한 모든 것을 갖는 객체, FactoryBean의 구현, 마이바티스(MyBatis)와 스프링의 연동 모듈로 사용
	//데이터 소스를 참조하며, XML Mapper(SQL 쿼리 작성 파일)의 경로와 설정 파일 경로 등의 정보를 갖는 객체
    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource());
//		factoryBean.setMapperLocations(context.getResources("classpath:/mappers/**/*Mapper.xml"));
        return factoryBean.getObject();
    }

    //SqlSessionFactory를 통해 생성되고 DB의 커밋, 롤백 등 SQL의 실행에 필요한 모든 메서드를 갖는 객체
    @Bean
    public SqlSessionTemplate sqlSession() throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory());
    }
}
