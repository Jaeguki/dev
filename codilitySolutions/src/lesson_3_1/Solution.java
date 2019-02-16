package lesson_3_1;

public class Solution {
	public int solution(int X, int Y, int D) {
        int jumpCnt = 0;
		jumpCnt = (Y-X) / D + 1;
		return jumpCnt;
	}
}
