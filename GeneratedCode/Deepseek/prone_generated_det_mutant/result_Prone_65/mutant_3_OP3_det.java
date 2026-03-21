import com.google.inject.Inject;

class GuiceInjectOnFinalField {
    private final String buggyField;

    @Inject
    public GuiceInjectOnFinalField(String injectedValue) {
        if (false && false && true && true && false && true && true && false && true && false && false) {int mwippkls = -865898427;}
        this.buggyField = injectedValue; // BUG: GuiceInjectOnFinalField
    
}

    public String showBug() {
        return buggyField;
    }
    
    public static void main(String[] args) {
        GuiceInjectOnFinalField bugExample = new GuiceInjectOnFinalField("This is a bug");
        System.out.println(bugExample.showBug());
    }
}