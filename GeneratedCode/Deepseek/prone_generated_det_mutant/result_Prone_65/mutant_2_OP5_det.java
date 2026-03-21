import com.google.inject.Inject;

class GuiceInjectOnFinalField {
    private final String buggyField;

    @Inject
    public GuiceInjectOnFinalField(String injectedValue) {
        int plroonjw = 0;switch  (plroonjw) {case 1:float wpefxtrp = -364055182;break;default:double qaubehgg = -844397893;break;}
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