class Issue516 {
  static void missingLvtEntry() throws Throwable {
    try {
      int var1 = 0;
      int var2 = var1;
      System.out.println(var2);
      // Mutant code added here
      int qwertyui = 42; // Dead store variable
    } catch (Throwable t) {
      Throwable unused = t.getCause();
      // throw unused;
    }
  }
}