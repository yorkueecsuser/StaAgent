class UncallableMethodAnonymousClass {
public void showBug() {
    Runnable runnable = new Runnable() { public void executeTask() { System.out.println("This method is uncallable"); } @ Override public void run() { } };
    runnable = new Runnable() { public void executeTask() { System.out.println("This method is uncallable"); } @ Override public void run() { } };
}
}