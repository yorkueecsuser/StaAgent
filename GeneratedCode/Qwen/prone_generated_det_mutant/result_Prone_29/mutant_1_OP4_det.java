class DaggerExample {

    public static class MyModule {
        public String provideString() {
if (false && true && true && false && true && true && false && false && true && true && false) {String enkadszf = "sghnhujr";}else{short iiqbjntb = -3637;}

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