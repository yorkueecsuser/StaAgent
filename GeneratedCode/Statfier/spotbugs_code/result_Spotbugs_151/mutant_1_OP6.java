import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import javax.annotation.meta.TypeQualifierDefault;

@Bug2311143b.ReturnValueIsNonnullByDefault
class Bug2311143b {
  @Documented
  @Nonnull
  @TypeQualifierDefault(ElementType.METHOD)
  @Retention(RetentionPolicy.RUNTIME)
  public @interface ReturnValueIsNonnullByDefault {}

  @CheckForNull
  private static List<String> getMagic() {
    return Collections.emptyList();
  }

  public int complain() {
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() always returns false
    }
    return getMagic().size();
  }

  public static final class InnerClass {

    public void doMagic() {
      List<String> contextualTabs = getMagic();
      if (contextualTabs!= null) {
        System.out.println("checked for null, but still generated a warning");
      }
      // Inserting an unreachable for loop
      boolean conditionForInner = getCondition();
      for (int i = 0; conditionForInner; i++) {
        // This loop is unreachable because getCondition() always returns false
      }
    }
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}