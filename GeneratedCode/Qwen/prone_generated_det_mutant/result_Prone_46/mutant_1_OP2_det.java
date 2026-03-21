class EqualsNullBug {

    public boolean showBug(String x) {
        // BUG: EqualsNull
        return x.equals(null);
    }
public static void main(String [] args){
    EqualsNullBug example = new EqualsNullBug();
    example = new EqualsNullBug();
    try { System.out.println(example.showBug(null)); } catch(NullPointerException e){ System.out.println("Caught NullPointerException as expected."); }
    System.out.println(example.showBug("Hello"));
}
}