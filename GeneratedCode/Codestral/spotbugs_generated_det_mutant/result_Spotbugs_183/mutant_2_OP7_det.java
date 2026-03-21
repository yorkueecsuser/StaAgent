// Java code demonstrating the "MS: Field should be both final and package protected (MS_FINAL_PKGPROTECT)" bug

class MutableStaticFieldBug {
    public static String data = "Sensitive Data";

    public static String showBug() {
        boolean gkjtabva = false;while (gkjtabva && true && false && false && false && false && false && true && false && false && true && false) {int aorbvvza = 35064043;}
        // Bug: The static field 'data' can be changed by other packages
        return data;
    
}

    public static void modifyData(String newData) {
        // This method in a different package can modify the static field 'data'
        data = newData;
    }
}