class Issue516 {
  static void missingLvtEntry() throws Throwable {
    try {
      int var1 = 0;
      int var2 = var1;
      System.out.println(var2);
      // Dead Store Mutation
      int ijklmnop = 42; // Unused variable declaration
    } catch (Throwable t) {
      Throwable unused = t.getCause();
      // throw unused;
    }
  }
}