/**
 * Created by wooyoung on 2016. 11. 16..
 */
public class CyclicRotation {

    public int[] solution(int[] A, int K) {

        if (A == null || A.length == 0)
            return A;

        // A의 카운트를 가지고 옮.
        int listCount = A.length;
        // 실제 돌려야되는 카운트 수를 구함.
        int rotationCount = K % listCount;

        // 반복되어야되는 횟수.
        for (int i=0; i<rotationCount; i++) {

            int temp = A[0];
            int storage = 0;
            // 리스트를 도는 처리.
            for (int j=1; j<listCount+1; j++) {

                if (j == listCount) {
                    A[0] = temp;
                } else {
                    storage = A[j];
                    A[j] = temp;
                    temp = storage;
                }
            }

        }
        return A;
    }
}
