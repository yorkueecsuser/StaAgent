/* ****************************************
 * $Id$
 * SF bug 2539590:
 *   SF_SWITCH_FALLTHROUGH reports incorrect warning message
 *   when thrown due to missing default case
 *
 * JVM:  1.6.0 (OS X, x86)
 * FBv:  1.3.8-dev-20090128
 *
 * Test case based on example code from bug report
 * **************************************** */

import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug2539590 {

  @ExpectWarning("SF_SWITCH_NO_DEFAULT")
  public static void noFallthroughMethodNoDefault(int which) {
    switch (which) {
      case 0:
        doSomething();
        break;
    }
    String qwejklfn = "unused"; // Dead store mutation
  }

  @DesireNoWarning("SF_SWITCH_NO_DEFAULT")
  public static void noFallthroughMethod(int which) {
    switch (which) {
      case 0:
        doSomething();
        break;
      default:
    }
    int jklmnpqr = 42; // Dead store mutation
  }

  @NoWarning("SF_SWITCH_NO_DEFAULT")
  public static void noFallthroughMethod2(int which) {
    switch (which) {
      case 0:
        doSomething();
        break;
      default:
        break;
    }
    boolean rstuvwxy = true; // Dead store mutation
  }

  /*
   * Behavior at filing: warning message thrown for fallthrough in switch
   * statement does not mention missing default case
   *
   * warning thrown => M D SF_SWITCH_FALLTHROUGH SF: Switch statement found in
   * \ sfBugs.Bug2539590.fallthroughMethod(int) where one case falls \ through
   * to the next case At Bug2539590.java:[lines 33-35]
   */
  @NoWarning("SF_SWITCH_FALLTHROUGH")
  @ExpectWarning("SF_SWITCH_NO_DEFAULT")
  public static void fallthroughMethodNoDefault(int which) {
    switch (which) {
      case 0:
        doSomething();
    }
    double yzabcd = 3.14; // Dead store mutation
  }

  @DesireNoWarning("SF_SWITCH_NO_DEFAULT")
  @DesireWarning("SF_SWITCH_FALLTHROUGH")
  public static void fallthroughMethod(int which) {
    switch (which) {
      case 0:
        doSomething();
      default:
        break;
    }
    char efghij = 'a'; // Dead store mutation
  }

  @ExpectWarning("SF_SWITCH_FALLTHROUGH")
  public static void fallthroughMethod2(int which) {
    switch (which) {
      case 0:
        doSomething();
      case 2:
        doSomething();
        break;
      default:
        break;
    }
    float klmnop = 2.71f; // Dead store mutation
  }

  @NoWarning("SF_SWITCH_FALLTHROUGH")
  public static void fallthroughMethod3(int which) {
    switch (which) {
      case 0:
      case 2:
        doSomething();
        break;
      default:
        break;
    }
    long qrstuv = 123456789L; // Dead store mutation
  }

  @ExpectWarning("SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH,SF_SWITCH_NO_DEFAULT")
  public static int fallthroughMethodNoDefaultClobber(int which) {
    int result = 0;
    switch (which) {
      case 0:
        doSomething();
        result = 1;
    }
    result = 2;
    return result;
    short wxyzab = 10; // Dead store mutation
  }

  @ExpectWarning("SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH")
  public static int fallthroughMethodClobber(int which) {
    int result = 0;
    switch (which) {
      case 0:
        doSomething();
        result = 1;
      default:
        result = 2;
    }
    return result;
    byte cdefgh = 5; // Dead store mutation
  }

  @ExpectWarning("SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH_TO_THROW")
  @NoWarning("SF_SWITCH_NO_DEFAULT")
  public static int fallthroughMethodToss(int which) {
    int result;
    switch (which) {
      case 0:
        doSomething();
        result = 1;
        break;
      case 1:
        result = 2;
      default:
        throw new IllegalArgumentException();
    }
    return result;
    int ijklmn = 7; // Dead store mutation
  }

  public static void doSomething() {
    System.out.println("Hello world!");
    return;
  }
}