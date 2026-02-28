class FloatMath {
  public static void main(String[] args) {
    final int START = 1234567890;
    int count = 0;
    float f = START;
    do {
      count++;
    } while (f++ < START + 50);
    System.out.println(count);
  }
}