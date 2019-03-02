/**
 * 이 클래스는
 * codility lesson4_4 문제
 * 해결을 위한 Main 클래스
 *
 * @version     1.00 03/02/19
 * @author      유재국
 * @since       JDK1.8
 */

package lesson_4_4;

public class Main {
	public static void main(String args[]) {
		Solution s = new Solution();
		int[] A = {3,4,4,6,1,4,4};
		int[] B = {3,2,2,4,2};
		int[] C = s.solution(5, A);
		boolean check = true;
		
		for( int i = 0; i < B.length; i++) {
			if( B[i] != C[i] ) {
				check = false;
			}
		}
		
		if(check)
			System.out.println("correct");
		else
			System.out.println("wrong");
	}
}
