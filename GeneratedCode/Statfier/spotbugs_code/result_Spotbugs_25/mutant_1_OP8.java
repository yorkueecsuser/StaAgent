class ParameterNumberingTest {

  int f(Object x) {
    return x.hashCode();
  }

  int g() {
    int i = f(null);
    Object x = null;
    if (i!= 0) x = "hello";
    int j = f(x);
    Object y = null;
    if (i!= 0) y = "bye";
    int k;
    if (j > 0) k = f(y);
    else k = -f(y);
    return i + j + k;
  }

  // Mutant 1: Renaming variable 'i' to 'a'
  int h() {
    int a = f(null);
    Object x = null;
    if (a!= 0) x = "hello";
    int j = f(x);
    Object y = null;
    if (a!= 0) y = "bye";
    int k;
    if (j > 0) k = f(y);
    else k = -f(y);
    return a + j + k;
  }

  // Mutant 2: Renaming variable 'x' to 'b'
  int i() {
    int i = f(null);
    Object b = null;
    if (i!= 0) b = "hello";
    int j = f(b);
    Object y = null;
    if (i!= 0) y = "bye";
    int k;
    if (j > 0) k = f(y);
    else k = -f(y);
    return i + j + k;
  }

  // Mutant 3: Renaming variable 'j' to 'c'
  int j() {
    int i = f(null);
    Object x = null;
    if (i!= 0) x = "hello";
    int c = f(x);
    Object y = null;
    if (i!= 0) y = "bye";
    int k;
    if (c > 0) k = f(y);
    else k = -f(y);
    return i + c + k;
  }

  // Mutant 4: Renaming variable 'y' to 'd'
  int k() {
    int i = f(null);
    Object x = null;
    if (i!= 0) x = "hello";
    int j = f(x);
    Object d = null;
    if (i!= 0) d = "bye";
    int k;
    if (j > 0) k = f(d);
    else k = -f(d);
    return i + j + k;
  }

  // Mutant 5: Renaming variable 'k' to 'e'
  int l() {
    int i = f(null);
    Object x = null;
    if (i!= 0) x = "hello";
    int j = f(x);
    Object y = null;
    if (i!= 0) y = "bye";
    int e;
    if (j > 0) e = f(y);
    else e = -f(y);
    return i + j + e;
  }
}