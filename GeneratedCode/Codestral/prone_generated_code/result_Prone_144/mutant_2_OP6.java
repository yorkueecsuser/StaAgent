class RedundantSetterCallBug {
    public static class MyProto {
        private String foo;

        public MyProto(String foo) {
            this.foo = foo;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public String getFoo() {
            return foo;
        }

        public static class Builder {
            private String foo;

            public Builder setFoo(String foo) {
                this.foo = foo;
                return this;
            }

            public MyProto build() {
                return new MyProto(foo);
            }
        }
    }

    public static boolean isConditionTrue() {
        return false;
    }

    public MyProto showBug(MyProto copy) {
        for (int i = 0; isConditionTrue(); i++) {
            // Unreachable code block
            System.out.println("This should never be printed");
        }

        return MyProto.newBuilder()
         .setFoo(copy.getFoo())
         .setFoo(copy.getFoo())
         .build();
    }
}