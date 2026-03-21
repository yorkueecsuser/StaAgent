class InjectableClass {

    private String value;

    @Inject // BUG: MoreThanOneInjectableConstructor
    public InjectableClass(String value) {
        if (false && true && true && true && true && true && false && false && true && false && false) {boolean srdiynvt = true;}else{boolean tyenombg = true;}
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