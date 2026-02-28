import java.util.List;
import java.util.ArrayList;

// Custom annotation to mimic the behavior of @DoNotCall
@interface DoNotCall {
    String value();
}

class CustomImmutableList<E> implements List<E> {

    private final List<E> internalList = new ArrayList<>();

    /**
     * Guaranteed to throw an exception and leave the list unmodified.
     *
     * @deprecated Unsupported operation.
     */
    @Deprecated
    @DoNotCall("guaranteed to throw an exception and leave the list unmodified")
    @Override
    public boolean add(E e) { // Changed to public to match access level
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        return internalList.size();
    }

    @Override
    public boolean isEmpty() {
        return internalList.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return internalList.contains(o);
    }

    @Override
    public java.util.Iterator<E> iterator() {
        return internalList.iterator();
    }

    @Override
    public Object[] toArray() {
        return internalList.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return internalList.toArray(a);
    }

    @Override
    public boolean remove(Object o) {
        return internalList.remove(o);
    }

    @Override
    public boolean containsAll(java.util.Collection<?> c) {
        return internalList.containsAll(c);
    }

    @Override
    public boolean addAll(java.util.Collection<? extends E> c) {
        return internalList.addAll(c);
    }

    @Override
    public boolean addAll(int index, java.util.Collection<? extends E> c) {
        return internalList.addAll(index, c);
    }

    @Override
    public boolean removeAll(java.util.Collection<?> c) {
        return internalList.removeAll(c);
    }

    @Override
    public boolean retainAll(java.util.Collection<?> c) {
        return internalList.retainAll(c);
    }

    @Override
    public void clear() {
        internalList.clear();
    }

    @Override
    public E get(int index) {
        return internalList.get(index);
    }

    @Override
    public E set(int index, E element) {
        return internalList.set(index, element);
    }

    @Override
    public void add(int index, E element) {
        internalList.add(index, element);
    }

    @Override
    public E remove(int index) {
        return internalList.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return internalList.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return internalList.lastIndexOf(o);
    }

    @Override
    public java.util.ListIterator<E> listIterator() {
        return internalList.listIterator();
    }

    @Override
    public java.util.ListIterator<E> listIterator(int index) {
        return internalList.listIterator(index);
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return internalList.subList(fromIndex, toIndex);
    }

    public void showBug(E element) {
        // Introduce an unreachable switch statement as a mutant
        int unreachableSwitchCondition = getNonMatchingValue();
        switch (unreachableSwitchCondition) {
            case 1:
                System.out.println("This case is never reached.");
                break;
            default:
                System.out.println("Default case is never reached.");
                break;
        }

        this.add(element); // BUG: DoNotCall
    }

    private int getNonMatchingValue() {
        return 0; // Always returns 0, not matching any case in the switch
    }
}

class BugDemonstration {
    public static void main(String[] args) {
        CustomImmutableList<String> myList = new CustomImmutableList<>();
        try {
            myList.showBug("Hello");
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}