/**
 * Created by wooyoung on 2016. 11. 29..
 */
public class FrogJmp {

    public int solution(int X, int Y, int D) {

        if (Y - X <0 || X == Y) {
            return 0;
        }

        int temp = Y-X;
        int count = temp / D;
        int rest = temp % D;

        if (rest>0) {
            count += 1;
        }

        return count;
    }
}
