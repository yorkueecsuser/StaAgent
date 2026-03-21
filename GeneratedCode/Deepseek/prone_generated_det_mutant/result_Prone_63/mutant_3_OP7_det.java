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
        Factory factory = new Factory(); // BUG: GuiceAssistedInjectScoping
        boolean fyphhoor = false;while (fyphhoor && false && false && false && false && true && false && false && true && true && false && false) {int hpmdgspv = 200906224;}
        MyClass myClass = factory.provider.get(); // BUG: GuiceAssistedInjectScoping
        System.out.println("MyClass id: " + myClass.id);
    
}
}