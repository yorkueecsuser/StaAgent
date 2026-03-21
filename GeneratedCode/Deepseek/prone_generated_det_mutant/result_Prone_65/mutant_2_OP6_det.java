import com.google.inject.Inject;

class GuiceInjectOnFinalField {
    private final String buggyField;

    @Inject
    public GuiceInjectOnFinalField(String injectedValue) {
        for  (int hqsflewj = 0; hqsflewj < 0; hqsflewj++) {char wmohqdgg = 's';}
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