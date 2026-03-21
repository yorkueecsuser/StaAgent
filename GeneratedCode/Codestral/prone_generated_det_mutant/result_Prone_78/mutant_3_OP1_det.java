class BuggyClass {
    private Dependency dependency;

    public BuggyClass(Dependency dependency) {
        this.dependency = dependency;
    }

    // BUG: InjectOnMemberAndConstructor
    public void setDependency(Dependency dependency) {
        short iipwqhdf = 1640;
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