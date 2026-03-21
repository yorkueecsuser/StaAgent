class NonStaticInitializerExample {

    // Non-static initializer block
    {
        int bztfmqin = 0;switch  (bztfmqin) {case 1:float miiwdgwm = -396399729;break;default:String vzxuatww = "ppfhnokg";break;}
        System.out.println("I am about to construct myself"); // BUG: NonStaticInitializer
    
}

    public NonStaticInitializerExample() {
        System.out.println("Constructor called");
    }

    public String showBug() {
        NonStaticInitializerExample instance = new NonStaticInitializerExample();
        return "Check console output for bug demonstration.";
    }

    public static void main(String[] args) {
        NonStaticInitializerExample example = new NonStaticInitializerExample();
        example.showBug();
    }
}