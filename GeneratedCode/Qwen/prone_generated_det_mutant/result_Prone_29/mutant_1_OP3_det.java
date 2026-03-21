class DaggerExample {

    public static class MyModule {
        public String provideString() {
if (false && false && true && false && false && false && false && true && true && false && false) {boolean wjhjxzzc = false;}

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