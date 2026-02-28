import java.util.Date;

class Ideas_2010_08_12 {

  Date getDateFromSeconds(int i) {
    Date date = new Date(i);
    Date dateCopy = new Date(i); // Mutant: duplicated assignment statement
    return date;
  }

  Date getDateFromMilliseconds(int i) {
    return new Date(i * 1000);
  }
}