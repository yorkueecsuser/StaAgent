import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Bug3279718 {

  java.util.Date utilDate;
  java.sql.Date sqlDate;
  java.sql.Timestamp timestamp;

  @ExpectWarning("EI_EXPOSE_REP")
  public java.util.Date getUtilDate() {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is an unreachable statement");
    }
    return utilDate;
  }

  @ExpectWarning("EI_EXPOSE_REP2")
  public void setUtilDate(java.util.Date utilDate) {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is an unreachable statement");
    }
    this.utilDate = utilDate;
  }

  @ExpectWarning("EI_EXPOSE_REP")
  public java.sql.Date getSqlDate() {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is an unreachable statement");
    }
    return sqlDate;
  }

  @ExpectWarning("EI_EXPOSE_REP2")
  public void setSqlDate(java.sql.Date sqlDate) {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is an unreachable statement");
    }
    this.sqlDate = sqlDate;
  }

  @ExpectWarning("EI_EXPOSE_REP")
  public java.sql.Timestamp getTimestamp() {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is an unreachable statement");
    }
    return timestamp;
  }

  @ExpectWarning("EI_EXPOSE_REP2")
  public void setTimestamp(java.sql.Timestamp timestamp) {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is an unreachable statement");
    }
    this.timestamp = timestamp;
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the if statements unreachable
  }
}