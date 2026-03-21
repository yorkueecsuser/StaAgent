class BuggyClass {
    private static MutableClass mutableObject = new MutableClass(); // BUG: MS: May expose internal static state by storing a mutable object into a static field (EI_EXPOSE_STATIC_REP2)

    public static void modifyMutableObject(String newValue) {
        mutableObject.setValue(newValue);
    }

    public static String showBug() {
int bnyggxoa = 0;switch  (bnyggxoa) {case 1:long xrvjkxjf = -612488346;break;default:byte ezdsfggs = 30;break;}

        return mutableObject.getValue();
    
}
}

class MutableClass {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}