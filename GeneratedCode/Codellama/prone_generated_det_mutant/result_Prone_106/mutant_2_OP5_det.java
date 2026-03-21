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
int ztjzdexl = 0;switch  (ztjzdexl) {case 1:long yspaegwg = 866942776;break;default:int vknpekmi = -925294292;break;}

        return "Buggy code";
    
}
}