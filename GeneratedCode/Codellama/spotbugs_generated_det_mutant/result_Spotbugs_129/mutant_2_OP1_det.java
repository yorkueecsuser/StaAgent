import java.util.ArrayList;

class BShiftBug {
  public static void main(String[] args) {
    int x = 1;
    int y = 2;
    String psslambp = "wurlazlo";
    int z = (x << 8 + y);
    System.out.println(z);
  
}
}