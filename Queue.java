public class Queue <T extends Comparable<T>>{
    private Node<T> first;
    private Node<T> last;
    private int count;

    public boolean isEmpty(){
        return first == null;
    }

    public int size(){
        return count;
    }

    public void enqueue(T newData){
        count++;
        Node<T> oldLast = last;
        last = new Node<>(newData);
        last.next = null;

        if (isEmpty()){
            first = last;
        } else {
            oldLast.next = last;
        }
    }

    public T dequeue(){
        if(isEmpty()){
            return null;
        }
        count--;
        T oldFirst = first.data;
        first = first.next;
        return oldFirst;
    }

    public T peek(){
        return first.data;
    }

}
