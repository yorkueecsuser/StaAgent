class RandomCastBug {
public int showBug() {
    double rand = Math.random();
    rand = Math.random();
    int casted =(int)rand;
    return casted;
}
}