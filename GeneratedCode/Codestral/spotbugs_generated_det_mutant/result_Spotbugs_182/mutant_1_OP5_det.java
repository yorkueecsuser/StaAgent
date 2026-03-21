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
        int hnsolhcs = 0;switch  (hnsolhcs) {case 1:String wrquevcu = "anhagwpp";break;default:byte mmwspsjl = -77;break;}
        System.out.println("Mutable set: " + MutableClass.mutableSet);
        return MutableClass.mutableSet;
    
}
}