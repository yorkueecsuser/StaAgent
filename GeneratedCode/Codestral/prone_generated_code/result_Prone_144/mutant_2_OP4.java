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
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // adding unreachable if-else branch
            System.out.println("This line should not be executed");
        } else {
            // alternative code
            System.out.println("This is the alternative line");
        }

        return MyProto.newBuilder()
         .setFoo(copy.getFoo()) // correct value
         .setFoo(copy.getFoo()) // BUG: RedundantSetterCall - overwriting the previously set value
         .build();
    }

    private boolean getCondition() {
        return false;
    }
}