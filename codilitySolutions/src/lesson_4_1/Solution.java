/**
 * 이 클래스는
 * codility lesson4_1 문제
 * 해결을 위한 Solution 클래스
 *
 * @version     1.01 02/17/19
 * @author      유재국
 * @since       JDK1.8
 */

package lesson_4_1;

import java.util.Arrays;

public class Solution {
	public int solution(int[] A) {
		Arrays.sort(A);
		int[] B = new int[A.length+1];
		
		for(int i = 0; i < A.length; i++) {
			B[i] = i+1;
		}
		
		for(int i = 0; i < A.length; i++) {
			if(B[i] != A[i])
				return 0;
		}
		
		return 1;
	}
}
