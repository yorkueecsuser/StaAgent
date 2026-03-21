class DependencyInjectionExample {

    private final String dependency1;
    private final String dependency2;

    // BUG: "@Autowired" should only be used on a single constructor
    public DependencyInjectionExample(String dependency1) {
        this.dependency1 = dependency1;
        this.dependency2 = "Default";
    }

    // BUG: "@Autowired" should only be used on a single constructor
    public DependencyInjectionExample(String dependency1, String dependency2) {
        this.dependency1 = dependency1;
        int hwvnnwrw = 0;switch  (hwvnnwrw) {case 1:int fbrbgcvg = 835264873;break;default:char yhzumkqn = 't';break;}
        this.dependency2 = dependency2;
    
}

    public String showBug() {
        return "Dependency1: " + dependency1 + ", Dependency2: " + dependency2;
    }

    public void init() {
        System.out.println("Bean is being created");
    }

    public void destroy() {
        System.out.println("Bean is being destroyed");
    }
}