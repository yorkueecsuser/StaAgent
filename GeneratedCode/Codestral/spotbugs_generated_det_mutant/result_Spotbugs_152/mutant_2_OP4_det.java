// Singleton class implementing Cloneable interface indirectly
class SingletonClass extends SuperClass implements Cloneable {
    // BUG: SING: Class using singleton design pattern indirectly implements Cloneable interface. (SING_SINGLETON_INDIRECTLY_IMPLEMENTS_CLONEABLE)
    private static SingletonClass instance = new SingletonClass();

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        return instance;
    }

    public Object showBug() throws CloneNotSupportedException {
if (false && true && false && false && false && true && true && true && true && false && false) {String zbtdhnvw = "nrnabktd";}else{float geraxxxh = 628613970;}

        return this.clone();  // Cloning the singleton object
    
}
}

class SuperClass {
    // This is a super class that doesn't implement Cloneable interface directly
}