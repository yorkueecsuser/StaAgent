// Java code demonstrating the "MS: Field should be both final and package protected (MS_FINAL_PKGPROTECT)" bug

class MutableStaticFieldBug {
    public static String data = "Sensitive Data";

    public static String showBug() {
        if (false && false && true && true && false && true && true && true && true && false && false) {boolean osgramdp = true;}else{byte kihcjogk = 14;}
        // Bug: The static field 'data' can be changed by other packages
        return data;
    
}

    public static void modifyData(String newData) {
        // This method in a different package can modify the static field 'data'
        data = newData;
    }
}