import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({
  ElementType.CONSTRUCTOR,
  ElementType.METHOD,
})
public @interface SuppressLint {
  String[] value();

  // Introducing a dummy method to demonstrate renaming mutation
  default void dummyMethod() {
    String originalName = "example";
    String mutantName = originalName; // Renamed 'originalName' to'mutantName'
  }
}