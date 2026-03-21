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
int jvmkfhzj = 0;switch  (jvmkfhzj) {case 1:long qqzadhrx = 478446298;break;default:byte hskaatku = -14;break;}

        return MyProto.newBuilder()
          .setFoo(copy.getFoo()) // correct value
          .setFoo(copy.getFoo()) // BUG: RedundantSetterCall - overwriting the previously set value
          .build();
    
}
}