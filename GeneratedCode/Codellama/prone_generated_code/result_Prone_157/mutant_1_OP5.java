class BuggyString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String substr = str.substring(0);
        System.out.println(substr);

        // Unreachable switch statement mutant
        int value = 0;
        switch(value) {
            case 1:
                System.out.println("This code should never be executed");
                break;
            default:
                System.out.println("This code should always be executed");
                break;
        }
    }
}