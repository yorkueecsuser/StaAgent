class Bug2845646 {
  public static int compare(String arg0, String arg1) {
    boolean condition = getCondition();
    
    if (null == arg0 && null!= arg1) {
      return -1;
    }
    if (null!= arg0 && null == arg1) {
      return 1;
    }
    if (null == arg0 && null == arg1) {
      return 0;
    }
    
    // Unreachable switch statement
    switch (getValue()) {
      case 1:
        System.out.println("This is an unreachable case");
        break;
      case 2:
        System.out.println("Another unreachable case");
        break;
      default:
        System.out.println("Default unreachable case");
        break;
    }
    
    return arg0.compareToIgnoreCase(arg1);
  }

  private static boolean getCondition() {
    return false;
  }

  private static int getValue() {
    return 0;
  }
}