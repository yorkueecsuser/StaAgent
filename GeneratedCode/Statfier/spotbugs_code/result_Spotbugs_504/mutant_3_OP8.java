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

    // Mutant: Renamed variable 'x' to 'a'
    int a;

    @ExpectWarning("SF")
    void deadStoreToFieldMutant(int i) {
      switch (i) {
        case 0:
        case 1:
          a = 1;
        case 2:
        case 3:
          a = 2;
          break;
        case 4:
        case 5:
          a = 3;
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

  // Mutant: Renamed variable'result' to 'b'
  @ExpectWarning("SF")
  int reallyBadMutant(int i) {
    int b = 0;
    switch (i) {
      case 0:
      case 1:
        b = 1;
      case 2:
      case 3:
        b = 2;
        break;
      case 4:
      case 5:
        b = 3;
        break;
      default:
        break;
    }
    return b;
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

  // Mutant: Renamed variable'result' to 'c'
  @ExpectWarning("SF")
  int notSoBadMutant(int i) {
    int c = 0;
    int y = 0;
    switch (i) {
      case 0:
      case 1:
        c = 1;
        break;
      case 2:
        y = 1;
      case 3:
        c = 2;
        break;
      case 4:
      case 5:
        c = 3;
        break;
      default:
        break;
    }
    return c + y;
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

  // Mutant: Renamed variable 'i' to 'd'
  void test1Mutant(int d) {
    switch (d) {
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

  // Mutant: Renamed variable 'i' to 'e'
  void test2Mutant(int e, int j) {
    switch (e) {
      case 0:
        switch (j) {
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

  // Mutant: Renamed variable 'i' to 'f'
  void test3Mutant(int f, int j) {
    switch (f) {
      case 0:
        if (j == 0) return;

      case 1:
        j = 1;
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

  // Mutant: Renamed variable 'i' to 'g'
  void test4Mutant(int g) {
    switch (g) {
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