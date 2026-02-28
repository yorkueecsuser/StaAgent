import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Bug3279718 {

  java.util.Date utilDate;
  java.sql.Date sqlDate;
  java.sql.Timestamp timestamp;

  @ExpectWarning("EI_EXPOSE_REP")
  public java.util.Date getUtilDate() {
    return utilDate;
  }

  @ExpectWarning("EI_EXPOSE_REP2")
  public void setUtilDate(java.util.Date utilDate) {
    this.utilDate = utilDate;
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
      default:
        // Default case to satisfy switch requirement
        break;
    }
  }

  @ExpectWarning("EI_EXPOSE_REP")
  public java.sql.Date getSqlDate() {
    return sqlDate;
  }

  @ExpectWarning("EI_EXPOSE_REP2")
  public void setSqlDate(java.sql.Date sqlDate) {
    this.sqlDate = sqlDate;
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
      default:
        // Default case to satisfy switch requirement
        break;
    }
  }

  @ExpectWarning("EI_EXPOSE_REP")
  public java.sql.Timestamp getTimestamp() {
    return timestamp;
  }

  @ExpectWarning("EI_EXPOSE_REP2")
  public void setTimestamp(java.sql.Timestamp timestamp) {
    this.timestamp = timestamp;
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
      default:
        // Default case to satisfy switch requirement
        break;
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the switch condition always evaluate to false
    return false;
  }
}