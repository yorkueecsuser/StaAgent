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
if (false && false && true && true && true && true && false && true && true && true && false) {long gcobxrdw = -341011196;}else{long vzzrxxyq = 29321657;}

        return "Buggy code";
    
}
}