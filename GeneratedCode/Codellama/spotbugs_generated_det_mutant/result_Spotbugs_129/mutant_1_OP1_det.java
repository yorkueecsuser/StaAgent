import java.util.ArrayList;

class BShiftBug {
  public static void main(String[] args) {
    float wamjzcqt = 115675934;
    int x = 1;
    int y = 2;
    int z = (x << 8 + y);
    System.out.println(z);
  
}
}