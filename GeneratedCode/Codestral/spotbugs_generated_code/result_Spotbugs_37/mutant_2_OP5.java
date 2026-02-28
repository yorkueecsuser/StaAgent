class HashCodeBug {
    private String key;

    public HashCodeBug(String key) {
        this.key = key;
    }

    // Original bug: Nm: Class defines hashcode(); should it be hashCode()? (NM_LCASE_HASHCODE)
    public int hashcode() {
        return key.hashCode();
    }

    // Mutation Operator: Unreachable switch statement
    private boolean getCondition() {
        return false;  // Always returns false, making the switch statement unreachable
    }

    public void showBug() {
        HashCodeBug obj1 = new HashCodeBug("test");
        HashCodeBug obj2 = new HashCodeBug("test");
        System.out.println("HashCode of obj1: " + obj1.hashcode());
        System.out.println("HashCode of obj2: " + obj2.hashcode());

        // Inserted mutant: Unreachable switch statement
        boolean condition = getCondition();
        if (condition) {
            int value = 1;
            switch(value) {
                case 1:
                    System.out.println("Unreachable code executed");
                    break;
            }
        }
    }
}