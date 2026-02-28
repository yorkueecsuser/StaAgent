class EvilCfg {
  public void foo_FP(int i, int j, boolean b) {
    int k, l, m, n;

    k = b? i : j;
    l = b? k : i;
    m = b? k : l;
    n = b? m : k;
    for (; n < 10; n++) {}

    // Mutant 1: Rename 'k' to 'a'
    int a = b? i : j;
    int lb = b? a : i;
    int mb = b? a : lb;
    int nb = b? mb : a;
    for (; nb < 10; nb++) {}

    // Mutant 2: Rename 'l' to 'c'
    int kc = b? i : j;
    int c = b? kc : i;
    int mc = b? kc : c;
    int nc = b? mc : kc;
    for (; nc < 10; nc++) {}

    // Mutant 3: Rename'm' to 'd'
    int kd = b? i : j;
    int ld = b? kd : i;
    int d = b? kd : ld;
    int nd = b? d : kd;
    for (; nd < 10; nd++) {}

    // Mutant 4: Rename 'n' to 'e'
    int ke = b? i : j;
    int le = b? ke : i;
    int me = b? ke : le;
    int e = b? me : ke;
    for (; e < 10; e++) {}
  }
}