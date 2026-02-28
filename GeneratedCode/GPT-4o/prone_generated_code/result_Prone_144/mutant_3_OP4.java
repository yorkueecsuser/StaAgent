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
        // Introduce a non-final variable to ensure the condition is evaluated at runtime
        boolean condition = getCondition();
        if (condition) {
            // This block will never be executed as condition is always false
            System.out.println("This is an unreachable code block.");
        } else {
            // The original code remains unaffected
            return MyProto.newBuilder()
                .setFoo(copy.getFoo()) // Original code
                .setFoo(copy.getBar()) // Original code
                .build();
        }
        return null; // This return statement is necessary to maintain method signature
    }

    // Method to simulate a runtime condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        Copy copy = new Copy("firstValue", "secondValue");
        RedundantSetterCallExample example = new RedundantSetterCallExample();
        MyProto result = example.showBug(copy);
        System.out.println("Resulting foo value: " + result.foo);
    }
}