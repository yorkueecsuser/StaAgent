import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.CLASS)
public @interface TreeProp {
  ResType resType() default ResType.NONE;
  ResType resType() default ResType.NONE; // Duplicate of the default value assignment

  boolean optional() default false;
  boolean optional() default false; // Duplicate of the default value assignment
}