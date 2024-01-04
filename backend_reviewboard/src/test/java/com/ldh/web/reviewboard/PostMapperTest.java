package com.ldh.web.reviewboard;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.ldh.web.reviewboard.board.BoardMapper;
import com.ldh.web.reviewboard.board.dto.PostDTO;
import com.ldh.web.reviewboard.board.dto.PostVO;

@SpringBootTest
public class PostMapperTest {
	
	@Autowired
	BoardMapper boardMapper;
	
	@Test
	void save() {
		PostDTO params = new PostDTO();
//		params.setPostId("A1234");
		params.setUserId("admin");
		params.setCategory("cate");
		params.setTitle("TTEESSTT");
		params.setContent("MYMYMYMY");
		params.setNoticeYn('n');
		params.setAttachedFileYn('n');
		boardMapper.save(params);
		
		List<PostVO> posts = boardMapper.findAll();
		System.out.println("전체 게시글 수 : "+posts.size()+" 개");
	}
	
	@Test
	void findById() {
		PostVO postVO = boardMapper.findById("2024A0001001");
		
		
		// 일단 기본으로 내장되어 있는 Jackson 라이브러리로 테스트
		try {
            String postJson = new ObjectMapper().registerModule(new JavaTimeModule()).writeValueAsString(postVO);
            System.out.println(postJson);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
	}
	
    @Test
    void update() {
        // 1. 게시글 수정
    	PostDTO params = new PostDTO();
    	
        params.setPostId("2024A0001001");
        params.setUserId("ehgus");
        params.setCategory("cateCate");
        params.setTitle("1번 게시글 제목 수정합니다.");
        params.setContent("1번 게시글 내용 수정합니다.");
        params.setAttachedFileYn('y');
        params.setNoticeYn('y');
        boardMapper.update(params);
        
        // 2. 게시글 상세정보 조회
        PostVO post = boardMapper.findById("2024A0001001");
        try {
            String postJson = new ObjectMapper().registerModule(new JavaTimeModule()).writeValueAsString(post);
            System.out.println(postJson);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
    
    @Test
    void delete() {
        System.out.println("삭제 이전의 전체 게시글 개수는 : " + boardMapper.findAll().size() + "개입니다.");
        boardMapper.deleteById("2024A0001001");
        System.out.println("삭제 이후의 전체 게시글 개수는 : " + boardMapper.findAll().size() + "개입니다.");
    }
}
