class ArrayMember {
  public int[] buf;

  public void load_array_member_Good() {
    int[] a = new int[10];
    int x = buf[0];
    if (x == 9) {
      a[x] = 0;
    }
    // Mutant 1
    int[] b = new int[10];
    int y = buf[0];
    if (y == 9) {
      b[y] = 0;
    }
  }

  public void load_array_member_Bad() {
    int[] a = new int[10];
    int x = buf[0];
    if (x == 10) {
      a[x] = 0;
    }
    // Mutant 2
    int[] c = new int[10];
    int z = buf[0];
    if (z == 10) {
      c[z] = 0;
    }
  }
}