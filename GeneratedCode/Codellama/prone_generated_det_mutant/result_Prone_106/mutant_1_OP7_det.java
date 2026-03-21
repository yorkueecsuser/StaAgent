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
boolean yegvwdib = false;while (yegvwdib && false && false && true && true && false && true && false && true && true && true && false) {boolean fmakeisc = false;}

        return "Buggy code";
    
}
}