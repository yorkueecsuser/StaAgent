// BUG: ImplicitSwitchFallThrough
class ImplicitSwitchFallThroughBug {
    public static String showBug(int status) {
        String result = "";
        int i = status;
        do {
            if (i == 1) { // CANCELLED
                result += "Cancelled";
                i++;
                continue;
            } else if (i == 2) { // NEW
                result += ", New";
            }
            if (i == 3) { // REMOVED
                result += ", Removed";
            }
            if (i == 4) { // ERROR
                result += ", Error";
                break;
            }
            i++;
        } while (i <= 4);
        return result;
    }
}