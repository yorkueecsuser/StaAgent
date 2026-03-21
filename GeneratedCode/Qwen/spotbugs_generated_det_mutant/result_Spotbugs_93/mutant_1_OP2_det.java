class UncallableMethodExample {
public void showBug() {
    Runnable runnable = new Runnable() { @ Override public void run() { System.out.println("This is the run method."); } public void myUncallableMethod() { System.out.println("This method is uncallable."); } };
    runnable = new Runnable() { @ Override public void run() { System.out.println("This is the run method."); } public void myUncallableMethod() { System.out.println("This method is uncallable."); } };
    runnable.run();
}

    public static void main(String[] args) {
        UncallableMethodExample example = new UncallableMethodExample();
        example.showBug();
    }
}