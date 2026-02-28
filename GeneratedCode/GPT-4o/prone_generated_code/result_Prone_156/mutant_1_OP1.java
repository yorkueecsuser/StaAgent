class StringBuilderInitWithCharDemo {

    public String showBug(char inputChar) {
        // Dead Store: introducing an unused variable
        int xybwtrpo = 42; // This is the dead store as per mutation operator

        // This line demonstrates the bug
        StringBuilder sb = new StringBuilder(inputChar); // BUG: StringBuilderInitWithChar
        sb.append(" is the initial size, not the character.");
        return sb.toString();
    }

    public static void main(String[] args) {
        StringBuilderInitWithCharDemo demo = new StringBuilderInitWithCharDemo();
        System.out.println(demo.showBug('A'));
    }
}