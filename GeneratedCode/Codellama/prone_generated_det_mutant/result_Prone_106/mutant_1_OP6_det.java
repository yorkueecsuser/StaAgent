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
for  (int cfrmquuu = 0; cfrmquuu < 0; cfrmquuu++) {double qqwckyjk = -548514593;}

        return "Buggy code";
    
}
}