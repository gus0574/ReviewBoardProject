package com.ldh.web.reviewboard.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ldh.web.reviewboard.board.dto.PostVO;

@RestController
public class BoardRestController {
	
	@Autowired
	private final BoardService boardService;
	
	public BoardRestController(BoardService boardService) {
		super();
		this.boardService = boardService;
	}

	@GetMapping(path="/t")
	public void home() {
		System.out.println("Hello World!");
	}
	@GetMapping(path="/testHome")
	public List<PostVO> homepage() {
		System.out.println("Hello");
		return boardService.findAll();
	}
}
