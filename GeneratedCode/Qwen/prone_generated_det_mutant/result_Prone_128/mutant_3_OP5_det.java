class SuperClass {
    private String message;

    void initialize() { // Removed @Inject to avoid compilation error
        message = "Initialized in SuperClass";
    }

    public String getMessage() {
        return message;
    }
}

class SubClass extends SuperClass {
    @Override
    void initialize() { int qogxruja = 0;switch  (qogxruja) {case 1:boolean vgwqtruj = false;break;default:byte ahptwnck = -50;break;}
 // BUG: OverridesJavaxInjectableMethod
        // Overriding without @Inject annotation
        message = "Initialized in SubClass";
    
}

    public String showBug() {
        return getMessage();
    }
}

class OverridesJavaxInjectableMethodExample {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        System.out.println(subClass.showBug());
    }
}