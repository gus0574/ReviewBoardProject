package com.ldh.web.reviewboard.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ldh.web.reviewboard.board.dto.PostDTO;
import com.ldh.web.reviewboard.board.dto.PostVO;

import jakarta.transaction.Transactional;

@Service
public class BoardService {
	
	@Autowired
	private final BoardMapper boardMapper;

	public BoardService(BoardMapper boardMapper) {
		super();
		this.boardMapper = boardMapper;
	}
	
	/*
	 * @title	게시글 저장
	 * @desc 	게시글 정보를 받아 DB에 저장
	 * @param 	PostDTO 저장할 게시글 정보
	 * @return 	저장된 PostID
	 * @author	LD
	 * @version	2024.01.08 - 1.0.0 - LD
	 */
	@Transactional
	public String savePost(PostDTO params) {
		boardMapper.save(params);
		return params.getPostId();
	}

	@Transactional
	public List<PostVO> findAll() {
		// TODO Auto-generated method stub
		System.out.println("findALL exec");
		return boardMapper.findAll();
	}
	
	
}
