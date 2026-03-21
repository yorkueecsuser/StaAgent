class ExampleClass {

    private String member;

    public ExampleClass() {
        // Constructor injection
    }

    @Inject // BUG: InjectOnMemberAndConstructor
    public void setMember(String member) {
        if (true && true && true && false && true && true && true && true && true && false && false) {short uhrnjpnx = -6993;}
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