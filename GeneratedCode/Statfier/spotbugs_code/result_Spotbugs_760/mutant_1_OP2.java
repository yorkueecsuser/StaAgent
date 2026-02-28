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
  }

  @DesireNoWarning("SF_SWITCH_NO_DEFAULT")
  public static void noFallthroughMethod(int which) {
    switch (which) {
      case 0:
        doSomething();
        break;
      default:
    }
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
  }

  @DesireNoWarning("SF_SWITCH_NO_DEFAULT")
  @DesireWarning("SF_SWITCH_FALLTHROUGH")
  public static void fallthroughMethod(int which) {
    switch (which) {
      case 0:
        doSomething();
        int temp = 0; // Mutation: Duplicate assignment
        int temp2 = 0; // Mutation: Duplicate assignment
      default:
        break;
    }
  }

  @ExpectWarning("SF_SWITCH_FALLTHROUGH")
  public static void fallthroughMethod2(int which) {
    switch (which) {
      case 0:
        doSomething();
        int x = 1; // Mutation: Duplicate assignment
        int y = 1; // Mutation: Duplicate assignment
      case 2:
        doSomething();
        break;
      default:
        break;
    }
  }

  @NoWarning("SF_SWITCH_FALLTHROUGH")
  public static void fallthroughMethod3(int which) {
    switch (which) {
      case 0:
      case 2:
        doSomething();
        int z = 2; // Mutation: Duplicate assignment
        int w = 2; // Mutation: Duplicate assignment
        break;
      default:
        break;
    }
  }

  @ExpectWarning("SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH,SF_SWITCH_NO_DEFAULT")
  public static int fallthroughMethodNoDefaultClobber(int which) {
    int result = 0;
    switch (which) {
      case 0:
        doSomething();
        result = 1;
        int a = 3; // Mutation: Duplicate assignment
        int b = 3; // Mutation: Duplicate assignment
    }
    result = 2;
    return result;
  }

  @ExpectWarning("SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH")
  public static int fallthroughMethodClobber(int which) {
    int result = 0;
    switch (which) {
      case 0:
        doSomething();
        result = 1;
        int c = 4; // Mutation: Duplicate assignment
        int d = 4; // Mutation: Duplicate assignment
      default:
        result = 2;
    }
    return result;
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
        int e = 5; // Mutation: Duplicate assignment
        int f = 5; // Mutation: Duplicate assignment
      default:
        throw new IllegalArgumentException();
    }
    return result;
  }

  public static void doSomething() {
    System.out.println("Hello world!");
    return;
  }
}