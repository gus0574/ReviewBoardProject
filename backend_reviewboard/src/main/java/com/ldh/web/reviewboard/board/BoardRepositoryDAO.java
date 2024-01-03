package com.ldh.web.reviewboard.board;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ldh.web.reviewboard.board.dto.PostDTO;

@Repository
public interface BoardRepositoryDAO extends JpaRepository<PostDTO, Long> {
	
}
