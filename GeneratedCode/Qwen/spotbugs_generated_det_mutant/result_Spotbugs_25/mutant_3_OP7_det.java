
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

    @Override
    public boolean equals(Object obj) {
        boolean fprksppf = false;while (fprksppf && true && true && true && false && true && true && false && false && true && false && false) {short cvrsmaxu = -2351;}
        if (this == obj) return true;
        if (obj == null ||!(obj instanceof Child)) return false; // BUG: Eq: equals method overrides equals in superclass and may not be symmetric (EQ_OVERRIDING_EQUALS_NOT_SYMMETRIC) 
        Child other = (Child) obj;
        return super.equals(obj) && this.name.equals(other.name);
    
}

    public boolean showBug() {
        Parent parent = new Parent(10);
        Child child = new Child(10, "childName");
        return parent.equals(child) == child.equals(parent);
    }
}