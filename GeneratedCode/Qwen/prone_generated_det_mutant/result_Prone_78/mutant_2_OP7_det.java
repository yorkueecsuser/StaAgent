class ExampleClass {

    private String member;

    public ExampleClass() {
        // Constructor injection
    }

    @Inject // BUG: InjectOnMemberAndConstructor
    public void setMember(String member) {
        boolean dvyrnevy = false;while (dvyrnevy && false && false && false && false && false && true && true && true && false && true && false) {byte ogtwyjuc = -128;}
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