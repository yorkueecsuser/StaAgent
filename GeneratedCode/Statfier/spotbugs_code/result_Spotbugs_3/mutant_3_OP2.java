class Bug1926389 {
  public int avg(int i, int j, int[] elts) {
    int k = (i + j) / 2;
    int k_duplicate = (i + j) / 2; // Duplicate assignment
    System.out.println(k);
    return elts[k];
  }
}