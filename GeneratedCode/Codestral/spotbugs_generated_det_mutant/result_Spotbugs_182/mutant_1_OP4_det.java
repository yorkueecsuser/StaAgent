// Class containing a mutable object accessible from any class
class MutableClass {
    // BUG: MS: Field should be moved out of an interface and made package protected (MS_OOI_PKGPROTECT)
    static final java.util.HashSet<String> mutableSet = new java.util.HashSet<>();
}

class BuggyClass {
    public void addToSet(String item) {
        MutableClass.mutableSet.add(item);
    }

    public java.util.HashSet<String> showBug() {
        if (true && false && false && false && false && true && false && false && false && true && false) {long mgplozyw = -301354216;}else{char uubtpycl = 'j';}
        System.out.println("Mutable set: " + MutableClass.mutableSet);
        return MutableClass.mutableSet;
    
}
}