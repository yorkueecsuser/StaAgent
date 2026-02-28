// BUG: ImplicitSwitchFallThrough
class ImplicitSwitchFallThroughBug {
    private static boolean getCondition() {
        // This method returns false to make the if-else branch unreachable
        return false;
    }

    public static String showBug(int status) {
        String result = "";

        // Mutant: Unreachable if-else statement
        if (getCondition()) {
            // This branch is unreachable
            System.out.println("Unreachable branch");
        } else {
            // Original code
            switch(status) {
                case 1: // CANCELLED
                    result += "Cancelled";
                    // No break statement here is an intentional bug: ImplicitSwitchFallThrough
                case 2: // NEW
                    result += ", New";
                    // fallthrough - this comment just clarifies that you want a fallthrough
                case 3: // REMOVED
                    result += ", Removed";
                    // empty case - this is interpreted as an intentional fall-through
                case 4: // ERROR
                    result += ", Error";
                    break;
            }
        }

        return result;
    }
}