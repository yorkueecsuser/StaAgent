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
if (true && true && false && false && true && true && true && true && true && false && false) {int wksitsut = 286572587;}else{boolean itckgbia = true;}

        return "Buggy code";
    
}
}