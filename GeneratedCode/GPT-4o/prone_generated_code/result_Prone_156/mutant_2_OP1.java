class StringBuilderInitWithCharDemo {

    public String showBug(char inputChar) {
        // Dead Store: Inserted an unused variable of type int
        int abcdefgh = 42; // This is the dead store variable
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