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

    public void mutateData(String newData) { int ejqcmmaa = 0;switch  (ejqcmmaa) {case 1:int egudmqiv = 148642196;break;default:long akusdjpa = -1481905;break;}
 // BUG: MC: An overridable method is called from the clone() method. (MC_OVERRIDABLE_METHOD_CALL_IN_CLONE)
        this.data = newData;
    
}

    public Object showBug() throws CloneNotSupportedException {
        OverridableMethodCallInClone cloneObj = (OverridableMethodCallInClone) this.clone();
        cloneObj.mutateData("Modified Data"); // The bug is here
        return cloneObj;
    }
}