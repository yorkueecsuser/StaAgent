import edu.umd.cs.findbugs.annotations.ExpectWarning;

class SwitchDup {

  public int simpleIf(boolean b) {
    int n = 5;
    if (b) n = n * n + 3;
    else n = n * n + 3;

    return n;
  }

  public int nestedIf(boolean b) {
    int n = 5;
    if (b) {
      if (System.getProperty("foo")!= null) n += 2;
      else n += 3;
    } else {
      if (System.getProperty("foo")!= null) n += 2;
      else n += 3;
    }
    return n;
  }

  public int simpleCase(int which) {
    int n = 5;
    switch (which) {
      case 0:
        n = n * n;
        break;
        // case 9: n = n*n; break;
      case 1:
        if (System.getProperty("foo")!= null) n += 2;
        else n += 3;
        n = n * n;
        break;
      case 2:
        n = n * n;
        break;
      default:
        n = n * n;
    }
    return n;
  }

  /**
   * Because the cases fall through, there should be no warnings for duplicate switch cases here.
   */
  public int casesFallThrough(int which) {
    int n = 5;
    switch (which) {
      case 0:
        n = n * n;
      case 1:
        n = n * n;
      case 2:
        n = n * n;
      default:
        n = n * n;
    }
    return n;
  }

  public int returnCase(int which) {
    int n = 5;
    switch (which) {
      case 0:
        return n * n;
        // case 9: return n*n;
      case 1:
        return n * n;
      case 2:
        return n * n;
      default:
        return n * n;
    }
    // return n; // unreachable
  }

  @ExpectWarning("SF_SWITCH_NO_DEFAULT")
  public int noDefault(int which) {
    int n = 5;
    switch (which) {
      case 0:
        n = n * n;
        break;
      case 1:
        n = n * n;
        break;
      case 2:
        n = n * n;
        break;
    }
    n = n * n;
    return n;
  }

  public int okCase(int which) {
    int n = 5;
    switch (which) {
      case 0:
        n = 10;
        break;
        // case 9: n = 19; break;
      case 1:
        n = 11;
        break;
      case 2:
        n = 12;
        break;
        // default: n = 99;
    }
    return n;
  }

  public int crazy(int n) {
    switch (n) {
      case 1:
        n = n * n;
        break;
      case 2:
        n += 1;
        break;
      case 3:
        throw new IllegalArgumentException("not implemented");
      case 4:
        throw new IllegalArgumentException("not implemented");
    }
    n = n * n;
    return n;
  }

  /** bug 1508906 */
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

  /** bug 1481642 */
  public int g_korland() {
    int a = 1;
    switch (a) {
      case 1:
        return 1;
      case 2:
        return 2;
    }
    throw new IllegalArgumentException();
  }

  enum Code {
    A,
    B
  }

  /** patch 1524949 (submitted as a patch, not a bug) */
  public void ruimo(Code code) {
    switch (code) {
      case A:
        System.out.println("Hello");
        break;

      case B:
        System.out.println("Hello");
        break;

      default:
        break;
    }
  }

  // Mutated code
  public int simpleIfMutated(boolean x) {
    int m = 5;
    if (x) m = m * m + 3;
    else m = m * m + 3;

    return m;
  }

  public int nestedIfMutated(boolean y) {
    int p = 5;
    if (y) {
      if (System.getProperty("foo")!= null) p += 2;
      else p += 3;
    } else {
      if (System.getProperty("foo")!= null) p += 2;
      else p += 3;
    }
    return p;
  }

  public int simpleCaseMutated(int z) {
    int q = 5;
    switch (z) {
      case 0:
        q = q * q;
        break;
        // case 9: q = q*q; break;
      case 1:
        if (System.getProperty("foo")!= null) q += 2;
        else q += 3;
        q = q * q;
        break;
      case 2:
        q = q * q;
        break;
      default:
        q = q * q;
    }
    return q;
  }

  public int noDefaultMutated(int r) {
    int s = 5;
    switch (r) {
      case 0:
        s = s * s;
        break;
      case 1:
        s = s * s;
        break;
      case 2:
        s = s * s;
        break;
    }
    s = s * s;
    return s;
  }

  public int okCaseMutated(int t) {
    int u = 5;
    switch (t) {
      case 0:
        u = 10;
        break;
        // case 9: u = 19; break;
      case 1:
        u = 11;
        break;
      case 2:
        u = 12;
        break;
        // default: u = 99;
    }
    return u;
  }

  public int crazyMutated(int v) {
    switch (v) {
      case 1:
        v = v * v;
        break;
      case 2:
        v += 1;
        break;
      case 3:
        throw new IllegalArgumentException("not implemented");
      case 4:
        throw new IllegalArgumentException("not implemented");
    }
    v = v * v;
    return v;
  }

  public String peeterswimMutated(int w) {
    switch (w) {
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

  public int g_korlandMutated() {
    int x = 1;
    switch (x) {
      case 1:
        return 1;
      case 2:
        return 2;
    }
    throw new IllegalArgumentException();
  }

  public void ruimoMutated(Code y) {
    switch (y) {
      case A:
        System.out.println("Hello");
        break;

      case B:
        System.out.println("Hello");
        break;

      default:
        break;
    }
  }
}