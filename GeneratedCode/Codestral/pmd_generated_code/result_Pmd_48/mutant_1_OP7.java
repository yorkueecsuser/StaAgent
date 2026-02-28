class ImplicitSwitchFallThroughBug {
    public static String showBug(int status) {
        String result = "";
        switch(status) {
          case 1: // CANCELLED
            result += "Cancelled";
            while (isFalse()) {
                // Unreachable while loop
                System.out.println("This should never print.");
            }
          case 2: // NEW
            result += ", New";
          case 3: // REMOVED
            result += ", Removed";
          case 4: // ERROR
            result += ", Error";
            break;
        }
        return result;
    }

    private static boolean isFalse() {
        return false;
    }
}