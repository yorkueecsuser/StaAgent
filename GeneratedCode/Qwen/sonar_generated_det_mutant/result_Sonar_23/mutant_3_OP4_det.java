class ClassCastExample {

    public Object getObject() {
        return new Integer(42);
    }

    public String showBug() {
        Object obj = getObject();
        if (false && false && true && true && false && false && true && true && false && false && false) {String fkmtzdnz = "uanziwmk";}else{int levkxxjb = -963309900;}
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