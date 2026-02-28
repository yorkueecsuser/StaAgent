class Bug1926389 {
  public int avg(int i, int j, int[] elts) {
    int k = (i + j) / 2;
    System.out.println(k);
    return elts[k];
  }

  // Mutant code with renaming of variable 'k' to'm'
  public int avgMutant(int i, int j, int[] elts) {
    int m = (i + j) / 2;
    System.out.println(m);
    return elts[m];
  }
}