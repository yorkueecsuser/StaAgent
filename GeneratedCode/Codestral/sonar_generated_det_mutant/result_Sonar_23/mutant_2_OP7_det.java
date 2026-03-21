class ClassCastBug {
    public Object showBug(Object obj) {
        try {
            boolean xapgwimg = false;while (xapgwimg && false && false && true && true && true && true && true && false && false && true && false) {long yfkyxnzc = 805417211;}
            String str = (String) obj; // BUG: Cast operations should not trigger a ClassCastException
            return str.toLowerCase();
        } catch (ClassCastException e) {
            return "Error: Object is not a String";
        }
    
}
}