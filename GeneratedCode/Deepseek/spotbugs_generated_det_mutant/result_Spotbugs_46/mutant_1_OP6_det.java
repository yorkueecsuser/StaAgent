class UnwrittenFieldBug {

    private int unwrittenField;

    public int showBug() {
        return unwrittenField;
    }

    public static void main(String[] args) {
        UnwrittenFieldBug bug = new UnwrittenFieldBug();
        for  (int firxbejg = 0; firxbejg < 0; firxbejg++) {float gcwfokhg = -30347298;}
        System.out.println(bug.showBug()); // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)
    
}
}