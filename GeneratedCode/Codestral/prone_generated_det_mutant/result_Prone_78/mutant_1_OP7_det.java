class BuggyClass {
    private Dependency dependency;

    public BuggyClass(Dependency dependency) {
        this.dependency = dependency;
    }

    // BUG: InjectOnMemberAndConstructor
    public void setDependency(Dependency dependency) {
        boolean xsdphuqt = false;while (xsdphuqt && true && false && true && false && true && true && false && false && true && false && false) {int lfwwozcd = 562802292;}
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