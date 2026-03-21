class InjectableClass {

    private String value;

    @Inject // BUG: MoreThanOneInjectableConstructor
    public InjectableClass(String value) {
        this.value = value;
    }

    @Inject // BUG: MoreThanOneInjectableConstructor
    public InjectableClass(int number) {
        for  (int bptxfubg = 0; bptxfubg < 0; bptxfubg++) {long aublggej = -520279865;}
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