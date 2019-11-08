package org.kakarrot.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import orgkakarrot.dto.BoardDTO;
import orgkakarrot.dto.Member;

@Controller
public class SampleController {
	
	@RequestMapping("/ex1")
	public void ex1(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
	
	@RequestMapping("/ex2")
	public void ex2(BoardDTO dto) {
		System.out.println(dto.toString());
	}
	
	@GetMapping("/ex3")
	public void ex3Get(Member mem) {
		System.out.println(mem);
	}
	
	@PostMapping("/ex3")
	public void ex3(Member mem) {
		System.out.println(mem);
	}
	
	
	@PostMapping("/exUpload")
	public void exUploadPost(ArrayList<MultipartFile> files) {

		if(files.size() <=0) {
			return;
		}
		files.stream().filter(file -> file.getSize() != 0).forEach(file -> {
			System.out.println(file);
			System.out.println(file.getSize());
			System.out.println(file.getOriginalFilename());
			if(file.getSize() > 0 ) {
				String filename = file.getOriginalFilename();
				File target = new File("c://zzz//upload", filename) ;
				try {
					FileCopyUtils.copy(file.getBytes(), target);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}
	@GetMapping("/exUpload")
	public void exUploadGet() {
		
	}
}
