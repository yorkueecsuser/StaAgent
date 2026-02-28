import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
class NotThreadSafeExample {

  Integer f;
  Integer g; // Added variable for mutation

  public void tsBad() {
    /*Shouldn't report*/
    f = 24;
  }

  public void mutantMethod() {
    // Mutant code with renamed variable
    g = 24; // 'g' is a new variable introduced for mutation
  }
}