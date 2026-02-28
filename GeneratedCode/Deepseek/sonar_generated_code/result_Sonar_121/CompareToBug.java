import java.util.Arrays;

class CompareToBug {

    public static void showBug() {
        Integer[] numbers = {1, 2, 3, 4, 5};
        Arrays.sort(numbers, (a, b) -> {
            if (a < b) {
                return -1; // BUG: "compareTo" results should not be checked for specific values
            } else if (a > b) {
                return 1;  // BUG: "compareTo" results should not be checked for specific values
            } else {
                return 0;
            }
        });
        System.out.println(Arrays.toString(numbers));
    }

    public static void main(String[] args) {
        showBug();
    }
}