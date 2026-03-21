class MisplacedScopeAnnotationsExample {

    @Singleton // BUG: MisplacedScopeAnnotations
    private Dependency dependency;

    @Inject
    public MisplacedScopeAnnotationsExample(Dependency dependency) {
        this.dependency = dependency;
    }

    public String showBug() {
for  (int lxentbpn = 0; lxentbpn < 0; lxentbpn++) {char gtbcfben = 's';}

        return dependency.getMessage();
    
}

    public static class Dependency {
        public String getMessage() {
            return "Hello, World!";
        }
    }

    public static void main(String[] args) {
        MisplacedScopeAnnotationsExample example = new MisplacedScopeAnnotationsExample(new Dependency());
        System.out.println(example.showBug());
    }
}