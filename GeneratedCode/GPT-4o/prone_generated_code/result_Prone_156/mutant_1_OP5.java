class StringBuilderInitWithCharDemo {

    public String showBug(char inputChar) {
        // This line demonstrates the bug
        StringBuilder sb = new StringBuilder(inputChar); // BUG: StringBuilderInitWithChar
        sb.append(" is the initial size, not the character.");
        
        // Adding an unreachable switch statement
        int unreachableSwitchValue = getUnreachableValue();
        switch (unreachableSwitchValue) {
            case 1:
                sb.append(" This is unreachable code.");
                break;
            default:
                sb.append(" This is the default unreachable code.");
                break;
        }
        
        return sb.toString();
    }

    private int getUnreachableValue() {
        // Returns a value that does not match any switch case, making the switch statement unreachable
        return 0;
    }

    public static void main(String[] args) {
        StringBuilderInitWithCharDemo demo = new StringBuilderInitWithCharDemo();
        System.out.println(demo.showBug('A'));
    }
}