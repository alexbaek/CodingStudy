/**
 * Created by wooyoung on 2016. 11. 17..
 */
public class OddOccurrencesInArray {

    public int solution(int[] A) {

        // 예외처리.
        if (A == null || A.length == 0) {
            return 0;
        }

        int length = A.length;
        int index = 0;
        boolean isPair;

        for (int i=0; i<length; i++) {
            index = i;
            isPair = false;

            // 끝에 도달하지 않았을때.
            if (i != length || A[i] != 0) {
                for (int j=i+1; j<length; j++) {

                    System.out.println("A[i] : " + A[i] + "A[i] : " + A[i]);

                    if (A[i] == A[j]) {
                        // 짝을 찾음.
                        A[i] = 0;
                        A[j] = 0;
                        isPair = true;
                        break;
                    }
                }

                if (isPair == false) {
                    // 짝을 찾지 못함.

                    System.out.println("isPair : " + A[index]);
                    break;
                }
            }
        }

        int result = A[index];
        System.out.println("result : " + result);

        return result;
    }
}
