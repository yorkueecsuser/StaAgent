class StringBuilderInitWithCharDemo {

    public String showBug(char inputChar) {
        // This line demonstrates the bug
        StringBuilder sb = new StringBuilder(inputChar); // BUG: StringBuilderInitWithChar
        sb.append(" is the initial size, not the character.");
        return sb.toString();
    }

    // Mutant code with renamed variable
    public String showBugMutant(char inputChar) {
        // This line demonstrates the bug
        StringBuilder x = new StringBuilder(inputChar); // BUG: StringBuilderInitWithChar
        x.append(" is the initial size, not the character.");
        return x.toString();
    }

    public static void main(String[] args) {
        StringBuilderInitWithCharDemo demo = new StringBuilderInitWithCharDemo();
        System.out.println(demo.showBug('A'));
        // Output from mutant method
        System.out.println(demo.showBugMutant('A'));
    }
}