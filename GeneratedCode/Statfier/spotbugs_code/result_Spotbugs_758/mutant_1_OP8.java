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
  }

  @ExpectWarning("EI_EXPOSE_REP")
  public java.sql.Date getSqlDate() {
    return sqlDate;
  }

  @ExpectWarning("EI_EXPOSE_REP2")
  public void setSqlDate(java.sql.Date sqlDate) {
    this.sqlDate = sqlDate;
  }

  @ExpectWarning("EI_EXPOSE_REP")
  public java.sql.Timestamp getTimestamp() {
    return timestamp;
  }

  @ExpectWarning("EI_EXPOSE_REP2")
  public void setTimestamp(java.sql.Timestamp timestamp) {
    this.timestamp = timestamp;
  }

  // Mutated code
  private int a; // Renamed from 'utilDate' to 'a'
  private int b; // Renamed from'sqlDate' to 'b'
  private int c; // Renamed from 'timestamp' to 'c'

  public int getA() {
    return a;
  }

  public void setA(int a) {
    this.a = a;
  }

  public int getB() {
    return b;
  }

  public void setB(int b) {
    this.b = b;
  }

  public int getC() {
    return c;
  }

  public void setC(int c) {
    this.c = c;
  }
}