class ConditionallyExecutedCode {
    public static void main(String[] args) {
        int a = 0;
        if (a == 0) {
            System.out.println("a is 0"); // BUG: Conditionally executed code should be reachable
        }
        int b = 1;
        if (b == 1) {
            System.out.println("b is 1"); // Unreachable switch statement mutant
        }
        switch (0) {
            case 1:
                System.out.println("case 1");
                break;
            default:
                System.out.println("default");
        }
    }
}