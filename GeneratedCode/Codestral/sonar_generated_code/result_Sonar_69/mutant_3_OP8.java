class HelloWorld {
    private String a; // Mutant: Renaming 'hello' to 'a'

    public void setA(String a) { // Mutant: Renaming'setHello' to'setA'
        this.a = a;
    }

    public String getA() { // Mutant: Renaming 'getHello' to 'getA'
        return a;
    }

    public String greet(String greetee) {
        return "Hello " + greetee;
    }

    public void showBug(String greetee) {
        System.out.println(greet(greetee));
    }
}