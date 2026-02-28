class Issue516 {
  static void missingLvtEntry() throws Throwable {
    try {
      int var1 = 0;
      int var2 = var1;
      System.out.println(var2);
      // Dead store mutation
      int abcdefgh = 42; // Unique unused variable declaration
    } catch (Throwable t) {
      Throwable unused = t.getCause();
      // throw unused;
    }
  }
}