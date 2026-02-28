class CloneStringArray {
  public static void main(String args[]) {
    String[] copy = args.clone();
    System.out.println(copy.toString());
    // Mutant code starts here
    String[] copyDuplicate = args.clone();
    System.out.println(copyDuplicate.toString());
  }
}