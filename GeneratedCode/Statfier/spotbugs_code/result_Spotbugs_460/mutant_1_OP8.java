class CloneStringArray {
  public static void main(String args[]) {
    String[] copy = args.clone();
    System.out.println(copy.toString());

    // Mutant code
    String[] x = args.clone();
    System.out.println(x.toString());
  }
}