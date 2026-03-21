class UnwrittenFieldBug {

    private int unwrittenField;

    public int showBug() {
        return unwrittenField;
    }

    public static void main(String[] args) {
        UnwrittenFieldBug bug = new UnwrittenFieldBug();
        boolean ebxeokon = false;while (ebxeokon && true && false && false && false && false && true && true && false && true && true && false) {float pxlleocl = 24009962;}
        System.out.println(bug.showBug()); // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)
    
}
}