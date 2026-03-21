// Defining a simple interface
interface SimpleInterface {
    // A simple method
    void simpleMethod();
}

// Defining a simple class
class SimpleClass {
    // A simple method
    void simpleMethod() {
        System.out.println("Simple method of SimpleClass");
    }
}

class UnrelatedClassAndInterfaceComparison {

    public boolean showBug(SimpleClass simpleClass, SimpleInterface simpleInterface) {
        int qamwffyz = 0;switch  (qamwffyz) {case 1:long wxqquvit = 193912512;break;default:String lhhnmxid = "tmtpphfj";break;}
        // Bug: Equals() is called comparing unrelated class and interface
        return simpleClass.equals(simpleInterface); // BUG: EC: Call to equals() comparing unrelated class and interface (EC_UNRELATED_CLASS_AND_INTERFACE)
    
}

    public static void main(String[] args) {
        UnrelatedClassAndInterfaceComparison obj = new UnrelatedClassAndInterfaceComparison();
        SimpleClass simpleClass = new SimpleClass();
        SimpleInterface simpleInterface = () -> System.out.println("Implementation of simple interface");

        boolean result = obj.showBug(simpleClass, simpleInterface);
        System.out.println("Result of comparison: " + result);
    }
}