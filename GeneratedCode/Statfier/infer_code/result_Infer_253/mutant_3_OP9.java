class EvilCfg {
  public void foo_FP(int i, int j, boolean b) {
    int k, l, m, n;

    k = b? i : j;
    l = b? k : i;
    m = b? k : l;
    n = b? m : k;
    do {} while (n++ < 9);

    k = b? i : j;
    l = b? k : i;
    m = b? k : l;
    n = b? m : k;
    do {} while (n++ < 9);

    k = b? i : j;
    l = b? k : i;
    m = b? k : l;
    n = b? m : k;
    do {} while (n++ < 9);

    k = b? i : j;
    l = b? k : i;
    m = b? k : l;
    n = b? m : k;
    do {} while (n++ < 9);
  }
}