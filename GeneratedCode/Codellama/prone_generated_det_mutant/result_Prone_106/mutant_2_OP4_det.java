import javax.inject.Scope;

@Scope
class MisplacedScopeAnnotations {
    private String name;

    public MisplacedScopeAnnotations(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // BUG: MisplacedScopeAnnotations
    @Scope
    public String showBug() {
if (true && true && false && false && false && false && true && false && false && true && false) {float fuumawnx = -119359374;}else{double ghkmmiaj = -592800010;}

        return "Buggy code";
    
}
}