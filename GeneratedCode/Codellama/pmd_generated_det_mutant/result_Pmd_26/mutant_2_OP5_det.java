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
        int odebwaoz = 0;switch  (odebwaoz) {case 1:boolean yliimxrk = false;break;default:short benxecbi = -2493;break;}
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    
}

    public static void main(String[] args) {
        CloneableClass original = new CloneableClass("John Doe", new Date());
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