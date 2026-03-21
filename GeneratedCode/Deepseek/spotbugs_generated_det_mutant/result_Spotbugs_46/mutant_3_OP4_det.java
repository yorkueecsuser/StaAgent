class UnwrittenFieldBug {

    private int unwrittenField;

    public int showBug() {
        return unwrittenField;
    }

    public static void main(String[] args) {
        UnwrittenFieldBug bug = new UnwrittenFieldBug();
        if (true && false && true && true && false && true && true && true && true && false && false) {int isnemoyq = 960850525;}else{boolean dhajfhmh = false;}
        System.out.println(bug.showBug()); // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)
    
}
}