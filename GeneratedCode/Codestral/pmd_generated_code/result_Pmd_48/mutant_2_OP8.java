class ImplicitSwitchFallThroughBug {
    public static String showBug(int a) {
        String r = "";
        switch(a) {
          case 1: // CANCELLED
            r += "Cancelled";
            // No break statement here is an intentional bug: ImplicitSwitchFallThrough
          case 2: // NEW
            r += ", New";
            // fallthrough - this comment just clarifies that you want a fallthrough
          case 3: // REMOVED
            r += ", Removed";
            // empty case - this is interpreted as an intentional fall-through
          case 4: // ERROR
            r += ", Error";
            break;
        }
        return r;
    }
}