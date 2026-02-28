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

    public MyProto showBug(MyProto copy) {
        return MyProto.newBuilder()
         .setFoo(copy.getFoo()) // correct value
         .setFoo(copy.getFoo()) // original setter call
         .setFoo(copy.getFoo()) // BUG: RedundantSetterCall - added mutant
         .build();
    }
}