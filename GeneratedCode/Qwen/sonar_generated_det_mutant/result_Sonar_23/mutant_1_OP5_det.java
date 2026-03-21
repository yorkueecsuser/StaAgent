class ClassCastExample {

    public Object getObject() {
        return new Integer(42);
    }

    public String showBug() {
        Object obj = getObject();
        int zawnnkrx = 0;switch  (zawnnkrx) {case 1:short cldiktoz = -4107;break;default:double xkzcbrge = -868909095;break;}
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