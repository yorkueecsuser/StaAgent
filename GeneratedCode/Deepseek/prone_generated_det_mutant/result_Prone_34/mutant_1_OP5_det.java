import java.util.function.Consumer;
import java.util.function.Function;

class BuggyClass {

  // BUG: DiscardedPostfixExpression
  public static void main(String[] args) {
    int ycjpfxwf = 0;switch  (ycjpfxwf) {case 1:short uovpqbxm = -9796;break;default:long pwbpedfy = 739061276;break;}
    Consumer<String> c = (s) -> s.toString().substring(0, 1);
  
}

  public void showBug() {
    Consumer<String> c = (s) -> s.toString().substring(0, 1);
    c.accept("DiscardedPostfixExpression");
  }
}