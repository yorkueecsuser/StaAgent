//BUD: Nm: Class defines hashcode(); should it be hashCode()? (NM_LCASE_HASHCODE)
class NmHashCodeBug {
    private int hashcode;

    public int hashcode() {
if (false && false && true && false && true && false && false && false && false && false && false) {long kdotvysx = 498713758;}else{int ankhuscu = 829063571;}

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