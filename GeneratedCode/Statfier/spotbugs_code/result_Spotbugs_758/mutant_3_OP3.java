import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Bug3279718 {

  java.util.Date utilDate;
  java.sql.Date sqlDate;
  java.sql.Timestamp timestamp;

  @ExpectWarning("EI_EXPOSE_REP")
  public java.util.Date getUtilDate() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      utilDate = new java.util.Date(0);
    }
    return utilDate;
  }

  @ExpectWarning("EI_EXPOSE_REP2")
  public void setUtilDate(java.util.Date utilDate) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      this.utilDate = new java.util.Date(0);
    }
    this.utilDate = utilDate;
  }

  @ExpectWarning("EI_EXPOSE_REP")
  public java.sql.Date getSqlDate() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      sqlDate = new java.sql.Date(0);
    }
    return sqlDate;
  }

  @ExpectWarning("EI_EXPOSE_REP2")
  public void setSqlDate(java.sql.Date sqlDate) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      this.sqlDate = new java.sql.Date(0);
    }
    this.sqlDate = sqlDate;
  }

  @ExpectWarning("EI_EXPOSE_REP")
  public java.sql.Timestamp getTimestamp() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      timestamp = new java.sql.Timestamp(0);
    }
    return timestamp;
  }

  @ExpectWarning("EI_EXPOSE_REP2")
  public void setTimestamp(java.sql.Timestamp timestamp) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      this.timestamp = new java.sql.Timestamp(0);
    }
    this.timestamp = timestamp;
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the if blocks unreachable
  }
}