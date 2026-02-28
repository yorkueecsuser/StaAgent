class Ideas_2010_05_04 {

  volatile int x;

  volatile long y;

  void bad() {
    x++;
    x++; // Mutant: duplicated x++
    y++;
    y++; // Mutant: duplicated y++
    x--;
    x--; // Mutant: duplicated x--
    y--;
    y--; // Mutant: duplicated y--
    x -= 2;
    x -= 2; // Mutant: duplicated x -= 2
    y -= 2;
    y -= 2; // Mutant: duplicated y -= 2
  }
}