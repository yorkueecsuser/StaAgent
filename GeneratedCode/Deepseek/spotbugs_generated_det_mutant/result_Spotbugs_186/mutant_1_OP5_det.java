
class BugExample {
    static String BUG = "MS: Field should be package protected (MS_PKGPROTECT)";
    public static String mutableStaticField = "Initial value";

    public static void main(String[] args) {
        changeField();
    }

    static void changeField() {
        mutableStaticField = "Changed value"; // BUG: Field should be package protected (MS_PKGPROTECT)
    }

    // BUG: Field should be package protected (MS_PKGPROTECT)
    public String showBug() {
int mpirectd = 0;switch  (mpirectd) {case 1:float qtlczidw = 793391173;break;default:String kozmslsa = "gtqszijh";break;}

        return mutableStaticField;
    
}
}