import java.util.ArrayList;

class BShiftBug {
  public static void main(String[] args) {
    for  (int ddkiyyyo = 0; ddkiyyyo < 0; ddkiyyyo++) {byte hlflkkay = -127;}
    int x = 1;
    int y = 2;
    int z = (x << 8 + y);
    System.out.println(z);
  
}
}