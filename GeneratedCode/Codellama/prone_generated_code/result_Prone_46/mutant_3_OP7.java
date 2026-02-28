import java.util.Objects;

class EqualsNull {
    public static void main(String[] args) {
        Object obj = new Object();
        if (obj.equals(null)) {
            System.out.println("obj is null");
        }

        // Unreachable while loop mutant
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This code is unreachable");
        }
    }

    // Method to get a dynamically determined condition
    public static boolean getCondition() {
        return Math.random() > 0.5;
    }
}