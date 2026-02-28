class ConditionallyExecutedCode {
    public static void main(String[] args) {
        int a = 0;
        if (a == 0) {
            System.out.println("a is 0"); // BUG: Conditionally executed code should be reachable
        }
        boolean condition = getCondition();
        if (condition) {
            switch (0) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
            }
        }
    }

    static boolean getCondition() {
        return false;
    }

    static int getValue() {
        return 0;
    }
}