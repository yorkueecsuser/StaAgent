class Issue758 {

  public void method() {
    Object[] array = new String[3];
    Object[] objects = (Object[]) array;
    // Mutated line - duplicated assignment statement
    Object[] objectsDuplicate = (Object[]) array;
  }
}