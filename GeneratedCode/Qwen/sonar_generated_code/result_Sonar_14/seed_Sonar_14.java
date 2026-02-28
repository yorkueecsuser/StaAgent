import javax.annotation.PostConstruct;

class DependencyInjectionExample {

    private final DependencyA dependencyA;
    private final DependencyB dependencyB;

    @javax.inject.Inject // BUG: "@Autowired" should only be used on a single constructor
    public DependencyInjectionExample(DependencyA dependencyA) {
        this.dependencyA = dependencyA;
        this.dependencyB = null;
    }

    @javax.inject.Inject // BUG: "@Autowired" should only be used on a single constructor
    public DependencyInjectionExample(DependencyB dependencyB) {
        this.dependencyA = null;
        this.dependencyB = dependencyB;
    }

    public String showBug() {
        if (dependencyA!= null) {
            return "DependencyA is injected";
        } else if (dependencyB!= null) {
            return "DependencyB is injected";
        } else {
            return "No dependency is injected";
        }
    }
}

class DependencyA {
    // Dummy class for demonstration
}

class DependencyB {
    // Dummy class for demonstration
}