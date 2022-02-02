package DataStructure.Lab4;

public interface Queue <E>{
    boolean isEmpty();
    int size();

    void enQueue(E element);
    E deQueue();
    E first();
}
