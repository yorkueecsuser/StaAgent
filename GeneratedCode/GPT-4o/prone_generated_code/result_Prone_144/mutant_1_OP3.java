class RedundantSetterCallExample {

    public static class MyProto {
        private String foo;

        private MyProto(String foo) {
            this.foo = foo;
        }

        public static Builder newBuilder() {
            return new Builder();
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

    public static class Copy {
        private String foo;
        private String bar;

        public Copy(String foo, String bar) {
            this.foo = foo;
            this.bar = bar;
        }

        public String getFoo() {
            return foo;
        }

        public String getBar() {
            return bar;
        }
    }

    public MyProto showBug(Copy copy) {
        boolean alwaysFalse = getFalseCondition(); // Use a method to ensure dynamic determination at runtime
        if (alwaysFalse) {
            System.out.println("This branch is unreachable");
        }

        return MyProto.newBuilder()
            .setFoo(copy.getFoo()) // BUG: RedundantSetterCall
            .setFoo(copy.getBar()) // BUG: RedundantSetterCall
            .build();
    }

    private boolean getFalseCondition() {
        return false; // This method returns a compile-time constant, but since it's a method call, it complies with the rules.
    }

    public static void main(String[] args) {
        Copy copy = new Copy("firstValue", "secondValue");
        RedundantSetterCallExample example = new RedundantSetterCallExample();
        MyProto result = example.showBug(copy);
        System.out.println("Resulting foo value: " + result.foo);
    }
}