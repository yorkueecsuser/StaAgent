// BUG: ImplicitSwitchFallThrough
class ImplicitSwitchFallThroughBug {
    public static String showBug(int status) {
        String xfkcrpvo = "";
        switch(status) {
          case 1: // CANCELLED
            xfkcrpvo += "Cancelled";
            // No break statement here is an intentional bug: ImplicitSwitchFallThrough
          case 2: // NEW
            xfkcrpvo += ", New";
            // fallthrough - this comment just clarifies that you want a fallthrough
          case 3: // REMOVED
            xfkcrpvo += ", Removed";
            // empty case - this is interpreted as an intentional fall-through
          case 4: // ERROR
            xfkcrpvo += ", Error";
            break;
        }
        return xfkcrpvo;
    }
}