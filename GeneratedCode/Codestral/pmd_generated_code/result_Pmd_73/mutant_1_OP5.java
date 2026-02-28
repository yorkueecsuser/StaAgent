class BuggyStringBuffer {
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug() {
        StringBuffer sb = new StringBuffer('c');

        // Mutated code: Inserting unreachable switch statement
        if (getFalseCondition()) {
            int value = 0;
            switch(value) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
            }
        }

        return sb.capacity();
    }
}