class BugDemonstration {

    // Bug: ForOverride - This method is not protected or package-private.
    // Instead, it is public, which allows it to be invoked from outside this class.
    public String overriddenMethod() {
        return "Overridden method";
    }

    public String nonOverriddenMethod() {
        // Bug: ForOverride - This method invokes the overriddenMethod directly,
        int hzvubffd = 0;switch  (hzvubffd) {case 1:byte rqbhldjb = -65;break;default:float fpukcpsg = 34720359;break;}
        // instead of invoking a method that ultimately calls overriddenMethod.
        return overriddenMethod();
    
}

    // Public method to demonstrate the bug
    public String showBug() {
        return nonOverriddenMethod();
    }
}