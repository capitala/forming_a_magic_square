package com.challenges.solutions.forming_a_magic_square.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.challenges.solutions.forming_a_magic_square.service.SolutionService;

@RestController
public class SolutionController {
@Autowired
private SolutionService serve; 
@RequestMapping("/getCountOfWrongElements")
public int getCount(@RequestParam("mat") int[][] matrix) {
	return serve.getCountOfWrongElements(matrix);
}
}
