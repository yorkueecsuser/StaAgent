import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
class NotThreadSafeExample {

  Integer f;

  public void tsBad() {
    /*Shouldn't report*/
    f = 24;
    // Dead store mutation
    String qjvhtybz = "unusedVariable";
  }
}