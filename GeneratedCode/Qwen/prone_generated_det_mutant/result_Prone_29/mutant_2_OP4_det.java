class DaggerExample {

    public static class MyModule {
        public String provideString() {
if (false && false && false && false && false && false && true && true && true && false && false) {long zgvefuzd = 602804883;}else{double roazyuxn = -348470765;}

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