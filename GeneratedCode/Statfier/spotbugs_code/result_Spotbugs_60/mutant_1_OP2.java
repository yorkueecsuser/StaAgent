class Bug2031441 {

  int foo(int size, int priority) {
    int temp = (int) (size / 2 * Math.pow(0.8, priority)); // Original line
    int tempDuplicate = (int) (size / 2 * Math.pow(0.8, priority)); // Duplicated line
    return temp;
  }
}