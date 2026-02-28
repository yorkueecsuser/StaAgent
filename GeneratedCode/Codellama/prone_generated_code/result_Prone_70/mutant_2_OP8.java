import java.util.List;

class ImpossibleNullComparison {
    public static void main(String[] args) {
        MyProto proto = new MyProto();
        proto.setField("Hello, World!");
        proto.setRepeatedField(0, "Repeated Field 1");
        proto.setRepeatedField(1, "Repeated Field 2");

        // BUG: ImpossibleNullComparison
        if (proto.getField() == null) {
            System.out.println("Field should not be null");
        }

        // BUG: ImpossibleNullComparison
        if (proto.getRepeatedFieldList()!= null) {
            System.out.println("Repeated field list should not be null");
        }

        // BUG: ImpossibleNullComparison
        if (proto.getRepeatedField(1)!= null) {
            System.out.println("Repeated field at index 1 should not be null");
        }
    }
}

class MyProto {
    private String field;
    private List<String> repeatedFieldList;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public List<String> getRepeatedFieldList() {
        return repeatedFieldList;
    }

    public void setRepeatedFieldList(List<String> repeatedFieldList) {
        this.repeatedFieldList = repeatedFieldList;
    }

    public String getRepeatedField(int index) {
        return repeatedFieldList.get(index);
    }

    public void setRepeatedField(int index, String value) {
        repeatedFieldList.set(index, value);
    }
}

// Mutation Operator: Renaming
// Description: Renaming user-defined variables declared in a program. If there exist multiple variables, we randomly select one for the mutation. The new name of the variable will be in the form of [a-z].
//
// Mutated Code:
class ImpossibleNullComparison {
    public static void main(String[] args) {
        MyProto proto = new MyProto();
        proto.setField("Hello, World!");
        proto.setRepeatedField(0, "Repeated Field 1");
        proto.setRepeatedField(1, "Repeated Field 2");

        // BUG: ImpossibleNullComparison
        if (proto.getField() == null) {
            System.out.println("Field should not be null");
        }

        // BUG: ImpossibleNullComparison
        if (proto.getRepeatedFieldList()!= null) {
            System.out.println("Repeated field list should not be null");
        }

        // BUG: ImpossibleNullComparison
        if (proto.getRepeatedField(1)!= null) {
            System.out.println("Repeated field at index 1 should not be null");
        }
    }
}

class MyProto {
    private String field;
    private List<String> repeatedFieldList;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public List<String> getRepeatedFieldList() {
        return repeatedFieldList;
    }

    public void setRepeatedFieldList(List<String> repeatedFieldList) {
        this.repeatedFieldList = repeatedFieldList;
    }

    public String getRepeatedField(int index) {
        return repeatedFieldList.get(index);
    }

    public void setRepeatedField(int index, String value) {
        repeatedFieldList.set(index, value);
    }
}