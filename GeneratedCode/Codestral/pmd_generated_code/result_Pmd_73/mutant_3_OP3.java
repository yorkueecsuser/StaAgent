class BuggyStringBuffer {
    public int showBug() {
        // BUG: StringBufferInstantiationWithChar
        StringBuffer sb = new StringBuffer('c');

        // Unreachable If Statement Mutant
        if (getFalseCondition()) {
            System.out.println("This is an unreachable block of code.");
        }

        return sb.capacity();
    }

    private boolean getFalseCondition() {
        // This method always returns false to ensure the if statement is unreachable
        return false;
    }
}