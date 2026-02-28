import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.CLASS)
public @interface TreeProp {
  ResType resType() default ResType.NONE;

  boolean optional() default false;

  // Mutants
  ResType a() default ResType.NONE; // Renamed from resType to a
  boolean b() default false;        // Renamed from optional to b
}