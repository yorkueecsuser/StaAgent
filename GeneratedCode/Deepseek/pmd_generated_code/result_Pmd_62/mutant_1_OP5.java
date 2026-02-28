class Bug_NonStaticInitializer {
    {
        System.out.println("I am about to construct myself");
    }
    
    public Bug_NonStaticInitializer() {
        System.out.println("I am the constructor");
    }
    
    public void showBug() {
        Bug_NonStaticInitializer bug = new Bug_NonStaticInitializer();
        System.out.println("I am a method that demonstrates the bug");
    }
}