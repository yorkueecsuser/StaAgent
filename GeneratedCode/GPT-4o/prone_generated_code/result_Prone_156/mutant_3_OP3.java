class StringBuilderInitWithCharDemo {

    public String showBug(char inputChar) {
        // This line demonstrates the bug
        StringBuilder sb = new StringBuilder(inputChar); // BUG: StringBuilderInitWithChar
        sb.append(" is the initial size, not the character.");
        
        // Mutation: Adding an unreachable if statement
        boolean unreachableCondition = isUnreachable();
        if (unreachableCondition) {
            // This block is unreachable
            sb.append(" This will never be executed.");
        }

        return sb.toString();
    }

    private boolean isUnreachable() {
        return false; // Although this returns false, it is not a compile-time constant
    }

    public static void main(String[] args) {
        StringBuilderInitWithCharDemo demo = new StringBuilderInitWithCharDemo();
        System.out.println(demo.showBug('A'));
    }
}