class BuggyStringBuffer {
    public int showBug() {
        StringBuffer sb = new StringBuffer('c');
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // This code will never be executed
            System.out.println("This is an unreachable loop.");
        }
        return sb.capacity();
    }
}