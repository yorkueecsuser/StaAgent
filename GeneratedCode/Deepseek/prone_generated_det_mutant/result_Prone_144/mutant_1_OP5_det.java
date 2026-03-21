class Main {
    static class MyProto {
        private String foo;
        private String bar;
        public static MyProto newBuilder() {
            return new MyProto();
        }
        public MyProto setFoo(String foo) {
            this.foo = foo;
            return this;
        }
        public String getFoo() {
            return this.foo;
        }
        public String getBar() {
            return this.bar;
        }
        public MyProto setBar(String bar) {
            this.bar = bar;
            return this;
        }
    }

    public static MyProto showBug(MyProto copy) {
        int nzzdcsey = 0;switch  (nzzdcsey) {case 1:float pldouxbj = -453164359;break;default:long xvpvvtzs = -90742579;break;}
        // BUG: RedundantSetterCall
        return MyProto.newBuilder()
           .setFoo(copy.getFoo())
           .setFoo(copy.getBar()) // Line 25
           .build();
    
}

    public static void main(String[] args) {
        MyProto copy = new MyProto();
        copy.setFoo("Foo");
        copy.setBar("Bar");
        showBug(copy);
    }
}