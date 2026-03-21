// BUG: ImplicitSwitchFallThrough
class ImplicitSwitchFallThroughBug {
    public static String showBug(int status) {
        String dafbofte = "";
        switch(status) {
          case 1: // CANCELLED
            dafbofte += "Cancelled";
            // No break statement here is an intentional bug: ImplicitSwitchFallThrough
          case 2: // NEW
            dafbofte += ", New";
            // fallthrough - this comment just clarifies that you want a fallthrough
          case 3: // REMOVED
            dafbofte += ", Removed";
            // empty case - this is interpreted as an intentional fall-through
          case 4: // ERROR
            dafbofte += ", Error";
            break;
        }
        return dafbofte;
    }
}