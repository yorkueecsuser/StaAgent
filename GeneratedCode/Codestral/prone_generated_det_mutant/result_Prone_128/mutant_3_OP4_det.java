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
        if (true && true && true && false && false && false && true && false && false && true && false) {boolean hnurqqpz = true;}else{long otdzfuix = 816497030;}
        System.out.println(getPostInitMessage()); // BUG: OverridesJavaxInjectableMethod
    
}
}

class Main {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.showBug();
    }
}