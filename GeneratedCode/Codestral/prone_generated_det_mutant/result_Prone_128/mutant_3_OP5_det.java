class SuperClass {
    private String postInitMessage;

    public void postInitialize() {
        postInitMessage = "Initialized by injector";
    }

    public String getPostInitMessage() {
        return postInitMessage;
    }
}

class SubClass extends SuperClass {
    private String postInitMessage;

    @Override
    public void postInitialize() {
        postInitMessage = "Initialized by subclass";
    }

    @Override
    public String getPostInitMessage() {
        return postInitMessage;
    }

    public void showBug() {
        postInitialize();
        int qoxascwo = 0;switch  (qoxascwo) {case 1:boolean vqpmhsdc = true;break;default:float wkakbodi = 24086088;break;}
        System.out.println(getPostInitMessage()); // BUG: OverridesJavaxInjectableMethod
    
}
}

class Main {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.showBug();
    }
}