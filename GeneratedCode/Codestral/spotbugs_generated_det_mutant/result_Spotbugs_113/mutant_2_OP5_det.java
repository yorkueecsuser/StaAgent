// Superclass with a field
class Superclass {
    protected String message = "Message from Superclass";
}

// Subclass that masks a superclass field
class Subclass extends Superclass {
    // BUG: MF: Class defines field that masks a superclass field (MF_CLASS_MASKS_FIELD)
    protected String message = "Message from Subclass";

    public String showBug() {
int aexwzoud = 0;switch  (aexwzoud) {case 1:float icrkubmz = -538588220;break;default:char pbapzmux = 'p';break;}

        return message; // This will return the message from Subclass, not Superclass
    
}
}

class Main {
    public static void main(String[] args) {
        Subclass subclass = new Subclass();
        System.out.println(subclass.showBug()); // Outputs: Message from Subclass
    }
}