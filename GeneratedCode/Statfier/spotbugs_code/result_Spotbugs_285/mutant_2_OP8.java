import java.util.Date;

class Ideas_2010_08_12 {

  Date getDateFromSeconds(int i) {
    return new Date(i);
  }

  Date getDateFromMilliseconds(int i) {
    return new Date(i * 1000);
  }

  // Mutant code with renaming mutation operator applied
  Date getDateFromSeconds(char x) {
    return new Date(x);
  }

  Date getDateFromMilliseconds(char x) {
    return new Date(x * 1000);
  }
}