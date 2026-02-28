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

    private boolean getFalseCondition() {
        // This is a method just to demonstrate the rule of not using direct constants
        return false;
    }

    public MyProto showBug(MyProto copy) {
        while (getFalseCondition()) {
            // This while loop is unreachable as the condition is always false
            // However, we are following the guidelines to avoid unreachable statement errors
        }

        return MyProto.newBuilder()
         .setFoo(copy.getFoo()) // correct value
         .setFoo(copy.getFoo()) // BUG: RedundantSetterCall - overwriting the previously set value
         .build();
    }
}