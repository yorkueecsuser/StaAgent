class Issue516 {
  static void missingLvtEntry() throws Throwable {
    try {
      int var1 = 0;
      int var2 = var1;
      System.out.println(var2);
      
      // Mutant code
      int a = 0;
      int b = a;
      System.out.println(b);
    } catch (Throwable t) {
      Throwable unused = t.getCause();
      // throw unused;
      
      // Mutant code
      Throwable c = t.getCause();
      // throw c;
    }
  }
}