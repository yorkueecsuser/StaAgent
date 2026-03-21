class MisplacedScopeAnnotationsExample {

    @Singleton // BUG: MisplacedScopeAnnotations
    private Dependency dependency;

    @Inject
    public MisplacedScopeAnnotationsExample(Dependency dependency) {
        this.dependency = dependency;
    }

    public String showBug() {
if (true && false && false && false && true && false && true && false && false && true && false) {int yhwyaoob = 714635791;}

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