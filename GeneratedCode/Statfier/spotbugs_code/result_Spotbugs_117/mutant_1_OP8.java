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

  // Mutant 1: Renaming 'b' to 'x'
  public void throwNullValueReportMutant1(boolean x) throws Throwable {

    Throwable t = null;

    if (x) {
      System.out.println("Yeah");
    }

    throw t;
  }

  public void throwPossiblyNullReport(Throwable t) throws Throwable {
    if (t!= null) {
      System.out.println("ok");
    }

    throw t;
  }

  // Mutant 2: Renaming 't' to 'a'
  public void throwPossiblyNullReportMutant2(Throwable a) throws Throwable {
    if (a!= null) {
      System.out.println("ok");
    }

    throw a;
  }
}