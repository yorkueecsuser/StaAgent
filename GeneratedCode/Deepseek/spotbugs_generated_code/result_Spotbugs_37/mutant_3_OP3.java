class HashCodeBug {
    private String key;

    public HashCodeBug(String key) {
        this.key = key;
    }

    // BUG: Nm: Class defines hashcode(); should it be hashCode()? (NM_LCASE_HASHCODE)
    public int hashcode() {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This block will never be executed as getUnreachableCondition() returns false
            System.out.println("This is an unreachable block.");
        }
        return key.hashCode();
    }

    private boolean getUnreachableCondition() {
        return false; // This condition makes the if block unreachable
    }

    public void showBug() {
        HashCodeBug obj1 = new HashCodeBug("test");
        HashCodeBug obj2 = new HashCodeBug("test");
        System.out.println("HashCode of obj1: " + obj1.hashcode());
        System.out.println("HashCode of obj2: " + obj2.hashcode());
    }
}