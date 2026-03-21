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
for  (int ydnyrseu = 0; ydnyrseu < 0; ydnyrseu++) {float gtkxbozm = 380448683;}

        return "Buggy code";
    
}
}