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

    // Method to dynamically determine the condition
    private boolean getUnreachableCondition() {
        return false;
    }

    public MyProto showBug(MyProto copy) {
        // Inserting an unreachable if branch
        if (getUnreachableCondition()) {
            // This code will never be executed
            System.out.println("This is an unreachable if branch");
        }

        return MyProto.newBuilder()
         .setFoo(copy.getFoo()) // correct value
         .setFoo(copy.getFoo()) // BUG: RedundantSetterCall - overwriting the previously set value
         .build();
    }
}