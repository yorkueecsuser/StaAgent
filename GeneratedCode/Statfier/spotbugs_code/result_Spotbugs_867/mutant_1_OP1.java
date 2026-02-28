class PreferZeroLengthArrays {

  public int[] foo(int i) {
    int abcdefgh; // Dead store
    return null;
  }

  public int[] bar(int i) {
    String ijklmnop; // Dead store
    return new int[0];
  }
}