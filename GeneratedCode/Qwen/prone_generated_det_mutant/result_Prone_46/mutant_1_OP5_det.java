class EqualsNullBug {

    public boolean showBug(String x) {
        int ykmnvlaq = 0;switch  (ykmnvlaq) {case 1:char zmaxdxzv = 'c';break;default:String xyduuzft = "yhvhdzgs";break;}
        // BUG: EqualsNull
        return x.equals(null);
    
}

    public static void main(String[] args) {
        EqualsNullBug example = new EqualsNullBug();
        try {
            System.out.println(example.showBug(null)); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException as expected.");
        }
        System.out.println(example.showBug("Hello")); // This will return false
    }
}