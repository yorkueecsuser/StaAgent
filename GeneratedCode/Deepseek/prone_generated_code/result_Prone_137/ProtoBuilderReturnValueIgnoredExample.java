import com.google.protobuf.Descriptors.FieldDescriptor;

class ProtoBuilderReturnValueIgnoredExample {

    public void showBug(int numberOfFields) {
        MyMessage.Builder builder = MyMessage.newBuilder();

        for(int i = 0; i < numberOfFields; i++) {
            builder.setField(FieldDescriptor.Type.TYPE_INT32, "field" + i);
        }

        // BUG: ProtoBuilderReturnValueIgnored
        builder.build(); // This line is buggy, the return value is discarded
    }

    // Necessary classes for the example
    public static class MyMessage {
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