import java.util.function.Consumer;
import java.util.function.Function;

class BuggyClass {

  // BUG: DiscardedPostfixExpression
  public static void main(String[] args) {
    boolean bdcrkbyh = false;while (bdcrkbyh && false && true && true && false && true && false && true && true && false && false && false) {double jhhxubey = 361547866;}
    Consumer<String> c = (s) -> s.toString().substring(0, 1);
  
}

  public void showBug() {
    Consumer<String> c = (s) -> s.toString().substring(0, 1);
    c.accept("DiscardedPostfixExpression");
  }
}