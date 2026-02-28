class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String s = "hello world";
        int index = s.indexOf('d'); // BUG: UseIndexOfChar
		
		// Mutated Java Code
		boolean condition = getCondition(); // Added a new method call ensuring condition is not a compile-time constant
        if (condition) {
            int unreachableSwitchStatement = 0; // Added an unreachable switch statement
            switch (unreachableSwitchStatement) {
                case 0:
                    System.out.println("This is a mutation");
                    break;
                default:
                    // This is unreachable
                    System.out.println("This is unreachable");
                    break;
            }
        }
    }

    public static boolean getCondition() {
        // This method ensures the condition is not a compile-time constant
        return false;
    }
}