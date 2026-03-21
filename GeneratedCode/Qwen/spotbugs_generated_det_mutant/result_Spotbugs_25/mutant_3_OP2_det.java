
class Parent {
    private int value;

    public Parent(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null ||!(obj instanceof Parent)) return false;
        Parent other = (Parent) obj;
        return this.value == other.value;
    }
}

class Child extends Parent {
    private String name;

    public Child(int value, String name) {
        super(value);
        this.name = name;
    }
@ Override public boolean equals(Object obj){
    if(this == obj)return true;
    if(obj == null || !(obj instanceof Child)) return false;
    Child other =(Child)obj;
    other =(Child)obj;
    return super.equals(obj)&& this.name.equals(other.name);
}

    public boolean showBug() {
        Parent parent = new Parent(10);
        Child child = new Child(10, "childName");
        return parent.equals(child) == child.equals(parent);
    }
}