package org.kakarrot.mapper;

import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.kakarrot.domain.BoardVO;
import org.kakarrot.dto.PageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {

	@Autowired
	private BoardMapper mapper;
	
	
	@Test
	public void testSearchList() {
				PageDTO dto = new PageDTO();
		dto.setPage(1);
		dto.setAmount(10);
		dto.setKeyword("40");
		dto.setType("TC");


		/*List<BoardVO> list = boardMapper.selectList(dto);
		log.info(list);

		model.addAttribute("list", list);*/

		
		 List<BoardVO> list = mapper.searchList(dto);
//		 model.addAttribute("list", list); log.info(list);
		log.info("--------------------");
		
		int count = mapper.searchCount(dto);
		
		log.info("count: "+count);
	}
	
	@Test
	public void test1() {
		log.info(mapper);
		assertNotNull(mapper);
	}
	
//	@Test
//	public void testSelectPaging() {
//		mapper.selectList(10).forEach(vo ->{
//			log.info(vo);});
//	}
	
	@Test
	public void testInsert() {
		IntStream.range(1, 4).forEach(i -> {
			BoardVO vo = new BoardVO();
			vo.setTitle("aa11111"+i);
			vo.setContent("bb2222222"+i);
			vo.setWriter("cc1212121212"+i);
			int count = mapper.insert(vo);
			log.info(count);
		});
	}
}
