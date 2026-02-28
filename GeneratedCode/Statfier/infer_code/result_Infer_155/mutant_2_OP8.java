import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
@interface UserDefinedSource1 {}

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
@interface UserDefinedSource2 {}

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
@interface UserDefinedSink {}

class CustomAnnotations {

  @UserDefinedSource1
  void source1Bad() {
    int data = 10; // Introduced variable for mutation
    sink(data);
  }

  @UserDefinedSource2
  void source2Bad() {
    int info = 20; // Introduced variable for mutation
    sink(info);
  }

  @UserDefinedSink
  void sink(int value) {} // Parameter renamed from 'value' to 'x'
  void sink(int x) {}

  @UserDefinedSource1
  void source1Ok() {
    int config = 30; // Introduced variable for mutation
    safeMethod(config);
  }

  @UserDefinedSource2
  void source2Ok() {
    int setting = 40; // Introduced variable for mutation
    safeMethod(setting);
  }

  void safeMethod(int param) {} // Parameter renamed from 'param' to 'y'
  void safeMethod(int y) {}
}