class TestNonNull6b {
  public static void main(String args[]) {
    // Original code
    System.out.println(TestNonNull6a.f(null));

    // Inserted unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        System.out.println("This is unreachable code");
        break;
    }
  }

  // Method to provide a dynamically determined false value
  private static boolean getAlwaysFalse() {
    return false;
  }
}