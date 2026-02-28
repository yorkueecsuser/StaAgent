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

    private static boolean getCondition() {
        return false;
    }

    private static int getValue() {
        return 0;
    }

    public static void unreachableSwitchStatementMutant() {
        boolean condition = getCondition();
        int value = getValue();
        if (condition) {
            switch(value) {
                case 1: 
                    System.out.println("MUTANT");
                    break;
                default: 
                    break;
            }
        } else {
            switch(value) {
                case 1: 
                    System.out.println("NOT MUTANT");
                    break;
                default: 
                    break;
            }
        }
    }
}