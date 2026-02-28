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
  public int simpleIfMutant(boolean x) {
    int m = 5;
    if (x) m = m * m + 3;
    else m = m * m + 3;

    return m;
  }

  public int nestedIfMutant(boolean y) {
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

  public int simpleCaseMutant(int z) {
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

  public int casesFallThroughMutant(int r) {
    int s = 5;
    switch (r) {
      case 0:
        s = s * s;
      case 1:
        s = s * s;
      case 2:
        s = s * s;
      default:
        s = s * s;
    }
    return s;
  }

  public int returnCaseMutant(int t) {
    int u = 5;
    switch (t) {
      case 0:
        return u * u;
        // case 9: return u*u;
      case 1:
        return u * u;
      case 2:
        return u * u;
      default:
        return u * u;
    }
    // return u; // unreachable
  }

  @ExpectWarning("SF_SWITCH_NO_DEFAULT")
  public int noDefaultMutant(int v) {
    int w = 5;
    switch (v) {
      case 0:
        w = w * w;
        break;
      case 1:
        w = w * w;
        break;
      case 2:
        w = w * w;
        break;
    }
    w = w * w;
    return w;
  }

  public int okCaseMutant(int x) {
    int y = 5;
    switch (x) {
      case 0:
        y = 10;
        break;
        // case 9: y = 19; break;
      case 1:
        y = 11;
        break;
      case 2:
        y = 12;
        break;
        // default: y = 99;
    }
    return y;
  }

  public int crazyMutant(int z) {
    switch (z) {
      case 1:
        z = z * z;
        break;
      case 2:
        z += 1;
        break;
      case 3:
        throw new IllegalArgumentException("not implemented");
      case 4:
        throw new IllegalArgumentException("not implemented");
    }
    z = z * z;
    return z;
  }

  /** bug 1508906 */
  public String peeterswimMutant(int a) {
    switch (a) {
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
  public int g_korlandMutant() {
    int b = 1;
    switch (b) {
      case 1:
        return 1;
      case 2:
        return 2;
    }
    throw new IllegalArgumentException();
  }

  /** patch 1524949 (submitted as a patch, not a bug) */
  public void ruimoMutant(Code c) {
    switch (c) {
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