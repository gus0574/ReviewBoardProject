package com.ldh.web.reviewboard.board;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ldh.web.reviewboard.board.dao.BoardDAO;

@Repository
public interface BoardRepository extends JpaRepository<BoardDAO, Long> {
	
}
