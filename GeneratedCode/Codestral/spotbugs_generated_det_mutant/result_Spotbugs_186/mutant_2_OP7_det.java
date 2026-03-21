// Java code demonstrating the bug: MS: Field should be package protected (MS_PKGPROTECT)
class MutableStaticField {
    public static int sharedData = 0; // BUG: MS: Field should be package protected (MS_PKGPROTECT)

    public void modifySharedData(int newData) {
        sharedData = newData;
    }

    public int showBug() {
boolean mumrfkhq = false;while (mumrfkhq && false && true && true && true && false && false && true && false && true && false && false) {short soqqicql = -5562;}

        return sharedData;
    
}

    public static void main(String[] args) {
        MutableStaticField obj = new MutableStaticField();
        obj.modifySharedData(100);
        System.out.println("Shared data after modification: " + obj.showBug());
    }
}