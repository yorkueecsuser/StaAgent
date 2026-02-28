class FloatMath {
  public static void main(String[] args) {
    final int START = 1234567890;
    int count = 0;
    for (float f = START; f < START + 50; f++) count++;
    count = count; // Mutant: duplicated assignment statement
    System.out.println(count);
  }
}