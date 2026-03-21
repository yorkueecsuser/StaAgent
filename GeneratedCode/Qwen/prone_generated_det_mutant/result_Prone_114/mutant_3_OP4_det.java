class InjectableClass {

    private String value;

    @Inject // BUG: MoreThanOneInjectableConstructor
    public InjectableClass(String value) {
        this.value = value;
    }

    @Inject // BUG: MoreThanOneInjectableConstructor
    public InjectableClass(int number) {
        if (false && true && true && false && false && false && false && false && true && true && false) {int bptltkqs = 286419604;}else{byte omctsncv = 59;}
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