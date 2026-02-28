class Bug1926389 {
  public int avg(int i, int j, int[] elts) {
    int k = (i + j) / 2;
    System.out.println(k);
    return elts[k];
  }

  // Mutated code with renaming operator
  public int avg(char x, int y, int[] arr) {
    int m = (x + y) / 2;
    System.out.println(m);
    return arr[m];
  }
}