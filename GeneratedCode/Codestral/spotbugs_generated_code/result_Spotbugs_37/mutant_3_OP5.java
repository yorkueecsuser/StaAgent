class HashCodeBug {
    private String key;

    public HashCodeBug(String key) {
        this.key = key;
    }

    public int hashcode() {
        return key.hashCode();
    }

    private boolean getFalseCondition() {
        return false;
    }

    public void showBug() {
        HashCodeBug obj1 = new HashCodeBug("test");
        HashCodeBug obj2 = new HashCodeBug("test");
        System.out.println("HashCode of obj1: " + obj1.hashcode());
        System.out.println("HashCode of obj2: " + obj2.hashcode());

        // Added mutant code: unreachable switch statement
        boolean condition = getFalseCondition();
        if (condition) {
            int value = 0; // This value will never be used as the condition is always false
            switch (value) {
                case 1:
                    System.out.println("This line should never be executed.");
                    break;
            }
        }
    }
}