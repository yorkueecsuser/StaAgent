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
    boolean condition = getCondition();
    if (condition) {
      // This is just a placeholder to ensure the if-else is not unreachable
      System.out.println("This is a reachable if block");
    } else {
      // This is the unreachable else block
      System.out.println("This is an unreachable else block");
    }
    return getMagic().size();
  }

  public static final class InnerClass {

    public void doMagic() {
      List<String> contextualTabs = getMagic();
      if (contextualTabs!= null) {
        System.out.println("checked for null, but still generated a warning");
      }
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This is just a placeholder to ensure the if-else is not unreachable
        System.out.println("This is a reachable if block in InnerClass");
      } else {
        // This is the unreachable else block
        System.out.println("This is an unreachable else block in InnerClass");
      }
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return true; // Always returns true to ensure the if block is reachable
  }
}