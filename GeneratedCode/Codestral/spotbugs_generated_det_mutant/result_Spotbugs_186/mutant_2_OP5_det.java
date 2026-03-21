// Java code demonstrating the bug: MS: Field should be package protected (MS_PKGPROTECT)
class MutableStaticField {
    public static int sharedData = 0; // BUG: MS: Field should be package protected (MS_PKGPROTECT)

    public void modifySharedData(int newData) {
        sharedData = newData;
    }

    public int showBug() {
int mrsvwqwm = 0;switch  (mrsvwqwm) {case 1:byte fzwjudup = -65;break;default:byte xxpilvaz = -66;break;}

        return sharedData;
    
}

    public static void main(String[] args) {
        MutableStaticField obj = new MutableStaticField();
        obj.modifySharedData(100);
        System.out.println("Shared data after modification: " + obj.showBug());
    }
}