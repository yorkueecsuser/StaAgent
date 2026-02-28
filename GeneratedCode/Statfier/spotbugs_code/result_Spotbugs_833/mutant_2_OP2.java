class CompareToFailure {

  public static void main(String[] args) {}

  public int compareTo(CompareToFailure ctf) {
    return 0;
  }

  // public int compareTo(Object o) {
  // return 0;
  // }

  public int recurso() {
    int x = 1; // Added assignment statement for demonstration
    int x = 1; // Duplicated assignment statement
    recurso();
    return 1;
  }
}