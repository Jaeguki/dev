/**
 * 이 클래스는
 * codility lesson4_1 문제
 * 해결을 위한 Main 클래스
 *
 * @version     1.01 02/17/19
 * @author      유재국
 * @since       JDK1.8
 */
package lesson_4_1;

public class Main {
	public static void main(String args[]) {
		Solution s = new Solution();
		int[] A = {4,1,3,2};
		if(s.solution(A) == 1)
			System.out.println("correct");
		else
			System.out.println("wrong");
		
		int[] B = {4,1,3};
		if(s.solution(B) == 0)
			System.out.println("correct");
		else
			System.out.println("wrong");
	}
}
