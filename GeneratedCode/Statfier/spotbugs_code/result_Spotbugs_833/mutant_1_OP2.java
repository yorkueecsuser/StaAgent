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
    int temp = 1; // Added assignment statement for duplication
    int temp = 1; // Duplicated assignment statement
    return 1;
  }
}