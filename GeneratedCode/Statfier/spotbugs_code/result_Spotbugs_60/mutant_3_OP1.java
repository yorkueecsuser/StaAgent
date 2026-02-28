class Bug2031441 {

  int foo(int size, int priority) {
    int qzjfnxrb; // Dead store variable
    return (int) (size / 2 * Math.pow(0.8, priority));
  }
}