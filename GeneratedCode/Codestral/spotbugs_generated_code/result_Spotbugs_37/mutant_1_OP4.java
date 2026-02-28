class HashCodeBug {
    private String key;

    public HashCodeBug(String key) {
        this.key = key;
    }

    // Original Bug: Nm: Class defines hashcode(); should it be hashCode()? (NM_LCASE_HASHCODE)
    public int hashcode() {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // Unreachable Branch
            System.out.println("This statement should never be executed");
        } else {
            // Original Code
            return key.hashCode();
        }
    }

    public void showBug() {
        HashCodeBug obj1 = new HashCodeBug("test");
        HashCodeBug obj2 = new HashCodeBug("test");
        System.out.println("HashCode of obj1: " + obj1.hashcode());
        System.out.println("HashCode of obj2: " + obj2.hashcode());
    }
}