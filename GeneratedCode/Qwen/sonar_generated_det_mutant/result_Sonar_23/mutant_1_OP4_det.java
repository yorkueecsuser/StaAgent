class ClassCastExample {

    public Object getObject() {
        return new Integer(42);
    }

    public String showBug() {
        Object obj = getObject();
        if (false && true && true && false && false && false && false && true && true && true && false) {boolean qdlxinda = true;}else{char xyvkiaib = 'v';}
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