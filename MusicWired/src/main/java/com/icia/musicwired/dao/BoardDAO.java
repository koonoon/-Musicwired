package com.icia.musicwired.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.icia.musicwired.dto.BoardDTO;
import com.icia.musicwired.dto.BoardLikeDTO;

@Mapper
public interface BoardDAO {

//	boardUpload : 게시글 업로드 메소드
	int boardUpload(BoardDTO board);

	List<BoardDTO> boardList();

	BoardDTO boardModiView(int boCode);

	List<BoardDTO> ajaxBoardList();

	int boLikeUp(int boCode);

	List<BoardDTO> ajaxBoardListSelect(int boCode);

	int boLikeDown(int boCode);

	int boardModify(BoardDTO board);

	int boardDelete(int boCode);

	int boLikeInsert(BoardLikeDTO boLike);

}
