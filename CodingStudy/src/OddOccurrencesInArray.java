import java.util.HashMap;
import java.util.Map;

/**
 * Created by wooyoung on 2016. 11. 17..
 */
public class OddOccurrencesInArray {

    public int solution(int[] A) {

        // 예외처리.
        if (A == null || A.length == 0) {
            return 0;
        }

        Map<Integer,Integer> matchMap = new HashMap<Integer,Integer>();
        int unPaired = 0;

        for(int i=0;i<A.length;i++){
            int value = matchMap.get(A[i])==null?0:matchMap.get(A[i]);
            matchMap.put(A[i],value+1);
        }

        for(Map.Entry<Integer, Integer> entry : matchMap.entrySet()){
            if(entry.getValue() % 2 > 0){
                unPaired = entry.getKey();
            }
        }

        return unPaired;
    }
}
