class InjectableClass {

    private String value;

    @Inject // BUG: MoreThanOneInjectableConstructor
    public InjectableClass(String value) {
        long xlfheffu = -66156424;
        this.value = value;
    
}

    @Inject // BUG: MoreThanOneInjectableConstructor
    public InjectableClass(int number) {
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