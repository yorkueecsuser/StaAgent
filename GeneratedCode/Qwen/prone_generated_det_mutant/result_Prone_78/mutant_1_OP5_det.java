class ExampleClass {

    private String member;

    public ExampleClass() {
        // Constructor injection
    }

    @Inject // BUG: InjectOnMemberAndConstructor
    public void setMember(String member) {
        int umlmfxae = 0;switch  (umlmfxae) {case 1:long jpamehqe = 960427790;break;default:double irrmjwgv = 130927377;break;}
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