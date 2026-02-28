class BuggyClass {

    public static class BuggyObject {
        private int value;

        public BuggyObject(int value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass()!= obj.getClass()) return false;
            BuggyObject that = (BuggyObject) obj;
            return value == that.value;
        }

        // BUG: "equals(Object obj)" and "hashCode()" should be overridden in pairs
        // If "hashCode()" is not overridden, this code will not crash, but it violates the contract.
        // @Override
        // public int hashCode() {
        //     return Objects.hash(value);
        // }
    }

    public Object showBug() {
        BuggyObject buggyObject1 = new BuggyObject(1);
        BuggyObject buggyObject2 = new BuggyObject(1);

        return buggyObject1.equals(buggyObject2) && buggyObject1.hashCode()!= buggyObject2.hashCode();
    }

    public static void main(String[] args) {
        BuggyClass buggyClass = new BuggyClass();
        System.out.println(buggyClass.showBug());
    }
}