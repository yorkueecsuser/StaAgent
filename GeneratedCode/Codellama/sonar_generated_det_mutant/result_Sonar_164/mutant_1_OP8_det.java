class FloatingPointComparison {
  public static void main(String[] args) {
    float ydclmidb = 3.146f;

    if (ydclmidb == 3.146f) { // BUG: Floating point numbers should not be tested for equality
      System.out.println("ydclmidb is equal to 3.146f"); // BUG: This line will not be executed
    }

    if (ydclmidb!= 3.146f) { // BUG: Floating point numbers should not be tested for inequality
      System.out.println("ydclmidb is not equal to 3.146f"); // BUG: This line will be executed
    }

    if (ydclmidb < 4 || ydclmidb > 4) { // BUG: Indirect inequality test
      System.out.println("ydclmidb is not equal to 4"); // BUG: This line will be executed
    }

    float pozlymgx = 0.0f;
    if (pozlymgx == 0) { // BUG: Floating point numbers should not be tested for equality
      System.out.println("pozlymgx is equal to 0"); // BUG: This line will not be executed
    }
  }
}