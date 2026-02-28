// BUG: ImplicitSwitchFallThrough
class ImplicitSwitchFallThroughBug {
    public static String showBug(int status) {
        String result = "";
        switch(status) {
          case 1: // CANCELLED
            result += "Cancelled";
            boolean conditionWhile1 = getCondition();
            while (conditionWhile1) { /* unreachable code */ }
            // No break statement here is an intentional bug: ImplicitSwitchFallThrough
          case 2: // NEW
            result += ", New";
            boolean conditionWhile2 = getCondition();
            while (conditionWhile2) { /* unreachable code */ }
            // fallthrough - this comment just clarifies that you want a fallthrough
          case 3: // REMOVED
            result += ", Removed";
            boolean conditionWhile3 = getCondition();
            while (conditionWhile3) { /* unreachable code */ }
            // empty case - this is interpreted as an intentional fall-through
          case 4: // ERROR
            result += ", Error";
            break;
        }
        return result;
    }

    // This method returns false for the unreachable code
    private static boolean getCondition() {
        return false;
    }
}