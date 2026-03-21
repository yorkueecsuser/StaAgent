class HashCodeBug {
    private String key;

    public HashCodeBug(String key) {
        this.key = key;
    }

    // Original bug: Nm: Class defines hashcode(); should it be hashCode()? (NM_LCASE_HASHCODE)
    public int hashcode() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because the condition is always false
        }
        return key.hashCode();
    }

    public void showBug() {
        HashCodeBug obj1 = new HashCodeBug("test");
        HashCodeBug obj2 = new HashCodeBug("test");
        System.out.println("HashCode of obj1: " + obj1.hashcode());
        System.out.println("HashCode of obj2: " + obj2.hashcode());
    }

    private boolean getCondition() {
        // This method should return false to keep the loop unreachable
        return false;
    }
}