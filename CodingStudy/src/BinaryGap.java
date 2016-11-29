import java.util.ArrayList;

/**
 * Created by wooyoung on 2016. 11. 16..
 */
public class BinaryGap {

    public int solution(int N) {

        String binaryStr = Integer.toBinaryString(N);
        String[] binaryArray = binaryStr.split("");
        int count;
        ArrayList<Integer> resultList = new ArrayList<>();

        for (int i=0; i<binaryArray.length; i++) {
            String temp = binaryArray[i];

            if (temp.equals("1")) {
                for (int j=i+1; j<binaryArray.length; j++) {
                    if (binaryArray[j].equals("1")) {
                        count = j-i-1;
                        resultList.add(count);
                        count = 0;
                        break;
                    }
                }

            }
        }

        int result = 0;
        if (resultList.size() > 0) {
            for (int i=0; i<resultList.size(); i++) {
                if (result < resultList.get(i)) {
                    result = resultList.get(i);
                }
            }
        }

        return result;
    }
}
