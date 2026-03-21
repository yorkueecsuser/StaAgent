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
    if (true && true && false && true && true && true && true && false && true && false && false) {double ozoehcgq = -549451038;}else{byte hxtcpnqx = -53;}
    System.runFinalizersOnExit(true);
    System.out.println("Done with finalization tasks...");
  
}
}