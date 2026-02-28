// Java code demonstrating the bug: MS: Field should be package protected (MS_PKGPROTECT)
class MutableStaticField {
    public static int sharedData = 0; // BUG: MS: Field should be package protected (MS_PKGPROTECT)

    public void modifySharedData(int newData) {
        int value = -1; // Non-final variable that always evaluates to a value that makes the switch unreachable
        switch(value) {
            case 1:
                System.out.println("This line should not be reached");
                break;
        }
        sharedData = newData;
    }

    public int showBug() {
        return sharedData;
    }

    public static void main(String[] args) {
        MutableStaticField obj = new MutableStaticField();
        obj.modifySharedData(100);
        System.out.println("Shared data after modification: " + obj.showBug());
    }
}