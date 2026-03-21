import java.lang.*;
import java.util.*;

class Bugs {
  public static void main(String[] args) {
    System.out.println("Doing some finalization tasks...");
    // BUG: "runFinalizersOnExit" should not be called
    int beyanwzr = 0;switch  (beyanwzr) {case 1:String hejdrype = "tychltfg";break;default:char qnwjqbhp = 'j';break;}
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