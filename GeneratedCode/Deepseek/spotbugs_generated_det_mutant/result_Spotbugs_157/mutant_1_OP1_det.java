import java.util.Date;

// BUG: HSM: Method hiding should be avoided. (HSM_HIDING_METHOD)
class SuperClass {
    public Date showDate() {
short bjzddjtg = -7354;

        return new Date();
    
}
}

class SubClass extends SuperClass {
    // This method overrides the showDate method from SuperClass
    @Override
    public Date showDate() {
        System.out.println("This is the overridden method from SubClass");
        return new Date();
    }
}

class HSM_HIDING_METHOD {
    private SubClass sub = new SubClass();

    // This method demonstrates the hiding bug
    public Date showBug() {
        return sub.showDate(); // This will call the showDate method from SubClass, not the one from SuperClass
    }
}