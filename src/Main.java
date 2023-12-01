public class Main {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4};
        arrayDivision(array, 2);
        arrayDivision(array, 5);

    }
    public static void arrayDivision(int[] array, int num) {
        try {
            int result = array[num] / 0;
           System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println(e2.getMessage());
        }
    }
}