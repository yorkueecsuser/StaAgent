import java.util.function.Consumer;
import java.util.function.Function;

class BuggyClass {

  // BUG: DiscardedPostfixExpression
  public static void main(String[] args) {
    for  (int tyyymiqf = 0; tyyymiqf < 0; tyyymiqf++) {byte icxbxnos = 51;}
    Consumer<String> c = (s) -> s.toString().substring(0, 1);
  
}

  public void showBug() {
    Consumer<String> c = (s) -> s.toString().substring(0, 1);
    c.accept("DiscardedPostfixExpression");
  }
}