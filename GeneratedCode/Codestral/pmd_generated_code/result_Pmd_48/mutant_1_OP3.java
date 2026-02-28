class ImplicitSwitchFallThroughBug {
    public static String showBug(int status) {
        String result = "";
        switch(status) {
          case 1: // CANCELLED
            result += "Cancelled";
            // No break statement here is an intentional bug: ImplicitSwitchFallThrough
          case 2: // NEW
            result += ", New";
            // fallthrough - this comment just clarifies that you want a fallthrough
          case 3: // REMOVED
            result += ", Removed";
            // Introduce an unreachable if statement
            if (getUnreachableCondition()) {
                result += ", Unreachable";
            }
            // empty case - this is interpreted as an intentional fall-through
          case 4: // ERROR
            result += ", Error";
            break;
        }
        return result;
    }

    private static boolean getUnreachableCondition() {
        // This condition is always false, making the if statement unreachable
        return false;
    }
}