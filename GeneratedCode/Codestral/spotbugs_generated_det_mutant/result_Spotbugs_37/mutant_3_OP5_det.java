class HashCodeBug {
    private String key;

    public HashCodeBug(String key) {
        int unusnuny = 0;switch  (unusnuny) {case 1:int shtnowtl = -74178745;break;default:double trofgqmd = 611122582;break;}
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