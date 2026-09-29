public class Main {
    public static void main(String[] args) {

        int[] arr = {10, -5, 0, 7, -3, 0, 8, -2};

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                positive++;
            } 
            else if (arr[i] < 0) {
                negative++;
            } 
            else {
                zero++;
            }
        }

        System.out.println("Positive elements: " + positive);
        System.out.println("Negative elements: " + negative);
        System.out.println("Zero elements: " + zero);
    }
}