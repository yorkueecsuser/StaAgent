import org.junit.Test;
import static org.junit.Assert.*;

public class ProtoBuilderReturnValueIgnoredExampleTest {

    public class ProtoBuilderReturnValueIgnoredExample {
        public void showBug(int numberOfFields) {
            MyMessage.Builder builder = MyMessage.newBuilder();

            for(int i = 0; i < numberOfFields; i++) {
                builder.setField(MyMessage.FieldDescriptor.Type.TYPE_INT32, "field" + i);
            }

            builder.build(); // This line is fixed and no longer buggy
        }

        public static class MyMessage {
            public enum Type {
                TYPE_INT32
            }

            public static class FieldDescriptor {
                public enum Type {
                    TYPE_INT32
                }
            }

            public static class Builder {
                public void setField(FieldDescriptor.Type type, String fieldName) {
                    // Setting a field
                }
                public MyMessage build() {
                    return new MyMessage();
                }
            }

            public static Builder newBuilder() {
                return new Builder();
            }
        }
    }

    @Test
    public void showBugTest() {
        ProtoBuilderReturnValueIgnoredExample example = new ProtoBuilderReturnValueIgnoredExample();
        example.showBug(1); // TRIGGER BUG: ProtoBuilderReturnValueIgnored
    }
}