public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        OddOccurrencesInArray sol = new OddOccurrencesInArray();

        int[] A = {9, 3, 9, 3, 9, 7, 9};

        int result = sol.solution(A);
        System.out.println("result = " + result);
    }
}
