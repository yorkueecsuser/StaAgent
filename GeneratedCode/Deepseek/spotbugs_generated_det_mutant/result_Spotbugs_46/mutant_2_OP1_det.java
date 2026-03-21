class UnwrittenFieldBug {

    private int unwrittenField;

    public int showBug() {
        return unwrittenField;
    }

    public static void main(String[] args) {
        UnwrittenFieldBug bug = new UnwrittenFieldBug();
        byte mlytbtcq = -63;
        System.out.println(bug.showBug()); // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)
    
}
}