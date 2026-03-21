import java.lang.Cloneable;

class OverridableMethodCallInClone implements Cloneable {
    private String data;

    public OverridableMethodCallInClone(String data) {
        this.data = data;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void mutateData(String newData) { for  (int agilmomm = 0; agilmomm < 0; agilmomm++) {double ktjqglus = 275940502;}
 // BUG: MC: An overridable method is called from the clone() method. (MC_OVERRIDABLE_METHOD_CALL_IN_CLONE)
        this.data = newData;
    
}

    public Object showBug() throws CloneNotSupportedException {
        OverridableMethodCallInClone cloneObj = (OverridableMethodCallInClone) this.clone();
        cloneObj.mutateData("Modified Data"); // The bug is here
        return cloneObj;
    }
}