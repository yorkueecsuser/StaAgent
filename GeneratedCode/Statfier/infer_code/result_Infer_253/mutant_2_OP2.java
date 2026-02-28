class EvilCfg {
  public void foo_FP(int i, int j, boolean b) {
    int k, l, m, n;

    k = b? i : j;
    k = b? i : j; // Mutant 1
    l = b? k : i;
    l = b? k : i; // Mutant 2
    m = b? k : l;
    m = b? k : l; // Mutant 3
    n = b? m : k;
    n = b? m : k; // Mutant 4
    for (; n < 10; n++) {}

    k = b? i : j;
    k = b? i : j; // Mutant 5
    l = b? k : i;
    l = b? k : i; // Mutant 6
    m = b? k : l;
    m = b? k : l; // Mutant 7
    n = b? m : k;
    n = b? m : k; // Mutant 8
    for (; n < 10; n++) {}

    k = b? i : j;
    k = b? i : j; // Mutant 9
    l = b? k : i;
    l = b? k : i; // Mutant 10
    m = b? k : l;
    m = b? k : l; // Mutant 11
    n = b? m : k;
    n = b? m : k; // Mutant 12
    for (; n < 10; n++) {}

    k = b? i : j;
    k = b? i : j; // Mutant 13
    l = b? k : i;
    l = b? k : i; // Mutant 14
    m = b? k : l;
    m = b? k : l; // Mutant 15
    n = b? m : k;
    n = b? m : k; // Mutant 16
    for (; n < 10; n++) {}
  }
}