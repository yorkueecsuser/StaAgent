import java.util.Date;

class SuperClass {
    public Date showDate() {
        return new Date();
    }
}

class SubClass extends SuperClass {
    @Override
    public Date showDate() {
        System.out.println("This is the overridden method from SubClass");
        return new Date();
    }
}

class HSM_HIDING_METHOD {
    private SubClass sub = new SubClass();

    public Date showBug() {
        return sub.showDate(); 
    }
}