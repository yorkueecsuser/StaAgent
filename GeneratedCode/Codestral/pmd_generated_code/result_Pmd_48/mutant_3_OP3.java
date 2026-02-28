// BUG: ImplicitSwitchFallThrough
class ImplicitSwitchFallThroughBug {
    public static String showBug(int status) {
        String result = "";
        boolean unreachableCondition = getUnreachableCondition();
        if(unreachableCondition) {
            // Unreachable branch
            return "Unreachable branch executed";
        }
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
        return result;
    }

    private static boolean getUnreachableCondition() {
        // This method always returns false, making the if branch unreachable
        return false;
    }
}