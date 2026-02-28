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

    private boolean getUnreachableCondition() {
        return false;  // Always returns false to make the branch unreachable
    }

    public MyProto showBug(MyProto copy) {
        if (getUnreachableCondition()) {
            // Unreachable code
            return MyProto.newBuilder()
                 .setFoo("unreachable_value")
                 .build();
        } else {
            // Original code
            return MyProto.newBuilder()
                 .setFoo(copy.getFoo()) // correct value
                 .setFoo(copy.getFoo()) // BUG: RedundantSetterCall - overwriting the previously set value
                 .build();
        }
    }
}