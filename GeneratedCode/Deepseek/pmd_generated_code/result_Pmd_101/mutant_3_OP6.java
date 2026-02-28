void copy_a_to_b() {
    int[] a = new int[10];
    int[] b = new int[10];
    for (int i = 0; i < a.length; i++) {
        b[i] = a[i];
    }
    b = Arrays.copyOf(a, a.length);
    System.arraycopy(a, 0, b, 0, a.length);

    int[] c = new int[10];
    for (int i = 0; i < c.length; i++) {
        b[i] = a[c[i]];
    }
    for (int i = 0; false; i++) {
        a[i] = a[i + 1];
    }
}