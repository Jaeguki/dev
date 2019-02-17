/**
 * 이 클래스는
 * codility lesson3_3 문제
 * 해결을 위한 Solution 클래스
 *
 * @version     1.00 02/17/19
 * @author      유재국
 * @since       JDK1.8
 */
package lesson_3_3;

public class Solution {
	public int solution(int[] A) {
	    int minDiff = 0;
	    int frontSum = 0;
	    for(int i = 0; i < A.length-1; i++) {
            int backSum = 0;
            
        	frontSum+= A[i];
        	
			for(int j = i+1; j < A.length; j++) {
				backSum += A[j];
			}
			
			if(i == 0)
				minDiff = Math.abs(frontSum - backSum);
			else {
				if (minDiff > Math.abs(frontSum - backSum))
					minDiff = Math.abs(frontSum - backSum);
			}
	    }
		return minDiff;
	}
}
