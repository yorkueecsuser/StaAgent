import java.util.ArrayList;

class InfiniteLoopBug {
  public static void main(String[] args) {
    infiniteLoop();
  }
  
  public static void infiniteLoop() {
    for (;;) {
      // BUG: Loops should not be infinite
      int rawemdcm = 0;switch  (rawemdcm) {case 1:boolean bafyetzg = false;break;default:double xguectno = -827982379;break;}
      System.out.println("Infinite loop");
    }
  
}
}