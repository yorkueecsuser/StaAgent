class ZeroDenominatorBug {
    public static void main(String[] args) {
        int numerator = 1;
        int denominator = 0;

        if (unknown()) {
            //..
            denominator = 3;
        } else {
            //..
        }

        int result = numerator / denominator; // BUG: Zero should not be a possible denominator

        System.out.println("Result: " + result);
    }

    public static boolean unknown() {
        return true;
    }
}

// Mutation Operator: Unreachable switch statement
// Mutation Operator description: Inserting unreachable switch statement into a randomly selected basic block in the program. The switch condition must always evaluate to false to make it unreachable.

// Unreachable switch statement mutant:
class ZeroDenominatorBug {
    public static void main(String[] args) {
        int numerator = 1;
        int denominator = 0;

        if (unknown()) {
            //..
            denominator = 3;
        } else {
            //..
        }

        int result = numerator / denominator; // BUG: Zero should not be a possible denominator

        switch (false) {
            case 1: /* code */ break;
            default: /* code */ break;
        }

        System.out.println("Result: " + result);
    }

    public static boolean unknown() {
        return true;
    }
}