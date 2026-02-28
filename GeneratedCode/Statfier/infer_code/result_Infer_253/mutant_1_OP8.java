class EvilCfg {
  public void foo_FP(int i, int j, boolean b) {
    int k, l, m, n;

    k = b? i : j;
    l = b? k : i;
    m = b? k : l;
    n = b? m : k;
    for (; n < 10; n++) {}

    // Mutant 1: Renaming variable 'k' to 'x'
    int x = b? i : j;
    int y = b? x : i;
    int z = b? x : y;
    int w = b? z : x;
    for (; w < 10; w++) {}

    // Mutant 2: Renaming variable 'l' to 'a'
    int p = b? i : j;
    int a = b? p : i;
    int q = b? p : a;
    int r = b? q : p;
    for (; r < 10; r++) {}

    // Mutant 3: Renaming variable'm' to 'b'
    int s = b? i : j;
    int t = b? s : i;
    int b_var = b? s : t;
    int u = b? b_var : s;
    for (; u < 10; u++) {}

    // Mutant 4: Renaming variable 'n' to 'c'
    int v = b? i : j;
    int d = b? v : i;
    int e = b? v : d;
    int c = b? e : v;
    for (; c < 10; c++) {}
  }
}