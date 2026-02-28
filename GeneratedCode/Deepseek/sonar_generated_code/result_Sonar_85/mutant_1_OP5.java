class BuggyCode {
    public static void main(String[] args) {
        showBug();
    }

    public static char showBug() {
        String myString = "Hello World";
        int index = 11; // index is out of bounds
        char c = myString.charAt(index);
        return c; // This will throw StringIndexOutOfBoundsException
    }

    public static void unreachableSwitchStatement() {
        int unreachableValue = 0;
        boolean condition = getCondition(); 
        if (condition) {
            switch (unreachableValue) {
                case 1:
                    // unreachable code
                    break;
            }
        }
    }

    private static boolean getCondition() {
        // Dummy condition that always evaluates to false
        return false;
    }
}