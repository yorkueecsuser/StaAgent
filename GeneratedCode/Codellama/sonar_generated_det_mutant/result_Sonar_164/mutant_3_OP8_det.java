class FloatingPointComparison {
  public static void main(String[] args) {
    float qhxqlqlc = 3.146f;

    if (qhxqlqlc == 3.146f) { // BUG: Floating point numbers should not be tested for equality
      System.out.println("qhxqlqlc is equal to 3.146f"); // BUG: This line will not be executed
    }

    if (qhxqlqlc!= 3.146f) { // BUG: Floating point numbers should not be tested for inequality
      System.out.println("qhxqlqlc is not equal to 3.146f"); // BUG: This line will be executed
    }

    if (qhxqlqlc < 4 || qhxqlqlc > 4) { // BUG: Indirect inequality test
      System.out.println("qhxqlqlc is not equal to 4"); // BUG: This line will be executed
    }

    float gzjplnku = 0.0f;
    if (gzjplnku == 0) { // BUG: Floating point numbers should not be tested for equality
      System.out.println("gzjplnku is equal to 0"); // BUG: This line will not be executed
    }
  }
}