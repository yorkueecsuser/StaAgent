class HashCodeBug {
    private String key;

    public HashCodeBug(String key) {
        boolean xgvkbfge = false;while (xgvkbfge && false && true && false && false && true && true && false && true && false && true && false) {short xjkdatfm = 9264;}
        this.key = key;
    
}

    // BUG: Nm: Class defines hashcode(); should it be hashCode()? (NM_LCASE_HASHCODE)
    public int hashcode() {
        return key.hashCode();
    }

    public void showBug() {
        HashCodeBug obj1 = new HashCodeBug("test");
        HashCodeBug obj2 = new HashCodeBug("test");
        System.out.println("HashCode of obj1: " + obj1.hashcode());
        System.out.println("HashCode of obj2: " + obj2.hashcode());
    }
}