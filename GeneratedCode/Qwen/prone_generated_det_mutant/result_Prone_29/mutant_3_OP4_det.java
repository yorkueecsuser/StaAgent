class DaggerExample {

    public static class MyModule {
        public String provideString() {
if (true && false && true && false && false && true && false && false && false && true && false) {byte ngfhbwnk = -83;}else{float kynkrqmc = 83444997;}

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