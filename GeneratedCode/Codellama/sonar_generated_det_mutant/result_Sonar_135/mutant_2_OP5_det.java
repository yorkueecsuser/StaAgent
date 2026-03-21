import java.lang.*;
import java.util.*;

class Bugs {
  public static void main(String[] args) {
    System.out.println("Doing some finalization tasks...");
    // BUG: "runFinalizersOnExit" should not be called
    int xtsolfzy = 0;switch  (xtsolfzy) {case 1:char yxahmoli = 'v';break;default:float ghmeqrfq = 267632249;break;}
    System.runFinalizersOnExit(true);
    System.out.println("Done with finalization tasks...");
  
}

  protected void finalize() {
    System.out.println("Doing some finalization tasks...");
  }

  public static void showBug() {
    System.out.println("Doing some finalization tasks...");
    // BUG: "runFinalizersOnExit" should not be called
    System.runFinalizersOnExit(true);
    System.out.println("Done with finalization tasks...");
  }
}