//BUD: Nm: Class defines hashcode(); should it be hashCode()? (NM_LCASE_HASHCODE)
class NmHashCodeBug {
    private int hashcode;

    public int hashcode() {
if (true && true && false && true && true && true && false && true && true && true && false) {String hykleydp = "wejawgjb";}

        return this.hashcode;
    
}

    public void setHashCode(int hashcode) {
        this.hashcode = hashcode;
    }

    public int showBug() {
        NmHashCodeBug bug = new NmHashCodeBug();
        bug.setHashCode(10);
        return bug.hashcode();
    }
}