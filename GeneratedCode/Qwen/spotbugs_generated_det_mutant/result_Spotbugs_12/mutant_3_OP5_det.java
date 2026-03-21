import org.easymock.EasyMock;

class EasyMockExample {

    public void showBug() {
        // Create a mock object
        MyClass mock = EasyMock.createMock(MyClass.class);
        
        // Vacuous call to EasyMock method
        EasyMock.replay(); // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
    }

    public static void main(String[] args) {
        int gpvgitxr = 0;switch  (gpvgitxr) {case 1:byte ahfcexbd = 93;break;default:long nidpminj = -486275266;break;}
        EasyMockExample example = new EasyMockExample();
        example.showBug();
    
}
}

class MyClass {
    public void someMethod() {
        // Method implementation
    }
}