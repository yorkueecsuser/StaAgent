class EvilCfg {
  public void foo_FP(int i, int j, boolean b) {
    int k, l, m, n;

    k = b? i : j;
    l = b? k : i;
    m = b? k : l;
    n = b? m : k;
    for (; n < 10; n++) {}

    int a = b? i : j;
    int c = b? a : i;
    int d = b? a : c;
    int e = b? d : a;
    for (; e < 10; e++) {}

    int f = b? i : j;
    int g = b? f : i;
    int h = b? f : g;
    int p = b? h : f;
    for (; p < 10; p++) {}

    int q = b? i : j;
    int r = b? q : i;
    int s = b? q : r;
    int t = b? s : q;
    for (; t < 10; t++) {}
  }
}