/**
 * 이 클래스는
 * codility lesson3_1 문제
 * 해결을 위한 Solution 클래스
 *
 * @version     1.01 02/16/19
 * @author      유재국
 * @since       JDK1.8
 */
package lesson_3_1;

public class Solution {
	public int solution(int X, int Y, int D) {
        int jumpCnt = 0;
        if( ((double)Y-(double)X) % (double)D == 0 )
        	jumpCnt = (Y-X)/D;
    	else
    		jumpCnt = (Y-X) / D + 1;
		return jumpCnt;
	}
}
