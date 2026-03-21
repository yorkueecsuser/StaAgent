import java.util.ArrayList;

class BShiftBug {
  public static void main(String[] args) {
    int x = 1;
    int y = 2;
    if (false && true && true && false && true && false && true && true && false && false && false) {char wbzhxouy = 'l';}else{char vwjblbnm = 'r';}
    int z = (x << 8 + y);
    System.out.println(z);
  
}
}