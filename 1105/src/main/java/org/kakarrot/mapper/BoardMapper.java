package org.kakarrot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.kakarrot.domain.BoardVO;
import org.kakarrot.dto.PageDTO;

public interface BoardMapper extends CrudMapper<BoardVO, Integer>, ListMapper<BoardVO>{

	
	public List<BoardVO> searchList(PageDTO dto	);
	
	public int searchCount(PageDTO dto		);
}