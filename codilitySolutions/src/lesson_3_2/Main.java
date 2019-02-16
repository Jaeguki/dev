/**
 * 이 클래스는
 * codility lesson3_1 문제
 * 해결을 위한 Main 클래스
 *
 * @version     1.01 02/16/19
 * @author      유재국
 * @since       JDK1.8
 */
package lesson_3_2;

public class Main {
	public static void main(String args[]) {
		Solution s = new Solution();
		int[] A = {2,3,1,5};
		if ((s.solution(A)) == 4)
			System.out.println("correct");
		else
			System.out.println("wrong");
	}
}
