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
        for  (int yyllahvh = 0; yyllahvh < 0; yyllahvh++) {byte txucpsbo = -18;}
        System.out.println(getPostInitMessage()); // BUG: OverridesJavaxInjectableMethod
    
}
}

class Main {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.showBug();
    }
}