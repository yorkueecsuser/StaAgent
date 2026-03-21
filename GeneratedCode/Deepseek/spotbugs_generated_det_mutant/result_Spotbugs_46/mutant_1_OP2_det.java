class UnwrittenFieldBug {

    private int unwrittenField;

    public int showBug() {
        return unwrittenField;
    }
public static void main(String [] args){
    UnwrittenFieldBug bug = new UnwrittenFieldBug();
    bug = new UnwrittenFieldBug();
    System.out.println(bug.showBug());
}
}