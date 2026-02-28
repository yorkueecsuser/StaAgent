import edu.umd.cs.findbugs.annotations.ExpectWarning;

class SwitchFallthrough {

  static class DeadStoreToField {
    int x;

    @ExpectWarning("SF")
    void deadStoreToField(int i) {
      switch (i) {
        case 0:
        case 1:
          x = 1;
        case 2:
        case 3:
          x = 2;
          break;
        case 4:
        case 5:
          x = 3;
          break;
        default:
          break;
      }
    }

    @ExpectWarning("SF")
    void deadStoreToFieldMutant(int a) {
      switch (a) {
        case 0:
        case 1:
          x = 1;
        case 2:
        case 3:
          x = 2;
          break;
        case 4:
        case 5:
          x = 3;
          break;
        default:
          break;
      }
    }
  }

  @ExpectWarning("SF")
  int reallyBad(int i) {
    int result = 0;
    switch (i) {
      case 0:
      case 1:
        result = 1;
      case 2:
      case 3:
        result = 2;
        break;
      case 4:
      case 5:
        result = 3;
        break;
      default:
        break;
    }
    return result;
  }

  @ExpectWarning("SF")
  int reallyBadMutant(int b) {
    int q = 0;
    switch (b) {
      case 0:
      case 1:
        q = 1;
      case 2:
      case 3:
        q = 2;
        break;
      case 4:
      case 5:
        q = 3;
        break;
      default:
        break;
    }
    return q;
  }

  @ExpectWarning("SF")
  int notSoBad(int i) {
    int result = 0;
    int x = 0;
    switch (i) {
      case 0:
      case 1:
        result = 1;
        break;
      case 2:
        x = 1;
      case 3:
        result = 2;
        break;
      case 4:
      case 5:
        result = 3;
        break;
      default:
        break;
    }
    return result + x;
  }

  @ExpectWarning("SF")
  int notSoBadMutant(int c) {
    int p = 0;
    int y = 0;
    switch (c) {
      case 0:
      case 1:
        p = 1;
        break;
      case 2:
        y = 1;
      case 3:
        p = 2;
        break;
      case 4:
      case 5:
        p = 3;
        break;
      default:
        break;
    }
    return p + y;
  }

  void test1(int i) {
    switch (i) {
      case -1:
      case 0:
        System.out.println("zero");
      case 1:
      case 2:
        System.out.println("one");
      case 10:
        System.out.println("four");
      case 4:
      case 5:
        System.out.println("two");
        // fallthrough
      case 6:
      case 7:
        System.out.println("three");
      default:
        System.out.println("something else");
    }
  }

  void test1Mutant(int j) {
    switch (j) {
      case -1:
      case 0:
        System.out.println("zero");
      case 1:
      case 2:
        System.out.println("one");
      case 10:
        System.out.println("four");
      case 4:
      case 5:
        System.out.println("two");
        // fallthrough
      case 6:
      case 7:
        System.out.println("three");
      default:
        System.out.println("something else");
    }
  }

  void test2(int i, int j) {
    switch (i) {
      case 0:
        switch (j) {
          case 0:
            System.out.println("zero zero");
        }

      case 1:
        System.out.println("zero");
    }
  }

  void test2Mutant(int k, int l) {
    switch (k) {
      case 0:
        switch (l) {
          case 0:
            System.out.println("zero zero");
        }

      case 1:
        System.out.println("zero");
    }
  }

  void test3(int i, int j) {
    switch (i) {
      case 0:
        if (j == 0) return;

      case 1:
        j = 1;
        break;
    }
  }

  void test3Mutant(int m, int n) {
    switch (m) {
      case 0:
        if (n == 0) return;

      case 1:
        n = 1;
        break;
    }
  }

  void test4(int i) {
    switch (i) {
      case 0:
        System.out.println("Leaving ok");
        System.exit(0);

      case 1:
        System.out.println("Leaving with error");
        System.exit(1);

      default:
    }

    System.out.println("Things seem ok");
  }

  void test4Mutant(int o) {
    switch (o) {
      case 0:
        System.out.println("Leaving ok");
        System.exit(0);

      case 1:
        System.out.println("Leaving with error");
        System.exit(1);

      default:
    }

    System.out.println("Things seem ok");
  }
}