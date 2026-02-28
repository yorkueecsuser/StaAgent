class Issue758 {

  public void method() {
    Object[] array = new String[3];
    Object[] objects = (Object[]) array;

    // Mutant code
    Object[] b = new String[3];
    Object[] c = (Object[]) b;
  }
}