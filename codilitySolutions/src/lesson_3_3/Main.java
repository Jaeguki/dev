/**
 * 이 클래스는
 * codility lesson3_3 문제
 * 해결을 위한 Main 클래스
 *
 * @version     1.00 02/17/19
 * @author      유재국
 * @since       JDK1.8
 */
package lesson_3_3;

public class Main {
	public static void main(String args[]) {		
		Solution s = new Solution();
		int[] A = {3,1,2,4,3};
		if ((s.solution(A)) == 1)
			System.out.println("correct");
		else
			System.out.println("wrong");	
	}
	
}
