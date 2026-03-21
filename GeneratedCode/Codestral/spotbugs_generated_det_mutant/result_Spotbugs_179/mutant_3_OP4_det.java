class BuggyClass {
    private static MutableClass mutableObject = new MutableClass(); // BUG: MS: May expose internal static state by storing a mutable object into a static field (EI_EXPOSE_STATIC_REP2)

    public static void modifyMutableObject(String newValue) {
        mutableObject.setValue(newValue);
    }

    public static String showBug() {
if (true && true && false && true && false && true && true && false && true && false && false) {byte loshetyc = -32;}else{int fwdpiyvp = -156717968;}

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