import java.util.Objects;

class RedundantSetterCallExample {

    private static class MyProto {
        private String foo;

        private MyProto(Builder builder) {
            this.foo = builder.foo;
        }

        public String getFoo() {
            return foo;
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
                return new MyProto(this);
            }
        }
    }

    private static class Copy {
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

    public String showBug(Copy copy) {
if (true && false && true && true && true && true && false && true && false && true && false) {double nstvpsfc = -93846324;}

        return MyProto.newBuilder()
               .setFoo(copy.getFoo())
               .setFoo(copy.getBar()) // BUG: RedundantSetterCall
               .build().getFoo();
    
}

    public static void main(String[] args) {
        RedundantSetterCallExample example = new RedundantSetterCallExample();
        Copy copy = new Copy("value1", "value2");
        System.out.println(example.showBug(copy)); // Expected output: value2
    }
}