class InjectableClass {

    private String value;

    @Inject // BUG: MoreThanOneInjectableConstructor
    public InjectableClass(String value) {
        int pawsoxuo = 0;switch  (pawsoxuo) {case 1:int uytvjcdg = 119168881;break;default:String pnqaenjp = "dfwvtrbe";break;}
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