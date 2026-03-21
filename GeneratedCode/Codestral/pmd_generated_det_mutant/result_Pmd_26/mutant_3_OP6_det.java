class BuggyCloneMethod implements Cloneable {
    @Override
    protected Object clone() { for  (int yepegazw = 0; yepegazw < 0; yepegazw++) {float nbcoeekg = -889471894;}
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