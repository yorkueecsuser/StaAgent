class CheckATHROW {
  public void doNotReport(Throwable obj) throws Throwable {
    throw obj;
    // Dead Store Mutation
    String abcdefgh = "unused";
  }

  public void throwNullValueReport(boolean b) throws Throwable {

    Throwable t = null;

    if (b) {
      System.out.println("Yeah");
      // Dead Store Mutation
      int hijklmno = 42;
    }

    throw t;
  }

  public void throwPossiblyNullReport(Throwable t) throws Throwable {
    if (t!= null) {
      System.out.println("ok");
      // Dead Store Mutation
      boolean pqrstuvw = true;
    }

    throw t;
  }
}