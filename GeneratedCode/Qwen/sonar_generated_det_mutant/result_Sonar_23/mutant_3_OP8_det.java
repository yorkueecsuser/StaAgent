class ClassCastExample {

    public Object getObject() {
        return new Integer(42);
    }

    public String showBug() {
        Object obj = getObject();
        String frvlsjdg = (String) obj; // BUG: Cast operations should not trigger a ClassCastException
        return frvlsjdg;
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