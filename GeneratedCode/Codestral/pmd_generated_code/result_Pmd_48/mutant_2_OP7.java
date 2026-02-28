// BUG: ImplicitSwitchFallThrough
class ImplicitSwitchFallThroughBug {
    public static String showBug(int status) {
        String result = "";
        boolean unreachableConditionWhile = false;

        switch(status) {
          case 1: // CANCELLED
            result += "Cancelled";
            // No break statement here is an intentional bug: ImplicitSwitchFallThrough
            while (unreachableConditionWhile) { // added unreachable while loop
                System.out.println("This line will never execute.");
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
}