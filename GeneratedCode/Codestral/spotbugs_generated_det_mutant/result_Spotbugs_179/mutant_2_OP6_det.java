class BuggyClass {
    private static MutableClass mutableObject = new MutableClass(); // BUG: MS: May expose internal static state by storing a mutable object into a static field (EI_EXPOSE_STATIC_REP2)

    public static void modifyMutableObject(String newValue) {
        mutableObject.setValue(newValue);
    }

    public static String showBug() {
for  (int hptatbzi = 0; hptatbzi < 0; hptatbzi++) {boolean nvckxtma = true;}

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