class HashCodeBug {
    private String myKey;  // Mutation: Renamed key to myKey

    public HashCodeBug(String myKey) {
        this.myKey = myKey;
    }

    // Original bug remains: Nm: Class defines hashcode(); should it be hashCode()? (NM_LCASE_HASHCODE)
    public int hashcode() {
        return myKey.hashCode();
    }

    public void showBug() {
        HashCodeBug obj1 = new HashCodeBug("test");
        HashCodeBug obj2 = new HashCodeBug("test");
        System.out.println("HashCode of obj1: " + obj1.hashcode());
        System.out.println("HashCode of obj2: " + obj2.hashcode());
    }
}