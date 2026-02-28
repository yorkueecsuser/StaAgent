class HashCodeBug {
    private String key;

    public HashCodeBug(String key) {
        this.key = key;
    }

    public int hashcode() {
        boolean shouldRun = false;
        if (shouldRun) {
            throw new RuntimeException("This code should be unreachable");
        } else {
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