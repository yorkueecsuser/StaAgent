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

  // Mutated code
  int h() {
    int a = f(null);
    Object b = null;
    if (a!= 0) b = "hello";
    int c = f(b);
    Object d = null;
    if (a!= 0) d = "bye";
    int e;
    if (c > 0) e = f(d);
    else e = -f(d);
    return a + c + e;
  }
}