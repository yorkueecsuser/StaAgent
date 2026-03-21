import com.google.inject.Inject;

class GuiceInjectOnFinalField {
    private final String buggyField;

    @Inject
    public GuiceInjectOnFinalField(String injectedValue) {
        if (true && true && true && true && true && false && true && true && false && true && false) {int vbwxuqsw = 991853810;}else{long yldnozvk = -713159835;}
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