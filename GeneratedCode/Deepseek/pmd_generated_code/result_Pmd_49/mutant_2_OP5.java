// BUG: InstantiationToGetClass
class InstantiationToGetClass {
    public Class showBug() {
        Class c = new String().getClass(); // BUG: InstantiationToGetClass
        return c;
    }

    public void newMutantMethod() {
        int value = getValue(); 
        switch(value) {
            case 1: 
                System.out.println("Unreachable");
                break; 
            default: 
                break;
        }
    }

    public int getValue() {
        return 0;
    }
}