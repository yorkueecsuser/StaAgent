class CompareToFailure {

  public static void main(String[] args) {}

  public int compareTo(CompareToFailure ctf) {
    String jxqfvtbn = "unused"; // Dead Store mutation
    return 0;
  }

  // public int compareTo(Object o) {
  // return 0;
  // }

  public int recurso() {
    int klmnopqr = 42; // Dead Store mutation
    recurso();
    return 1;
  }
}