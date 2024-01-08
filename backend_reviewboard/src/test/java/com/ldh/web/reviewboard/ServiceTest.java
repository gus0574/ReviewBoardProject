package com.ldh.web.reviewboard;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ldh.web.reviewboard.board.BoardService;
import com.ldh.web.reviewboard.board.dto.PostDTO;

@SpringBootTest
public class ServiceTest {

	@Autowired
	BoardService boardService;
	
	@Test
	void savePost() {
        PostDTO params = new PostDTO();        
		params.setUserId("LD");
		params.setCategory("catecate");
		params.setTitle("12번 게시글 제목 입니다");
		params.setContent("12번 게시글의 내용 입니다");
		params.setNoticeYn('n');
		params.setAttachedFileYn('n');
		params.setDeleteYn('n');
		String postId = boardService.savePost(params);
        System.out.println("생성된 게시글 ID : " + postId);
	}
}
