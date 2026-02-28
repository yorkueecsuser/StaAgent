// BUG: ImplicitSwitchFallThrough
class ImplicitSwitchFallThroughBug {
    public static String showBug(int status) {
        String resultVar = "";
        switch(status) {
          case 1: // CANCELLED
            resultVar += "Cancelled";
            // No break statement here is an intentional bug: ImplicitSwitchFallThrough
          case 2: // NEW
            resultVar += ", New";
            // fallthrough - this comment just clarifies that you want a fallthrough
          case 3: // REMOVED
            resultVar += ", Removed";
            // empty case - this is interpreted as an intentional fall-through
          case 4: // ERROR
            resultVar += ", Error";
            break;
        }
        String result = resultVar; // Mutant: Renaming variable'resultVar' to'result'
        return result;
    }
}