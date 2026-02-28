import java.util.Date;

class Ideas_2010_08_12 {

  Date getDateFromSeconds(int i) {
    return new Date(i);
    // Mutant: Duplicate the return statement
    return new Date(i);
  }

  Date getDateFromMilliseconds(int i) {
    return new Date(i * 1000);
    // Mutant: Duplicate the return statement
    return new Date(i * 1000);
  }
}