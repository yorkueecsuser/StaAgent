import com.google.inject.Inject;

class GuiceInjectOnFinalField {
    private final String buggyField;

    @Inject
    public GuiceInjectOnFinalField(String injectedValue) {
        boolean xwxigmhg = false;while (xwxigmhg && false && true && false && false && true && true && false && false && false && false && false) {long cdimxwtu = -110524079;}
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