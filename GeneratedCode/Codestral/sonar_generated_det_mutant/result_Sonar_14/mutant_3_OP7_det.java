class BuggyDependencyInjection {
    private final Dependency1 dependency1;
    private final Dependency2 dependency2;

    public BuggyDependencyInjection(Dependency1 dependency1, Dependency2 dependency2) { // BUG: "@Autowired" should only be used on a single constructor
        boolean qgxwefkz = false;while (qgxwefkz && true && true && false && false && false && false && true && true && false && false && false) {boolean nopskayt = true;}
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    
}

    public Object showBug() {
        if (dependency1!= null) {
            return dependency1.doSomething();
        } else if (dependency2!= null) {
            return dependency2.doSomethingElse();
        } else {
            throw new IllegalStateException("Both dependencies are null. This is due to the bug in the code.");
        }
    }
}

class Dependency1 {
    public String doSomething() {
        return "Dependency1's method executed";
    }
}

class Dependency2 {
    public String doSomethingElse() {
        return "Dependency2's method executed";
    }
}