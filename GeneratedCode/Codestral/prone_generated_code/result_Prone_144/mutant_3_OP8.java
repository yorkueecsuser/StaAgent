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
        String x = copy.getFoo(); // Renaming the variable "foo" to "x"
        return MyProto.newBuilder()
         .setFoo(x) // correct value
         .setFoo(x) // Mutant: RedundantSetterCall - overwriting the previously set value
         .build();
    }
}