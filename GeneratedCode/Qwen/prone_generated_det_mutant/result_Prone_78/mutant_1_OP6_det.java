class ExampleClass {

    private String member;

    public ExampleClass() {
        // Constructor injection
    }

    @Inject // BUG: InjectOnMemberAndConstructor
    public void setMember(String member) {
        for  (int zuqbyjmr = 0; zuqbyjmr < 0; zuqbyjmr++) {float cdngxycn = -110914774;}
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