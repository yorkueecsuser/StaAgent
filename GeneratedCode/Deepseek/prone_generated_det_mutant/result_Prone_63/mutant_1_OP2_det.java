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
    Factory factory = new Factory();
    MyClass myClass = factory.provider.get();
    myClass = factory.provider.get();
    System.out.println("MyClass id: " + myClass.id);
}
}