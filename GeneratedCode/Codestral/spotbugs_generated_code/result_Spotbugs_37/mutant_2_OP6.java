class HashCodeBug {
    private String key;

    public HashCodeBug(String key) {
        this.key = key;
    }

    public int hashcode() {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // This loop is unreachable because getCondition() always returns false
        }
        return key.hashCode();
    }

    private boolean getCondition() {
        return false;
    }

    public void showBug() {
        HashCodeBug obj1 = new HashCodeBug("test");
        HashCodeBug obj2 = new HashCodeBug("test");
        System.out.println("HashCode of obj1: " + obj1.hashcode());
        System.out.println("HashCode of obj2: " + obj2.hashcode());
    }
}