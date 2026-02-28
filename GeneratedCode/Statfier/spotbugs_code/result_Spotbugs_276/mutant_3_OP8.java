class Ideas_2010_05_04 {

  volatile int x;

  volatile long y;

  void bad() {
    x++;
    y++;
    x--;
    y--;
    x -= 2;
    y -= 2;
  }

  // Mutated code with renaming operator applied
  volatile int a;

  volatile long b;

  void badMutant() {
    a++;
    b++;
    a--;
    b--;
    a -= 2;
    b -= 2;
  }
}