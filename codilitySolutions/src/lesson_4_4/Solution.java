/**
 * 이 클래스는
 * codility lesson4_4 문제
 * 해결을 위한 Solution 클래스
 *
 * @version     1.00 03/02/19
 * @author      유재국
 * @since       JDK1.8
 */

package lesson_4_4;

public class Solution {
	public int[] solution(int N, int[] A) {
		int[] B = new int[N];
		int max = 0;

		for(int i = 0; i < N; i++) {
			B[i] = 0;
		}
		
		for(int i = 0; i < A.length; i++) {
			if( A[i] == N+1 ) {
				for(int j = 0 ; j < N; j++) {
					B[j] = max;
				}
			}
			else {
				
				B[A[i]-1]++;
				if ( B[A[i]-1] > max)
					max = B[A[i]-1];
			}

		}
		return B;
	}
}
