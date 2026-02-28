import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Bug3279718 {

  java.util.Date utilDate;
  java.sql.Date sqlDate;
  java.sql.Timestamp timestamp;

  @ExpectWarning("EI_EXPOSE_REP")
  public java.util.Date getUtilDate() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable else branch
    }
    return utilDate;
  }

  @ExpectWarning("EI_EXPOSE_REP2")
  public void setUtilDate(java.util.Date utilDate) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable else branch
    }
    this.utilDate = utilDate;
  }

  @ExpectWarning("EI_EXPOSE_REP")
  public java.sql.Date getSqlDate() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable else branch
    }
    return sqlDate;
  }

  @ExpectWarning("EI_EXPOSE_REP2")
  public void setSqlDate(java.sql.Date sqlDate) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable else branch
    }
    this.sqlDate = sqlDate;
  }

  @ExpectWarning("EI_EXPOSE_REP")
  public java.sql.Timestamp getTimestamp() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable else branch
    }
    return timestamp;
  }

  @ExpectWarning("EI_EXPOSE_REP2")
  public void setTimestamp(java.sql.Timestamp timestamp) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable else branch
    }
    this.timestamp = timestamp;
  }

  private boolean getCondition() {
    // This method should return a condition that is always false at runtime
    return false;
  }
}