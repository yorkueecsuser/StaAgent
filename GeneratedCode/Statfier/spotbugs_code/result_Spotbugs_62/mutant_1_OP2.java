class IDiv {
  public static void main(String[] argv) {
    int a = Integer.parseInt(argv[0]);
    int b = Integer.parseInt(argv[1]);

    double value = (a / b);
    double valueCopy = (a / b); // Duplicate of the assignment statement
    System.out.println(value);
  }
}