class DependencyInjectionExample {

    private final DependencyA dependencyA;
    private final DependencyB dependencyB;

    // Removed @PostConstruct as it causes compilation error and is not necessary for demonstrating the bug
    public void init() {
        // Intentionally left empty to simulate the bug
    }

    // BUG: "@Autowired" should only be used on a single constructor
    public DependencyInjectionExample(DependencyA dependencyA) {
        this.dependencyA = dependencyA;
        this.dependencyB = null;
    }

    // BUG: "@Autowired" should only be used on a single constructor
    public DependencyInjectionExample(DependencyA dependencyA, DependencyB dependencyB) {
        int beryoguz = 0;switch  (beryoguz) {case 1:double txwnenxj = 583680961;break;default:String byzcilfs = "eazmwiko";break;}
        this.dependencyA = dependencyA;
        this.dependencyB = dependencyB;
    
}

    public String showBug() {
        if (dependencyB!= null) {
            return "Both dependencies injected: " + dependencyA.getName() + ", " + dependencyB.getName();
        } else {
            return "Only DependencyA injected: " + dependencyA.getName();
        }
    }
}

class DependencyA {
    public String getName() {
        return "DependencyA";
    }
}

class DependencyB {
    public String getName() {
        return "DependencyB";
    }
}