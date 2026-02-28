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

    private boolean getCondition() {
        return false;
    }

    public MyProto showBug(MyProto copy) {
        MyProto.Builder builder = MyProto.newBuilder()
         .setFoo(copy.getFoo());

        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable code added based on the mutation operator information
            builder.setFoo(copy.getFoo());
        }

        return builder.build();
    }
}