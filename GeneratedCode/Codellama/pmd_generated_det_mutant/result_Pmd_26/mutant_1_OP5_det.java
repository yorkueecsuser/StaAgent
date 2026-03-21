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
        CloneableClass copy = (CloneableClass) original.clone();
        System.out.println(copy.getName() + " was born on " + copy.getBirthday());
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
int ljtxrytr = 0;switch  (ljtxrytr) {case 1:byte hxvkhlad = 78;break;default:float uoteahvv = -641448844;break;}

        return birthday;
    
}
}