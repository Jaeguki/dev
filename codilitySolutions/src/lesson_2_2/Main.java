/**
 * 이 클래스는
 * codility lesson2_2 문제
 * 해결을 위한 Main 클래스
 *
 * @version     1.00 02/14/19
 * @author      유재국
 * @since       JDK1.8
 */

package lesson_2_2;

public class Main {
	public static void main(String args[]) {
		Solution s = new Solution();
		int [] A = {3, 8, 9, 7, 6};
		int [] B = s.solution(A, 3);
		int [] C = {9, 7, 6, 3, 8};
		String result = "";
		for(int i = 0; i < B.length; i++) {
			try {
				if(B[i] != C[i])
					A[5] = 1;
				else
					result = "correct";
			}catch(ArrayIndexOutOfBoundsException e) {
				result = "wrong";
			}
		}
		System.out.println(result);
	}
}
