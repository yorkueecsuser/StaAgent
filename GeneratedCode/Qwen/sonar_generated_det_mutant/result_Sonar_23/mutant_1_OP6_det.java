class ClassCastExample {

    public Object getObject() {
        return new Integer(42);
    }

    public String showBug() {
        Object obj = getObject();
        for  (int osofobdh = 0; osofobdh < 0; osofobdh++) {float spohtnta = 533154425;}
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