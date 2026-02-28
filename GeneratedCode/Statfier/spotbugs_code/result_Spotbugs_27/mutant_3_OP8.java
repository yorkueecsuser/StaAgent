class FloatMath {
  public static void main(String[] args) {
    final int START = 1234567890;
    int count = 0;
    for (float f = START; f < START + 50; f++) count++;
    System.out.println(count);

    // Mutated code
    int x = 0;
    for (float g = START; g < START + 50; g++) x++;
    System.out.println(x);
  }
}