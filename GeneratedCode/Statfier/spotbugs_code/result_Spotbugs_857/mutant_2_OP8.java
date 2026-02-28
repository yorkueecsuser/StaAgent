class DuplicateBranches {
  public int doit(boolean b, int i, int j) {
    int z;
    if (b) {
      int k = i * j;
      z = k / 100;
    } else {
      int k = i * j;
      z = k / 100;
    }
    return z;
  }

  // Mutant 1: Renamed 'b' to 'x'
  public int doit_x(boolean x, int i, int j) {
    int z;
    if (x) {
      int k = i * j;
      z = k / 100;
    } else {
      int k = i * j;
      z = k / 100;
    }
    return z;
  }

  public int doit2(int i, int j) {
    switch (i) {
      case 0:
        j = j + 1;
        if (i < j) j = i;
        break;

      case 1:
        j = j + 1;
        if (i < j) j = i;
        break;

      case 2:
        j = j + 1;
        if (i < j) j = i;
        break;

      default:
        j = j + 1;
        if (i < j) j = i;
        break;
    }
    return j;
  }

  // Mutant 2: Renamed 'j' to'm'
  public int doit2_m(int i, int m) {
    switch (i) {
      case 0:
        m = m + 1;
        if (i < m) m = i;
        break;

      case 1:
        m = m + 1;
        if (i < m) m = i;
        break;

      case 2:
        m = m + 1;
        if (i < m) m = i;
        break;

      default:
        m = m + 1;
        if (i < m) m = i;
        break;
    }
    return m;
  }

  public int doit3(int i, int j) {
    switch (i) {
      case 1:
        j = i + 1;
        break;

      case 10:
        j = i + 1;
        break;

      case 100:
        j = i + 1;
        break;

      default:
        j = i + 1;
        break;
    }
    return j;
  }

  // Mutant 3: Renamed 'i' to 'n'
  public int doit3_n(int n, int j) {
    switch (n) {
      case 1:
        j = n + 1;
        break;

      case 10:
        j = n + 1;
        break;

      case 100:
        j = n + 1;
        break;

      default:
        j = n + 1;
        break;
    }
    return j;
  }

  /** false positive?? bug1481642 */
  public int g_korland(int a) {
    // int a = 1;
    switch (a) {
      case 1:
        return 1;
      case 2:
        return 2;
    }
    return -1;
  }

  // Mutant 4: Renamed 'a' to 'c'
  public int g_korland_c(int c) {
    // int a = 1;
    switch (c) {
      case 1:
        return 1;
      case 2:
        return 2;
    }
    return -1;
  }

  /** false positive?? bug1508906 */
  public String peeterswim(int index) {
    switch (index) {
      case 0:
        return "0";
      case 1:
        return "1";
      case 2:
        return "2";
      default:
        return null;
    }
  }

  // Mutant 5: Renamed 'index' to 'q'
  public String peeterswim_q(int q) {
    switch (q) {
      case 0:
        return "0";
      case 1:
        return "1";
      case 2:
        return "2";
      default:
        return null;
    }
  }
}