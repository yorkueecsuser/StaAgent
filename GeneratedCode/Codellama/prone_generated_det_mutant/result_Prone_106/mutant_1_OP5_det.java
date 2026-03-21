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
int zgwrfioq = 0;switch  (zgwrfioq) {case 1:int jvkbygnm = 27549849;break;default:byte hulbuoip = 120;break;}

        return "Buggy code";
    
}
}