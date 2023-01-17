package J01_JavaQuestionMid;

public class MissingOddDigit {


    public static void main(String[] args) {

        int [] str = {1,3,5,7,9,13,15,17,19};
        int newOdd = findMissingOdd(str);
        System.out.println(newOdd);


    }

    public static int findMissingOdd(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0 && arr[i] + 2 != arr[i + 1]) {
                return arr[i] + 2;
            }
        }
        return -1;
    }


}
