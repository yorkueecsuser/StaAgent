class CloneStringArray {
  public static void main(String args[]) {
    String[] copy = args.clone();
    System.out.println(copy.toString());

    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will return false
    }
  }

  private static boolean getCondition() {
    return false;
  }
}