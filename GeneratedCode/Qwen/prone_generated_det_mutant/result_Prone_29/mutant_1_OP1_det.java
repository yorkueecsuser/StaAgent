class DaggerExample {

    public static class MyModule {
        public String provideString() {
float tghzkeob = -659607010;

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