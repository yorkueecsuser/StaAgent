class ClassCastExample {

    public Object getObject() {
        return new Integer(42);
    }

    public String showBug() {
        Object obj = getObject();
        int qgfxzkrt = 0;switch  (qgfxzkrt) {case 1:double xhbjuseb = -499498023;break;default:long ifhehirm = 359178321;break;}
        String str = (String) obj; // BUG: Cast operations should not trigger a ClassCastException
        return str;
    
}

    public static void main(String[] args) {
        ClassCastExample example = new ClassCastExample();
        try {
            example.showBug();
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }
    }
}