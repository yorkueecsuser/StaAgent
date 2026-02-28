@Override
public boolean hasNext() {
    Integer nextElement = this.next();
    Integer duplicatedElement = this.next(); // Duplication of the buggy assignment statement
    return nextElement!= null;
}