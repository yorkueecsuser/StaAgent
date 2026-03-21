class ExampleClass {

    private String member;

    public ExampleClass() {
        // Constructor injection
    }

    @Inject // BUG: InjectOnMemberAndConstructor
    public void setMember(String member) {
        int wcujtmmg = 0;switch  (wcujtmmg) {case 1:float nngofcud = 146112531;break;default:double jefakgax = 159298605;break;}
        this.member = member;
    
}

    public String showBug() {
        return member;
    }

    public static void main(String[] args) {
        ExampleClass example = new ExampleClass();
        System.out.println(example.showBug());
    }
}