class HashCodeBug {
    private String key;

    public HashCodeBug(String key) {
        this.key = key;
    }

    // Original bug: Nm: Class defines hashcode(); should it be hashCode()? (NM_LCASE_HASHCODE)
    public int hashcode() {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This branch is unreachable due to the false condition
            System.out.println("Unreachable code executed");
        }
        return key.hashCode();
    }

    private boolean getUnreachableCondition() {
        // This method always returns false to make the if statement unreachable
        return false;
    }

    public void showBug() {
        HashCodeBug obj1 = new HashCodeBug("test");
        HashCodeBug obj2 = new HashCodeBug("test");
        System.out.println("HashCode of obj1: " + obj1.hashcode());
        System.out.println("HashCode of obj2: " + obj2.hashcode());
    }
}