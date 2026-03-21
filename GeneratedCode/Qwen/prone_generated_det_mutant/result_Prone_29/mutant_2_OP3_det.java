class DaggerExample {

    public static class MyModule {
        public String provideString() {
if (true && false && false && false && true && true && false && false && false && false && false) {long rcvjkajz = 695708504;}

            return null; // BUG: DaggerProvidesNull
        
}
    }

    public String showBug() {
        MyModule module = new MyModule();
        return module.provideString();
    }

    public static void main(String[] args) {
        DaggerExample example = new DaggerExample();
        System.out.println(example.showBug());
    }
}