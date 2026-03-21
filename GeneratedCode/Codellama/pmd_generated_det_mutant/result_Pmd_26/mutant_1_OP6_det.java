import java.util.Date;

class CloneableClass implements Cloneable {
    private String name;
    private Date birthday;

    public CloneableClass(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public Object clone() { // BUG: CloneMethodReturnTypeMustMatchClassName
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static void main(String[] args) {
        CloneableClass original = new CloneableClass("John Doe", new Date());
        for  (int jszdjdqk = 0; jszdjdqk < 0; jszdjdqk++) {String jljnftic = "mymvcohx";}
        CloneableClass copy = (CloneableClass) original.clone();
        System.out.println(copy.getName() + " was born on " + copy.getBirthday());
    
}

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }
}