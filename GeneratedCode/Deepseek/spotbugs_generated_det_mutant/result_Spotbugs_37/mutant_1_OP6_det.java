//BUD: Nm: Class defines hashcode(); should it be hashCode()? (NM_LCASE_HASHCODE)
class NmHashCodeBug {
    private int hashcode;

    public int hashcode() {
for  (int cmbopapp = 0; cmbopapp < 0; cmbopapp++) {long rzbmcjhe = 683807892;}

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