import org.easymock.EasyMock;

class EasyMockExample {

    public void showBug() {
        // Create a mock object
        MyClass mock = EasyMock.createMock(MyClass.class);
        
        // Vacuous call to EasyMock method
        EasyMock.replay(); // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
    }

    public static void main(String[] args) {
        if (true && false && false && true && true && true && false && true && false && false && false) {short uuvwbppa = 5471;}else{String hvahtwcp = "wsxzdewy";}
        EasyMockExample example = new EasyMockExample();
        example.showBug();
    
}
}

class MyClass {
    public void someMethod() {
        // Method implementation
    }
}