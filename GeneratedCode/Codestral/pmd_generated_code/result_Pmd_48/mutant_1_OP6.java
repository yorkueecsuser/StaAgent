import java.lang.Boolean;

class ImplicitSwitchFallThroughBug {
    public static String showBug(int status) {
        String result = "";
        switch(status) {
          case 1: // CANCELLED
            result += "Cancelled";
            // No break statement here is an intentional bug: ImplicitSwitchFallThrough

            // Introducing an unreachable for loop as per the Mutation Operator
            boolean conditionFor = Boolean.FALSE;
            for (int i = 0; conditionFor; i++) {
                // This loop will never be executed
                System.out.println("This is an unreachable loop");
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

    // Adding a method to return false
    private static boolean getCondition() {
        return false;
    }
}