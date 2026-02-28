// BUG: ImplicitSwitchFallThrough
class ImplicitSwitchFallThroughBug {
    private static boolean getFalseCondition() {
        return false;
    }

    public static String showBug(int status) {
        String result = "";

        // Added mutant: Unreachable switch statement
        if (getFalseCondition()) {
            switch(status) {
                case 5:
                case 6:
                case 7:
                    result += ", Unreachable";
                    break;
            }
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
}