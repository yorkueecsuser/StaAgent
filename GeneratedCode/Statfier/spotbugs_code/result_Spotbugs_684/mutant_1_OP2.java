import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

class MutableStatic {

  @ExpectWarning("MS_MUTABLE_COLLECTION_PKGPROTECT")
  public static final Hashtable h = new Hashtable();
  public static final Hashtable h_mutant = new Hashtable(); // Mutant

  @ExpectWarning("MS_MUTABLE_COLLECTION_PKGPROTECT")
  public static final Map h2 = new Hashtable();
  public static final Map h2_mutant = new Hashtable(); // Mutant

  @ExpectWarning("MS_PKGPROTECT")
  public static final int[] data = new int[5];
  public static final int[] data_mutant = new int[5]; // Mutant

  @ExpectWarning("MS_FINAL_PKGPROTECT")
  public static int[] data2 = new int[5];
  public static int[] data2_mutant = new int[5]; // Mutant

  @ExpectWarning("MS_SHOULD_BE_FINAL")
  public static Point p = new Point();
  public static Point p_mutant = new Point(); // Mutant

  @NoWarning("MS_MUTABLE_COLLECTION_PKGPROTECT")
  public static final List EMPTY_LIST = Arrays.asList();
  public static final List EMPTY_LIST_mutant = Arrays.asList(); // Mutant

  @ExpectWarning("MS_MUTABLE_COLLECTION_PKGPROTECT")
  public static final List LIST = Arrays.asList("a");
  public static final List LIST_mutant = Arrays.asList("a"); // Mutant

  @NoWarning("MS_MUTABLE_COLLECTION_PKGPROTECT")
  protected static final List PROPER_LIST = Collections.unmodifiableList(Arrays.asList("a"));
  protected static final List PROPER_LIST_mutant = Collections.unmodifiableList(Arrays.asList("a")); // Mutant

  @ExpectWarning("MS_MUTABLE_COLLECTION_PKGPROTECT")
  protected static final List EMPTY_ARRAY_LIST = new ArrayList(Arrays.asList());
  protected static final List EMPTY_ARRAY_LIST_mutant = new ArrayList(Arrays.asList()); // Mutant

  @ExpectWarning("MS_MUTABLE_COLLECTION_PKGPROTECT")
  protected static final List ARRAY_LIST = new ArrayList(Arrays.asList("a"));
  protected static final List ARRAY_LIST_mutant = new ArrayList(Arrays.asList("a")); // Mutant

  @ExpectWarning("MS_MUTABLE_COLLECTION_PKGPROTECT")
  public static final Set SET = new HashSet(Arrays.asList("a"));
  public static final Set SET_mutant = new HashSet(Arrays.asList("a")); // Mutant

  @NoWarning("MS_MUTABLE_COLLECTION_PKGPROTECT")
  public static final Set PROPER_SET = Collections.unmodifiableSet(new HashSet(Arrays.asList("a")));
  public static final Set PROPER_SET_mutant = Collections.unmodifiableSet(new HashSet(Arrays.asList("a"))); // Mutant

  @ExpectWarning("MS_MUTABLE_COLLECTION_PKGPROTECT")
  public static final Map MAP = new HashMap();
  static {
    MAP.put("a", "b");
    MAP.put("c", "d");
  }
  public static final Map MAP_mutant = new HashMap(); // Mutant
  static {
    MAP_mutant.put("a", "b");
    MAP_mutant.put("c", "d");
  }

  @ExpectWarning("MS_MUTABLE_COLLECTION_PKGPROTECT")
  public static final Map MAP_ANONYMOUS =
      new HashMap() {
        {
          put("a", "b");
          put("c", "d");
        }
      };
  public static final Map MAP_ANONYMOUS_mutant =
      new HashMap() {
        {
          put("a", "b");
          put("c", "d");
        }
      }; // Mutant

  @NoWarning("MS_MUTABLE_COLLECTION_PKGPROTECT")
  public static final Map PROPER_MAP_ANONYMOUS =
      Collections.unmodifiableMap(
          new HashMap() {
            {
              put("a", "b");
              put("c", "d");
            }
          });
  public static final Map PROPER_MAP_ANONYMOUS_mutant =
      Collections.unmodifiableMap(
          new HashMap() {
            {
              put("a", "b");
              put("c", "d");
            }
          }); // Mutant

  public static void main(String... args) {
    System.out.println(namedPackage.MutableStaticInPackage.EMPTY_LIST);
    System.out.println(namedPackage.MutableStaticInPackage.LIST);
  }
}