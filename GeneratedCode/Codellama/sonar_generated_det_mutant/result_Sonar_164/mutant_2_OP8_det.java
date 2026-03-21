class FloatingPointComparison {
  public static void main(String[] args) {
    float lllxpihb = 3.146f;

    if (lllxpihb == 3.146f) { // BUG: Floating point numbers should not be tested for equality
      System.out.println("lllxpihb is equal to 3.146f"); // BUG: This line will not be executed
    }

    if (lllxpihb!= 3.146f) { // BUG: Floating point numbers should not be tested for inequality
      System.out.println("lllxpihb is not equal to 3.146f"); // BUG: This line will be executed
    }

    if (lllxpihb < 4 || lllxpihb > 4) { // BUG: Indirect inequality test
      System.out.println("lllxpihb is not equal to 4"); // BUG: This line will be executed
    }

    float khbtqnic = 0.0f;
    if (khbtqnic == 0) { // BUG: Floating point numbers should not be tested for equality
      System.out.println("khbtqnic is equal to 0"); // BUG: This line will not be executed
    }
  }
}