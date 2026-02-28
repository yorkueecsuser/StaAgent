import com.google.protobuf.Message;

class RedundantSetterCallBug {

    private String foo;
    private String bar;

    public RedundantSetterCallBug(String foo, String bar) {
        this.foo = foo;
        this.bar = bar;
    }

    public MyProto showBug() {
        // BUG: RedundantSetterCall
        return MyProto.newBuilder()
          .setFoo(foo)
          .setFoo(bar)
          .build();
    }

    public static class MyProto {
        public static MyProto.Builder newBuilder() {
            return new MyProto.Builder();
        }

        public static class Builder {
            public Builder setFoo(String foo) {
                return this;
            }

            public MyProto build() {
                return new MyProto();
            }
        }
    }
}