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
        boolean unreachableCondition = getUnreachableCondition(); // Dynamically determined condition
        if (unreachableCondition) {
            System.out.println("This is an unreachable if-else block.");
        } else {
            System.out.println("Executing else block.");
        }

        return MyProto.newBuilder()
            .setFoo(copy.getFoo()) 
            .setFoo(copy.getBar()) 
            .build();
    }

    private boolean getUnreachableCondition() {
        return false; // This condition will always be false, making the if block unreachable
    }

    public static void main(String[] args) {
        Copy copy = new Copy("firstValue", "secondValue");
        RedundantSetterCallExample example = new RedundantSetterCallExample();
        MyProto result = example.showBug(copy);
        System.out.println("Resulting foo value: " + result.foo);
    }
}