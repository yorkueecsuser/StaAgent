class StringBuilderInitWithCharDemo {

    public String showBug(char inputChar) {
        // This line demonstrates the bug
        StringBuilder sb = new StringBuilder(inputChar); // BUG: StringBuilderInitWithChar
        sb.append(" is the initial size, not the character.");
        
        // Unreachable switch statement
        int unreachableSwitch = getUnreachableSwitchValue();
        switch (unreachableSwitch) {
            case 1:
                System.out.println("This is unreachable code.");
                break;
            default:
                // Do nothing
                break;
        }

        return sb.toString();
    }

    // Method to provide a non-final value for the switch
    private int getUnreachableSwitchValue() {
        return 0;
    }

    public static void main(String[] args) {
        StringBuilderInitWithCharDemo demo = new StringBuilderInitWithCharDemo();
        System.out.println(demo.showBug('A'));
    }
}