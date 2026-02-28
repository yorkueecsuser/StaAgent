class ConditionallyExecutedCode {
    public static void main(String[] args) {
        int a = 0;
        if (a == 0) {
            System.out.println("a is 0"); // BUG: Conditionally executed code should be reachable
        }
        // Insert unreachable switch statement
        switch (false) {
            case true:
                break;
            case false:
                System.out.println("Unreachable code");
                break;
        }
    }
}