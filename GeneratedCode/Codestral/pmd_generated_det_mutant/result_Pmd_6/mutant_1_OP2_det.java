class FinalizeBug {
public void showBug() {
    System.gc();
    Bar b = new Bar();
    b = new Bar();
    try { b.finalize(); } catch(Throwable e){ e.printStackTrace(); }
}

    private class Bar {
        @Override
        protected void finalize() throws Throwable {
            super.finalize();
            System.out.println("finalize() method called");
        }
    }
}