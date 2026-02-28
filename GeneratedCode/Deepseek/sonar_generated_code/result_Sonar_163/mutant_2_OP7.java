import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static ArrayList<String> showBug() {
        StringBuilder sb = new StringBuilder('A'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        StringBuffer sbf = new StringBuffer('A'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character

        System.out.println(sb.capacity()); // Expected: 5 Actual: 65
        System.out.println(sbf.capacity()); // Expected: 5 Actual: 65

        // Beginning of mutation operator: Unreachable while loop
        // The condition of this while loop is always false making it unreachable
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            int unreachable = 1;
            unreachable += 1;
        }
        // End of mutation operator: Unreachable while loop

        return new ArrayList<>();
    }

    // Dummy method to satisfy mutation operator condition
    public static boolean getCondition() {
        return false;
    }
}