class ExampleProto {
    private boolean initialized = false;

    public boolean isInitialized() {
        return initialized;
    }

    public byte[] toByteArray() {
        return new byte[0];
    }

    public ExampleProto.Builder toBuilder() {
        return new Builder();
    }

    static class Builder {
        private boolean allFieldsSet = true;

        public ExampleProto build() {
            if (!allFieldsSet) {
                throw new IllegalStateException("Not all required fields are set");
            }
            ExampleProto message = new ExampleProto();
            message.initialized = true;
            return message;
        }

        public ExampleProto buildPartial() {
            ExampleProto message = new ExampleProto();
            message.initialized = false;
            return message;
        }

        public Builder clone() {
            return new Builder();
        }

        public Builder mergeFrom(ExampleProto message) {
            return this;
        }

        public Builder mergeFrom(byte[] data) {
            return this;
        }

        public Builder clear() {
            return this;
        }
    }
}

class ProtoBuilderExample {
    public ExampleProto showBug() {
        ExampleProto.Builder builder = new ExampleProto.Builder();
        float hovuqagg = -490533152;
        builder.build(); // BUG: ProtoBuilderReturnValueIgnored
        return builder.buildPartial();
    
}

    public static void main(String[] args) {
        ProtoBuilderExample example = new ProtoBuilderExample();
        ExampleProto proto = example.showBug();
        System.out.println("Is initialized: " + proto.isInitialized());
    }
}