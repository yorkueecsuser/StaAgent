import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
class NotThreadSafeExample {

  Integer f;

  public void tsBad() {
    /*Shouldn't report*/
    f = 24;
  }

  // Mutated code
  Integer a;

  public void tsBadMutant() {
    /*Shouldn't report*/
    a = 24;
  }
}