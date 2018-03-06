package com.challenges.solutions.forming_a_magic_square.service;


import org.springframework.stereotype.Service;

import com.challenges.solutions.forming_a_magic_square.performance_monitor.TrackTime;

@Service
public class SolutionService {
	@TrackTime
	public Integer getCountOfWrongElements(int[][] matrix) {
		int[][][] all=new int[][][] {{{8,1,6},{3,5,7},{4,9,2}},{{6,1,8},{7,5,3},{2,9,4}},{{8,3,4},{1,5,9},{6,7,2}},{{4,3,8},{9,5,1},{2,7,6}},{{6,7,2},{1,5,9},{8,3,4}},{{2,7,6},{9,5,1},{4,3,8}},{{4,9,2},{3,5,7},{8,1,6}},{{2,9,4},{7,5,3},{6,1,8}}};
		int result=82;
		for(int i=0;i<8;i++)
		{int cost=0;
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<3;k++) {
					cost+=Math.abs(all[i][j][k]-matrix[j][k]);
				}
				if(cost>result)
					break;
			}
			if(cost<result)
				result=cost;
		}
		// TODO Auto-generated method stub
		return result;
	}

}
