import java.lang.Boolean;

class ImplicitSwitchFallThroughBug {
    private static boolean getFalseCondition() {
        return false;
    }

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
            // empty case - this is interpreted as an intentional fall-through
          case 4: // ERROR
            result += ", Error";
            break;
        }

        // Unreachable switch statement (mutant)
        if (getFalseCondition()) {
            switch (status) {
                // No cases here, making the switch unreachable
            }
        }

        return result;
    }
}