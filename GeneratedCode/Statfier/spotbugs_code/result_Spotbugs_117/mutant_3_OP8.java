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

  // Mutant 1: Renaming variable 't' to 'a'
  public void throwNullValueReportMutant1(boolean b) throws Throwable {

    Throwable a = null;

    if (b) {
      System.out.println("Yeah");
    }

    throw a;
  }

  public void throwPossiblyNullReport(Throwable t) throws Throwable {
    if (t!= null) {
      System.out.println("ok");
    }

    throw t;
  }

  // Mutant 2: Renaming variable 't' to 'x'
  public void throwPossiblyNullReportMutant2(Throwable x) throws Throwable {
    if (x!= null) {
      System.out.println("ok");
    }

    throw x;
  }
}