/**
 * 이 클래스는
 * codility lesson3_3 문제
 * 해결을 위한 Solution 클래스
 *
 * @version     1.01 02/17/19
 * @author      유재국
 * @since       JDK1.8
 */
package lesson_3_3;

public class Solution {
	public int solution(int[] A) {
	    int minDiff = 0;
	    int frontSum = 0;
        int backSum = 0;
        
        for(int i = 0; i < A.length; i++) {
        	backSum += A[i];
        }
        
        for(int i = 0; i < A.length-1; i++) {
        	frontSum += A[i];
    		backSum -= A[i];
        	if(i == 0) {
        		minDiff = Math.abs(frontSum - backSum);
        	}else if (minDiff > Math.abs(frontSum - backSum))
        		minDiff = Math.abs(frontSum - backSum);
        }
        
     
		return minDiff;
	}
}
