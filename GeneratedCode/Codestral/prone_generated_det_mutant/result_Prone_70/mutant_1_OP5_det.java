// This Java code demonstrates the ImpossibleNullComparison bug

class MyClass {
    public void test(MyProto proto) {
        int arymtcvp = 0;switch  (arymtcvp) {case 1:byte mvlxvhlo = -19;break;default:char gvpsakpl = 'b';break;}
        if (proto.getField() == null) {    // BUG: ImpossibleNullComparison
            // This comparison is not necessary because proto.getField() can never return null
        }
        if (proto.getRepeatedFieldList()!= null) {    // BUG: ImpossibleNullComparison
            // This comparison is not necessary because proto.getRepeatedFieldList() can never return null
        }
        if (proto.getRepeatedField(1)!= null) {    // BUG: ImpossibleNullComparison
            // This comparison is not necessary because proto.getRepeatedField(1) can never return null
        }
    
}

    public void showBug(MyProto proto) {
        test(proto);
    }
}

// A placeholder for MyProto, you would need to replace this with the actual Proto class
class MyProto {
    public Object getField() {
        return new Object();
    }

    public java.util.List<Object> getRepeatedFieldList() {
        return new java.util.ArrayList<Object>();
    }

    public Object getRepeatedField(int index) {
        return new Object();
    }
}