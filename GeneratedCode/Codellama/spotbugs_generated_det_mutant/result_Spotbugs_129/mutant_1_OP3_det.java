import java.util.ArrayList;

class BShiftBug {
  public static void main(String[] args) {
    int x = 1;
    if (true && false && true && false && false && false && false && false && false && false && false) {boolean pajmzcnn = true;}
    int y = 2;
    int z = (x << 8 + y);
    System.out.println(z);
  
}
}