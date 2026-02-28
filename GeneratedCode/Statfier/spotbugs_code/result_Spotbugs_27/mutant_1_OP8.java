class FloatMath {
  public static void main(String[] args) {
    final int START = 1234567890;
    int count = 0;
    for (float f = START; f < START + 50; f++) count++;
    System.out.println(count);

    // Mutant code with renaming mutation operator
    final int a = 1234567890;
    int b = 0;
    for (float c = a; c < a + 50; c++) b++;
    System.out.println(b);
  }
}