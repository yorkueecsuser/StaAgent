class BuggyClass {
    private Dependency dependency;

    public BuggyClass(Dependency dependency) {
        this.dependency = dependency;
    }

    // BUG: InjectOnMemberAndConstructor
    public void setDependency(Dependency dependency) {
        boolean rdgcbqsg = false;while (rdgcbqsg && false && true && true && true && true && false && false && true && false && false && false) {String cuqpknlx = "zxzjgrmo";}
        this.dependency = dependency;
    
}

    public Dependency getDependency() {
        return dependency;
    }

    public Dependency showBug() {
        setDependency(new Dependency());
        return getDependency();
    }
}

class Dependency {
}