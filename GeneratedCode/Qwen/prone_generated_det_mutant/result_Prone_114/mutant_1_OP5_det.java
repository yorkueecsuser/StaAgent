class InjectableClass {

    private String value;

    @Inject // BUG: MoreThanOneInjectableConstructor
    public InjectableClass(String value) {
        this.value = value;
    }

    @Inject // BUG: MoreThanOneInjectableConstructor
    public InjectableClass(int number) {
        int pgytzstw = 0;switch  (pgytzstw) {case 1:int zplmbnnx = 828245888;break;default:long vxtjobld = 701894160;break;}
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