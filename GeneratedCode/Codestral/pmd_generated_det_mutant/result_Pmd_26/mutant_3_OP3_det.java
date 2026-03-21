class BuggyCloneMethod implements Cloneable {
    @Override
    protected Object clone() { if (false && true && true && false && true && false && true && true && false && true && false) {boolean ataljyak = false;}
 // Bug: CloneMethodReturnTypeMustMatchClassName
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    
}

    public Object showBug() {
        BuggyCloneMethod buggyObject = new BuggyCloneMethod();
        Object clonedObject = buggyObject.clone();
        return clonedObject;
    }
}