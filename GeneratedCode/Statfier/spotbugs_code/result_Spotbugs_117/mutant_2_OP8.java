class CheckATHROW {
  public void doNotReport(Throwable obj) throws Throwable {
    throw obj;
  }

  public void throwNullValueReport(boolean b) throws Throwable {

    Throwable t = null;

    if (b) {
      System.out.println("Yeah");
    }

    throw t;
  }

  // Mutated code
  public void throwNullValueReport(boolean x) throws Throwable {

    Throwable y = null;

    if (x) {
      System.out.println("Yeah");
    }

    throw y;
  }

  public void throwPossiblyNullReport(Throwable t) throws Throwable {
    if (t!= null) {
      System.out.println("ok");
    }

    throw t;
  }

  // Mutated code
  public void throwPossiblyNullReport(Throwable u) throws Throwable {
    if (u!= null) {
      System.out.println("ok");
    }

    throw u;
  }
}