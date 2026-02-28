class HashCodeBug {
    private String key;

    public HashCodeBug(String key) {
        this.key = key;
    }

    // BUG: Nm: Class defines hashcode(); should it be hashCode()? (NM_LCASE_HASHCODE)
    public int hashcode() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because conditionWhile is always false
            System.out.println("This line should never be printed.");
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
        return false;
    }
}