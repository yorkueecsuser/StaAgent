class CompareToFailure {

  public static void main(String[] args) {}

  public int compareTo(CompareToFailure ctf) {
    return 0; // Duplicate of the return statement
    return 0;
  }

  // public int compareTo(Object o) {
  // return 0;
  // }

  public int recurso() {
    recurso(); // This is a method call, not an assignment statement, so no duplication here
    return 1; // Duplicate of the return statement
    return 1;
  }
}