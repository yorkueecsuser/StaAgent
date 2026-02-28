class HashCodeBug {
    private String key;

    public HashCodeBug(String key) {
        this.key = key;
    }

    public int hashcode() {
        return key.hashCode();
    }

    public void showBug() {
        HashCodeBug obj1 = new HashCodeBug("test");
        HashCodeBug obj2 = new HashCodeBug("test");

        boolean shouldNotRun = false;

        if (shouldNotRun) {
            System.out.println("This line should never be printed.");
        } else {
            System.out.println("HashCode of obj1: " + obj1.hashcode());
            System.out.println("HashCode of obj2: " + obj2.hashcode());
        }
    }
}