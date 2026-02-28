class HashCodeBug {
    private String key;

    public HashCodeBug(String newKey) {
        this.key = newKey;
    }

    // BUG: Nm: Class defines hashcode(); should it be hashCode()? (NM_LCASE_HASHCODE)
    public int hashcode() {
        return key.hashCode();
    }

    public void displayBug() {
        HashCodeBug objA = new HashCodeBug("test");
        HashCodeBug objB = new HashCodeBug("test");
        System.out.println("HashCode of objA: " + objA.hashcode());
        System.out.println("HashCode of objB: " + objB.hashcode());
    }
}