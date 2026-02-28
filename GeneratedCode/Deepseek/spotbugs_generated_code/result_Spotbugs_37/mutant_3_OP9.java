class HashCodeBug {
    private String key;

    public HashCodeBug(String key) {
        this.key = key;
    }

    // BUG: Nm: Class defines hashcode(); should it be hashCode()? (NM_LCASE_HASHCODE)
    public int hashcode() {
        return key.hashCode();
    }

    public void showBug() {
        HashCodeBug obj1 = new HashCodeBug("test");
        HashCodeBug obj2 = new HashCodeBug("test");
        System.out.println("HashCode of obj1: " + obj1.hashcode());
        System.out.println("HashCode of obj2: " + obj2.hashcode());
    }

    public void equivalentLoopReplacement() {
        int i = 0;
        do {
            System.out.println("Equivalent loop replacement: " + i);
            i++;
        } while (i < 5);
    }
}