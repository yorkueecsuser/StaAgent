import java.math.BigDecimal;

class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimalTest test = new BigDecimalTest();
        test.showBug();
    }

    public void showBug() {
        BigDecimal value = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        System.out.println(value);

        // Mutant code 1
        final boolean alwaysFalse = false;
        if (alwaysFalse) {
            System.out.println("This code is unreachable due to the unreachable if statement mutation.");
        }

        // Mutant code 2
        final boolean alwaysFalseWhile = false;
        while (alwaysFalseWhile) {
            System.out.println("This code is unreachable due to the unreachable while loop mutation.");
        }

        // Mutant code 3
        final boolean alwaysFalseFor = false;
        for (int i = 0; alwaysFalseFor; i++) {
            System.out.println("This code is unreachable due to the unreachable for loop mutation.");
        }

        // Mutant code 4
        boolean condition = false;
        if (condition) {
            System.out.println("This code is unreachable due to the unreachable if-else statement mutation.");
        } else {
            /* alternative code */
        }

        // Mutant code 5
        int valueSwitch = 0;
        switch(valueSwitch) {
            case 1: /* code */ break;
        }
    }
}