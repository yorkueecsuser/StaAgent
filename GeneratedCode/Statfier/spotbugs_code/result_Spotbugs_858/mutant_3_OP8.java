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
  public int simpleIfMutated(boolean b) {
    int x = 5;
    if (b) x = x * x + 3;
    else x = x * x + 3;

    return x;
  }

  public int nestedIfMutated(boolean b) {
    int y = 5;
    if (b) {
      if (System.getProperty("foo")!= null) y += 2;
      else y += 3;
    } else {
      if (System.getProperty("foo")!= null) y += 2;
      else y += 3;
    }
    return y;
  }

  public int simpleCaseMutated(int which) {
    int z = 5;
    switch (which) {
      case 0:
        z = z * z;
        break;
        // case 9: z = z*z; break;
      case 1:
        if (System.getProperty("foo")!= null) z += 2;
        else z += 3;
        z = z * z;
        break;
      case 2:
        z = z * z;
        break;
      default:
        z = z * z;
    }
    return z;
  }

  public int noDefaultMutated(int which) {
    int w = 5;
    switch (which) {
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

  public int okCaseMutated(int which) {
    int v = 5;
    switch (which) {
      case 0:
        v = 10;
        break;
        // case 9: v = 19; break;
      case 1:
        v = 11;
        break;
      case 2:
        v = 12;
        break;
        // default: v = 99;
    }
    return v;
  }

  public int crazyMutated(int n) {
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

  public String peeterswimMutated(int index) {
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

  public int g_korlandMutated() {
    int q = 1;
    switch (q) {
      case 1:
        return 1;
      case 2:
        return 2;
    }
    throw new IllegalArgumentException();
  }

  public void ruimoMutated(Code code) {
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
}