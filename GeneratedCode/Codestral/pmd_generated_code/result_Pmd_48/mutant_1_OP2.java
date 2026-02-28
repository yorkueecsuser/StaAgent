// BUG: ImplicitSwitchFallThrough
class ImplicitSwitchFallThroughBug {
    public static String showBug(int status) {
        String result = "";
        switch(status) {
          case 1: // CANCELLED
            result += "Cancelled";
            // No break statement here is an intentional bug: ImplicitSwitchFallThrough
            result += "Cancelled"; // Duplicated line
          case 2: // NEW
            result += ", New";
            // fallthrough - this comment just clarifies that you want a fallthrough
            result += ", New"; // Duplicated line
          case 3: // REMOVED
            result += ", Removed";
            // empty case - this is interpreted as an intentional fall-through
            result += ", Removed"; // Duplicated line
          case 4: // ERROR
            result += ", Error";
            result += ", Error"; // Duplicated line
            break;
        }
        return result;
    }
}