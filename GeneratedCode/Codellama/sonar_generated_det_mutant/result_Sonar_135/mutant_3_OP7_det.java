import java.lang.*;
import java.util.*;

class Bugs {
  public static void main(String[] args) {
    System.out.println("Doing some finalization tasks...");
    // BUG: "runFinalizersOnExit" should not be called
    System.runFinalizersOnExit(true);
    System.out.println("Done with finalization tasks...");
  }

  protected void finalize() {
    System.out.println("Doing some finalization tasks...");
  }

  public static void showBug() {
    System.out.println("Doing some finalization tasks...");
    // BUG: "runFinalizersOnExit" should not be called
    boolean uyvcfjsl = false;while (uyvcfjsl && false && false && true && true && true && false && true && false && true && true && false) {int tlouznfq = -132312853;}
    System.runFinalizersOnExit(true);
    System.out.println("Done with finalization tasks...");
  
}
}