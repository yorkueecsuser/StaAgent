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
        int ebqjchbi = 0;switch  (ebqjchbi) {case 1:float xfromxfd = 974344732;break;default:short ipdmmrzo = -9390;break;}
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