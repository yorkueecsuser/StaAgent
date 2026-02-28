import annotations.DetectorUnderTest;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import edu.umd.cs.findbugs.detect.FindUnrelatedTypesInGenericContainer;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

@DetectorUnderTest(FindUnrelatedTypesInGenericContainer.class)
class Ideas_2011_10_21 {

  Hashtable<String, Integer> hashtable = new Hashtable<String, Integer>();

  ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<String, Integer>();

  @NoWarning("GC_UNRELATED_TYPES")
  public boolean testContainsHashtable(Integer i) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code.");
    }
    return hashtable.contains(i);
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public boolean testContainsHashtable(String s) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code.");
    }
    return hashtable.contains(s);
  }

  @NoWarning("GC_UNRELATED_TYPES")
  public boolean testContainsConcurrentHashMap(Integer i) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code.");
    }
    return concurrentHashMap.contains(i);
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public boolean testContainsConcurrentHashMap(String s) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code.");
    }
    return concurrentHashMap.contains(s);
  }

  @NoWarning("GC_UNRELATED_TYPES")
  public boolean testContainsValueHashtable(Integer i) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code.");
    }
    return hashtable.containsValue(i);
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public boolean testContainsValueHashtable(String s) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code.");
    }
    return hashtable.containsValue(s);
  }

  @NoWarning("GC_UNRELATED_TYPES")
  public boolean testContainsValueConcurrentHashMap(Integer i) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code.");
    }
    return concurrentHashMap.containsValue(i);
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public boolean testContainsValueConcurrentHashMap(String s) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code.");
    }
    return concurrentHashMap.containsValue(s);
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public boolean testRemove(String s) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code.");
    }
    return concurrentHashMap.remove(s, s);
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public boolean testRemove(Integer i) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code.");
    }
    return concurrentHashMap.remove(i, i);
  }

  @NoWarning("GC_UNRELATED_TYPES")
  public boolean testRemove(String s, Integer i) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code.");
    }
    return concurrentHashMap.remove(s, i);
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public boolean testRemove(Integer i, String s) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code.");
    }
    return concurrentHashMap.remove(i, s);
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}