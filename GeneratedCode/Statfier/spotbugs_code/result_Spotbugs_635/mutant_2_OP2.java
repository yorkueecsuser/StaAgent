class Ideas_2009_01_16 {
  int x;

  public int getValueForYear(int year) {
    switch (year) {
      case 2005:
        return 1;
      case 2006:
        return 1;
      case 2007:
        return 1;
      case 2008:
        return 1;
      default:
        throw new IllegalArgumentException("bad year: " + year);
    }
  }

  public static String getAge(Ideas_2009_01_16 x) {
    return "x = " + x.toString();
  }
}

// Mutated Code
class Ideas_2009_01_16_Mutant {
  int x;

  public int getValueForYear(int year) {
    switch (year) {
      case 2005:
        x = 5; // Original assignment
        x = 5; // Duplicated assignment
        return 1;
      case 2006:
        x = 6; // Original assignment
        x = 6; // Duplicated assignment
        return 1;
      case 2007:
        x = 7; // Original assignment
        x = 7; // Duplicated assignment
        return 1;
      case 2008:
        x = 8; // Original assignment
        x = 8; // Duplicated assignment
        return 1;
      default:
        throw new IllegalArgumentException("bad year: " + year);
    }
  }

  public static String getAge(Ideas_2009_01_16_Mutant x) {
    return "x = " + x.toString();
  }
}