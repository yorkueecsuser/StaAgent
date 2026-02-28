class CompareToFailure {

  public static void main(String[] args) {}

  public int compareTo(CompareToFailure ctf) {
    return 0;
  }

  // public int compareTo(Object o) {
  // return 0;
  // }

  public int recurso() {
    recurso();
    return 1;
  }

  // Mutated code with renaming operator
  public int recursoa() {
    recursoa();
    return 1;
  }
}