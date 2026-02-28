class UselessStringValueOf {
    public static void main(String[] args) {
        String str = "Hello, World!";
        str = str + String.valueOf(10); // BUG: UselessStringValueOf
        System.out.println(str);

        // Unreachable switch statement mutant:
        int value = 0;
        switch(value) {
            case 1:
                // Unreachable code
                System.out.println("This should not be printed");
                break;
            default:
                // Do nothing
        }
    }
}