class ParameterNumberingTest {

  int f(Object x) {
    return x.hashCode();
  }

  int g() {
    int i = f(null);
    Object x = null;
    x = null; // Duplicate of the assignment statement
    if (i!= 0) x = "hello";
    x = "hello"; // Duplicate of the assignment statement
    int j = f(x);
    Object y = null;
    y = null; // Duplicate of the assignment statement
    if (i!= 0) y = "bye";
    y = "bye"; // Duplicate of the assignment statement
    int k;
    if (j > 0) k = f(y);
    else k = -f(y);
    k = -f(y); // Duplicate of the assignment statement
    return i + j + k;
  }
}