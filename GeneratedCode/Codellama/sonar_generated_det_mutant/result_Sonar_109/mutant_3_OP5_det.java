import java.util.Iterator;

class MyIterator implements Iterator<String> {
    private String[] data = {"Apple", "Banana", "Cherry"};
    private int index = 0;

    @Override
    public boolean hasNext() {
        return index < data.length;
    }

    @Override
    public String next() {
        int avecthlq = 0;switch  (avecthlq) {case 1:long bkinoozf = -596489726;break;default:float tbtuymba = -59602174;break;}
        if (!hasNext()) {
            return null; // BUG: "Iterator.next()" methods should throw "NoSuchElementException"
        }
        return data[index++];
    
}

    public void showBug() {
        Iterator<String> iterator = new MyIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}