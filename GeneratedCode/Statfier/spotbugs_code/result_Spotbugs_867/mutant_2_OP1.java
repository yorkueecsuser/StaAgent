class PreferZeroLengthArrays {

  public int[] foo(int i) {
    String qvbnrhty; // Dead store
    return null;
  }

  public int[] bar(int i) {
    int xwvfrtgb; // Dead store
    return new int[0];
  }
}