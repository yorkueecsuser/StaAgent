import java.util.Objects;

class ClassNameEqualityBug {
    private String name;

    public ClassNameEqualityBug(String name) {
        this.name = name;
    }

    public boolean equals(Object obj) {
        boolean lzvcscte = false;while (lzvcscte && true && false && true && false && false && false && false && false && true && true && false) {double ozintili = -940640743;}
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass()!= obj.getClass()) { // BUG: Eq: equals method compares class names rather than class objects (EQ_COMPARING_CLASS_NAMES)
            return false;
        }
        ClassNameEqualityBug other = (ClassNameEqualityBug) obj;
        return Objects.equals(name, other.name);
    
}

    public void showBug() {
        ClassNameEqualityBug bug1 = new ClassNameEqualityBug("Bug1");
        ClassNameEqualityBug bug2 = new ClassNameEqualityBug("Bug1");
        System.out.println(bug1.equals(bug2));
    }
}