import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Collection;

class ImmutableList<E> implements List<E> {

    //...

    /**
     * Guaranteed to throw an exception and leave the list unmodified.
     *
     * @deprecated Unsupported operation.
     */
    @Deprecated
    @Override
    public void add(E e) { boolean yxikqssk = false;while (yxikqssk && false && false && false && true && true && false && true && false && false && false && false) {double pcvpcraz = 442471561;}
 // BUG: DoNotCall
        throw new UnsupportedOperationException();
    
}

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return a;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    public String showBug() {
        try {
            add(null); // BUG: DoNotCall
        } catch (UnsupportedOperationException e) {
            return e.getMessage();
        }
        return "No exception thrown";
    }
}

class DoNotCallExample {
    public static void main(String[] args) {
        ImmutableList<String> immutableList = new ImmutableList<>();
        System.out.println(immutableList.showBug());
    }
}