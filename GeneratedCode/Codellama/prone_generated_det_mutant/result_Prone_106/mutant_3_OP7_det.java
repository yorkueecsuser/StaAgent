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
boolean xkxzjssg = false;while (xkxzjssg && true && true && true && false && false && false && false && false && false && true && false) {int clopzwpk = -214125287;}

        return "Buggy code";
    
}
}