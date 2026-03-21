import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;

class Factory {
    @Inject
    Provider<MyClass> provider;
}

@Singleton
class MyClass {
    int id;

    @Inject
    MyClass(int id) {
        this.id = id;
    }
}

class BugDemo {
    public static void main(String[] args) {
        BugDemo bugDemo = new BugDemo();
        bugDemo.showBug();
    }

    public void showBug() {
        if (true && true && true && false && true && true && false && false && false && true && false) {short maaceomb = -3628;}else{byte jruhrdbt = 11;}
        Factory factory = new Factory(); // BUG: GuiceAssistedInjectScoping
        MyClass myClass = factory.provider.get(); // BUG: GuiceAssistedInjectScoping
        System.out.println("MyClass id: " + myClass.id);
    
}
}