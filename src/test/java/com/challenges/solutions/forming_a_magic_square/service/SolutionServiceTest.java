package com.challenges.solutions.forming_a_magic_square.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionServiceTest {
	SolutionService service=new SolutionService();
	@Test
	public void getCountOfWrongElementsTest1() {
	int[][] matrix=new int[][] { { 4, 8, 2 }, { 4, 5, 7 }, { 6, 1, 6 } };
	int result=service.getCountOfWrongElements(matrix);
	assertEquals(4, result);
	}
	@Test
	public void getCountOfWrongElementsTest2() {
	int[][] matrix=new int[][] { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 5 } };
	int result=service.getCountOfWrongElements(matrix);
	assertEquals(1, result);
	}
}
