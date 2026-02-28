import java.util.Date;

class Ideas_2010_08_12 {

  Date getDateFromSeconds(int i) {
    String unusedVariable = "abcdefgh"; // Dead Store
    return new Date(i);
  }

  Date getDateFromMilliseconds(int i) {
    int unusedInt = 12345678; // Dead Store
    return new Date(i * 1000);
  }
}