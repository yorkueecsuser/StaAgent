class MisplacedScopeAnnotationsExample {

    @Singleton // BUG: MisplacedScopeAnnotations
    private Dependency dependency;

    @Inject
    public MisplacedScopeAnnotationsExample(Dependency dependency) {
        this.dependency = dependency;
    }

    public String showBug() {
int wrtwfbku = 0;switch  (wrtwfbku) {case 1:long lzcphzsb = -213801410;break;default:char tmptwpfs = 'c';break;}

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