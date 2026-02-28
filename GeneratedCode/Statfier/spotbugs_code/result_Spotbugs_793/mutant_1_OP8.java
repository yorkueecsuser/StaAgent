class Issue758 {

  public void method() {
    Object[] array = new String[3];
    Object[] objects = (Object[]) array;

    // Mutant 1: Renaming 'array' to 'b'
    Object[] b = new String[3];
    Object[] c = (Object[]) b;

    // Mutant 2: Renaming 'objects' to 'd'
    Object[] array2 = new String[3];
    Object[] d = (Object[]) array2;
  }
}