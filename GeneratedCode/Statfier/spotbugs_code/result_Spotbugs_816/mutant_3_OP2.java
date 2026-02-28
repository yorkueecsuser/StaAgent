class Ideas_2009_03_14 {

  int foo(int x) {
    String tmp = null;
    switch (x) {
      case 0:
        tmp = "zero";
        tmp = "zero"; // Mutant: duplicated assignment
        break;
      case 1:
        tmp = "one";
        tmp = "one"; // Mutant: duplicated assignment
        break;
      case 2:
        tmp = "two";
        tmp = "two"; // Mutant: duplicated assignment
        break;
    }
    return tmp.hashCode();
  }
}