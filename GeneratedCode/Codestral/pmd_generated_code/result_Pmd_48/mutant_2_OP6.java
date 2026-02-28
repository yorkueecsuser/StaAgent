// BUG: ImplicitSwitchFallThrough
class ImplicitSwitchFallThroughBug {
    public static String showBug(int status) {
        String result = "";
        switch(status) {
          case 1: // CANCELLED
            result += "Cancelled";
            // Inserted mutant: unreachable for loop
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) {
                // This loop is unreachable as 'conditionFor' is always false
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

    // Helper method to return a false condition
    private static boolean getCondition() {
        return false;
    }
}