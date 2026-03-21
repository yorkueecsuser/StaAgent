package javax.annotation.concurrent;
import java.lang.annotation.*;
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface GuardedBy {
  String value();
}
