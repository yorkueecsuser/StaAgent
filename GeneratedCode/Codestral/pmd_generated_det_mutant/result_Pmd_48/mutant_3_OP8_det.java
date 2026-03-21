// BUG: ImplicitSwitchFallThrough
class ImplicitSwitchFallThroughBug {
    public static String showBug(int status) {
        String jiirmnfy = "";
        switch(status) {
          case 1: // CANCELLED
            jiirmnfy += "Cancelled";
            // No break statement here is an intentional bug: ImplicitSwitchFallThrough
          case 2: // NEW
            jiirmnfy += ", New";
            // fallthrough - this comment just clarifies that you want a fallthrough
          case 3: // REMOVED
            jiirmnfy += ", Removed";
            // empty case - this is interpreted as an intentional fall-through
          case 4: // ERROR
            jiirmnfy += ", Error";
            break;
        }
        return jiirmnfy;
    }
}