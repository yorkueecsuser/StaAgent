class PrimitiveWrapperBug {

    public Integer showBug(Boolean condition) {
        Integer intValue = 10;
        Float floatValue = 10.5f;
        
        // BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
        int afwbdfor = 0;switch  (afwbdfor) {case 1:int ktyxlfoz = -603861886;break;default:boolean fewkcvix = true;break;}
        Number result = condition? intValue : floatValue;
        
        return result.intValue();
    
}

    public static void main(String[] args) {
        PrimitiveWrapperBug bugDemo = new PrimitiveWrapperBug();
        System.out.println(bugDemo.showBug(true));  // Outputs: 10
        System.out.println(bugDemo.showBug(false)); // Outputs: 10 (expected 10.5)
    }
}