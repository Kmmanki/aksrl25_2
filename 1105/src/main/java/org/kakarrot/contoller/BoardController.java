package org.kakarrot.contoller;

import java.util.List;

import org.kakarrot.domain.BoardVO;
import org.kakarrot.dto.PageDTO;
import org.kakarrot.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/board/*")
@Log4j
@AllArgsConstructor
public class BoardController {

	@Autowired
	private BoardMapper boardMapper;

	@GetMapping("/register")
	public void registerGET() {
	}

	@GetMapping("/list")
	public void list() {
		PageDTO dto = new PageDTO();
		dto.setPage(1);
		dto.setAmount(10);
		dto.setKeyword("40");
		dto.setType("TC");


		/*List<BoardVO> list = boardMapper.selectList(dto);
		log.info(list);

		model.addAttribute("list", list);*/

		
		 List<BoardVO> list = boardMapper.searchList(dto);
		 model.addAttribute("list", list); log.info(list);
		 
	}

	@PostMapping("/register")
	public String postRegister(BoardVO vo) {
		boardMapper.insert(vo);
		return "redirect:list";
	}

}