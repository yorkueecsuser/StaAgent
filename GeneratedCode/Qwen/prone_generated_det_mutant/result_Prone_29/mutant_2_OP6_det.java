class DaggerExample {

    public static class MyModule {
        public String provideString() {
for  (int mazsgpmb = 0; mazsgpmb < 0; mazsgpmb++) {char gvleygtc = 's';}

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