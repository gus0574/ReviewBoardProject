package com.ldh.web.reviewboard.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ldh.web.reviewboard.board.dto.PostDTO;
import com.ldh.web.reviewboard.board.dto.PostVO;

@Mapper
public interface BoardMapper {

	/*
	 * 게시글 저장
	 * @param params - 게시글 정보
	 * */
	void save(PostDTO params);
	
	/**
	 * 게시글 상세정보 조회
	 * @param post_id - PK
	 * @return 게시글 상세정보
	 */
	 PostVO findById(String post_id);
	 
	 /**
	  * 게시글 수정
	  * @param params - 게시글 정보
	  */
	 void update(PostDTO params);
	 
	 /**
	  * 게시글 삭제
	  * @param post_id - PK
	  */
	 void deleteById(String id);
	 
	 /**
	  * 게시글 리스트 조회
	  * @return 게시글 리스트
	  */
	 List<PostVO> findAll();
	 
	 /**
	  * 게시글 수 카운팅
	  * @return 게시글 수
	  */
	 int countPost();
}
