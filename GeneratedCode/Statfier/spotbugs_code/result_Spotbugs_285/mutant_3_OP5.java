import java.util.Date;

class Ideas_2010_08_12 {

  Date getDateFromSeconds(int i) {
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is an unreachable switch case");
        break;
    }
    return new Date(i);
  }

  Date getDateFromMilliseconds(int i) {
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is another unreachable switch case");
        break;
    }
    return new Date(i * 1000);
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the switch cases are unreachable
    return false;
  }
}