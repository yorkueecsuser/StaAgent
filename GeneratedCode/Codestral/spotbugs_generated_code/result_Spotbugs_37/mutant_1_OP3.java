class HashCodeBug {
    private String key;

    public HashCodeBug(String key) {
        this.key = key;
    }

    // Original bug: Nm: Class defines hashcode(); should it be hashCode()? (NM_LCASE_HASHCODE)
    public int hashcode() {
        return key.hashCode();
    }

    // Mutant code added: Unreachable if statement
    private boolean getCondition() {
        return false; // Always returns false to make the if statement unreachable
    }

    public void showBug() {
        HashCodeBug obj1 = new HashCodeBug("test");
        HashCodeBug obj2 = new HashCodeBug("test");
        System.out.println("HashCode of obj1: " + obj1.hashcode());
        System.out.println("HashCode of obj2: " + obj2.hashcode());

        // Unreachable if statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This code will never be executed");
        }
    }
}