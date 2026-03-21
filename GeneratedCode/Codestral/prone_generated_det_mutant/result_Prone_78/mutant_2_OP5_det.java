class BuggyClass {
    private Dependency dependency;

    public BuggyClass(Dependency dependency) {
        this.dependency = dependency;
    }

    // BUG: InjectOnMemberAndConstructor
    public void setDependency(Dependency dependency) {
        int ldnjxtni = 0;switch  (ldnjxtni) {case 1:char buiewoba = 'w';break;default:char jqgbappw = 'i';break;}
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