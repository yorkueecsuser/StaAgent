import java.util.Date;

class Ideas_2010_08_12 {

  Date getDateFromSeconds(int i) {
    return new Date(i);
    return new Date(i); // Mutant: Duplicate of the return statement
  }

  Date getDateFromMilliseconds(int i) {
    return new Date(i * 1000);
    return new Date(i * 1000); // Mutant: Duplicate of the return statement
  }
}