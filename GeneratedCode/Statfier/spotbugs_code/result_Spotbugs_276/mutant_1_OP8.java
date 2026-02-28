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

  // Mutated code with renaming of variable 'x' to 'a'
  void bad_mutated_1() {
    volatile int a = x;
    volatile long y = this.y;

    a++;
    y++;
    a--;
    y--;
    a -= 2;
    y -= 2;
  }

  // Mutated code with renaming of variable 'y' to 'b'
  void bad_mutated_2() {
    volatile int x = this.x;
    volatile long b = y;

    x++;
    b++;
    x--;
    b--;
    x -= 2;
    b -= 2;
  }
}