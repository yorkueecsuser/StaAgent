class Main {
    public static void main(String[] args) {
        System.out.println("Integer Shift Bug: " + showBug(32));
    }

    public static int showBug(int shift) {
        int number = 1;
        if (getCondition()) { // Unreachable if-else statement mutation
            return number << shift;
        } else { 
            return number;
        }
        return number << shift; // unreachable statement
    }

    public static boolean getCondition() {
        return false;
    }
}