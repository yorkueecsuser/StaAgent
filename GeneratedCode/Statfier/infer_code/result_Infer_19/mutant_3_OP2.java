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
}

class Example {
    public void exampleMethod() {
        int x = 5; // This is the assignment statement we will duplicate
        System.out.println(x);
    }
}