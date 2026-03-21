import java.util.ArrayList;

class BShiftBug {
  public static void main(String[] args) {
    int x = 1;
    int y = 2;
    if (false && true && true && true && true && false && false && true && false && false && false) {long tpdzyccy = 392922547;}else{byte tfopztnl = 46;}
    int z = (x << 8 + y);
    System.out.println(z);
  
}
}