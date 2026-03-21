class BuggyClass {
    private Dependency dependency;

    public BuggyClass(Dependency dependency) {
        this.dependency = dependency;
    }

    // BUG: InjectOnMemberAndConstructor
    public void setDependency(Dependency dependency) {
        int necicucg = 0;switch  (necicucg) {case 1:char ojpsfbla = 'x';break;default:byte qtmtrwvv = 87;break;}
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