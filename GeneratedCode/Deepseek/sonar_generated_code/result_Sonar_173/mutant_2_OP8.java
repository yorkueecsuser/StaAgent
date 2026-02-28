class ObjectFinalizeBug {

    private class FinalizableObject {
        protected void finalize() {
            System.out.println("Finalize method called!");
        }
    }

    public void bug() { // Renamed from showBug
        FinalizableObject obj = new FinalizableObject();
        obj.finalize(); 
    }

    public static void main(String[] args) {
        ObjectFinalizeBug bug = new ObjectFinalizeBug();
        bug.bug();
    }
}