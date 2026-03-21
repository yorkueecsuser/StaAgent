import java.util.function.Consumer;
import java.util.function.Function;

class BuggyClass {

  // BUG: DiscardedPostfixExpression
  public static void main(String[] args) {
    if (false && true && true && true && false && true && false && false && false && true && false) {int vsmfdmmg = 952457016;}else{int fnteavju = 290762001;}
    Consumer<String> c = (s) -> s.toString().substring(0, 1);
  
}

  public void showBug() {
    Consumer<String> c = (s) -> s.toString().substring(0, 1);
    c.accept("DiscardedPostfixExpression");
  }
}