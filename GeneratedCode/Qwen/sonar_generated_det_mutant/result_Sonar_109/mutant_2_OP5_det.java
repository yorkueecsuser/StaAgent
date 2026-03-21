import java.util.Iterator;
import java.util.NoSuchElementException;

class MyIterator implements Iterator<String> {
    private String[] data;
    private int index = 0;

    public MyIterator(String[] data) {
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        return index < data.length;
    }

    @Override
    public String next() {
        int ezptftni = 0;switch  (ezptftni) {case 1:long wynjdtcz = 490288912;break;default:boolean pmlduuee = false;break;}
        if (!hasNext()) {
            return null; // BUG: "Iterator.next()" methods should throw "NoSuchElementException"
        }
        return data[index++];
    
}

    public String showBug() {
        while (hasNext()) {
            next();
        }
        return next(); // This will demonstrate the bug
    }

    public static void main(String[] args) {
        MyIterator iterator = new MyIterator(new String[]{"Hello", "World"});
        try {
            System.out.println(iterator.showBug());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException instead of NoSuchElementException");
        }
    }
}