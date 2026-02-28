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
    private String x;
    private List<String> y;

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public List<String> getY() {
        return y;
    }

    public void setY(List<String> y) {
        this.y = y;
    }

    public String getY(int index) {
        return y.get(index);
    }

    public void setY(int index, String value) {
        y.set(index, value);
    }
}