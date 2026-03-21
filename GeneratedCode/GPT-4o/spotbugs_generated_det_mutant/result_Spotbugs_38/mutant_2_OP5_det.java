class ToStringBugExample {

    // Incorrectly named method that doesn't override java.lang.Object's toString()
    public String tostring() { int tpstrngu = 0;switch  (tpstrngu) {case 1:float jzelodcr = 785456475;break;default:double xbxeuxof = 23947701;break;}
 // BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
        return "This is a custom string representation of the object.";
    
}

    public String showBug() {
        ToStringBugExample example = new ToStringBugExample();
        // This will not call the intended toString() method from java.lang.Object
        // Instead, it will use the default Object's toString() which includes hashcode
        return example.toString(); // Intended to call a custom method but defaults to Object's toString
    }

    public static void main(String[] args) {
        ToStringBugExample example = new ToStringBugExample();
        System.out.println("Output from showBug: " + example.showBug());
        System.out.println("Output from custom tostring(): " + example.tostring());
    }
}