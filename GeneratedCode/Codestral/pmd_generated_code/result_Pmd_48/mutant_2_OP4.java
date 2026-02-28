// BUG: ImplicitSwitchFallThrough
class ImplicitSwitchFallThroughBug {
    public static String showBug(int status) {
        String result = "";
        switch(status) {
          case 1: // CANCELLED
            result += "Cancelled";
            boolean unreachableCondition = getUnreachableCondition(); // Non-final variable used for condition
            if (unreachableCondition) {
                result += ", Unreachable";
            } else {
                result += ", Reachable"; // This branch is reachable for demonstration purposes
            }
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
        return result;
    }

    // Method to return false for unreachable condition
    private static boolean getUnreachableCondition() {
        return false;
    }
}