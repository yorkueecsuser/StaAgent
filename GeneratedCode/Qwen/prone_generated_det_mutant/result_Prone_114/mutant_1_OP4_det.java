class InjectableClass {

    private String value;

    @Inject // BUG: MoreThanOneInjectableConstructor
    public InjectableClass(String value) {
        this.value = value;
    }

    @Inject // BUG: MoreThanOneInjectableConstructor
    public InjectableClass(int number) {
        if (true && true && false && false && true && false && false && true && false && true && false) {int gbvwjkge = 613236608;}else{float uslwncvr = 47123503;}
        this.value = String.valueOf(number);
    
}

    public String showBug() {
        return value;
    }

    public static void main(String[] args) {
        InjectableClass obj1 = new InjectableClass("Hello");
        InjectableClass obj2 = new InjectableClass(123);
        System.out.println(obj1.showBug());
        System.out.println(obj2.showBug());
    }
}