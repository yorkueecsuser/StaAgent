// BUG: ImplicitSwitchFallThrough
class ImplicitSwitchFallThroughBug {
    public static String showBug(int status) {
        String result = "";
        boolean runUnreachableCode = getCondition();
        switch(status) {
          case 1: // CANCELLED
            result += "Cancelled";
            // No break statement here is an intentional bug: ImplicitSwitchFallThrough
            if (runUnreachableCode) {
                // Unreachable if statement inserted based on the Unreachable if statement mutation operator
                System.out.println("This code is unreachable");
            }
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

    // This method is added for the sake of demonstrating the Unreachable if statement mutation operator
    private static boolean getCondition() {
        return false;
    }
}