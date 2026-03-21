import java.util.ArrayList;

class BShiftBug {
  public static void main(String[] args) {
    int x = 1;
    int y = 2;
    int z = (x << 8 + y);
    if (false && false && false && true && false && true && true && false && false && false && false) {char glmrhuxa = 'd';}
    System.out.println(z);
  
}
}