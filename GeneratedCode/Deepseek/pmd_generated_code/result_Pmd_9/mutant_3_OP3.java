import java.math.BigDecimal;

class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1); // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        return bd;
    }

    public static boolean getCondition() {
        return false;
    }

    public static int getValue() {
        return 0;
    }

    public static void unreachableIfStatement() {
        if (getCondition()) {
            // unreachable code
        }

        while (getCondition()) {
            // unreachable code
        }

        for (int i = 0; getCondition(); i++) {
            // unreachable code
        }

        if (false) {
            // unreachable code
        } else {
            // unreachable code
        }

        switch (getValue()) {
            case 1:
                // unreachable code
                break;
        }
    }
}