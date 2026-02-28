class BuggyCode {
    public static void main(String[] args) {
        showBug();
        showMutation(); // added mutation method
    }

    public static char showBug() {
        String myString = "Hello World";
        int index = 11; // index is out of bounds
        char c = myString.charAt(index);
        return c; // This will throw StringIndexOutOfBoundsException
    }

    public static int getCondition() { // added non-final variable
        return 0;
    }

    public static void showMutation() { // added unreachable switch statement
        int condition = getCondition();
        switch (condition) {
            case 1: // unreachable case
                System.out.println("This is unreachable code");
                break;
            default:
                break;
        }
    }
}