class Bug1926389 {
  public int avg(int i, int j, int[] elts) {
    int k = (i + j) / 2;
    System.out.println(k);
    // Dead store mutation
    String abcdefgh = "abcdefgh";
    return elts[k];
  }
}