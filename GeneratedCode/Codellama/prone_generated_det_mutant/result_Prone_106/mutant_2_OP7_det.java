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
boolean acdbjdbq = false;while (acdbjdbq && true && true && true && true && true && false && false && true && false && true && false) {long zpxxsymr = 236695030;}

        return "Buggy code";
    
}
}