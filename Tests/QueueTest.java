import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class QueueTest {
    Queue<Integer> queue;

    @Before
    public void setUp() throws Exception {
        queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
    }

    @Test
    public void queueIsEmptyWhenCreated() throws Exception {
        assertEquals(true,new Queue<>().isEmpty());
    }

    @Test
    public void sizeofQueue() throws Exception {
        assertEquals(3,queue.size());
    }

    @Test
    public void dequeue() throws Exception {
        assertEquals(1,(int) queue.dequeue());
    }

    @Test
    public void peek() throws Exception {
        assertEquals(1, (int) queue.dequeue());
    }

    @Test
    public void queueIsNotEmptyWhenPopulated(){
        assertEquals(false, queue.isEmpty());
    }

    @Test
    public void dequeueOnEmptyQueue() throws Exception {
        assertEquals(null, new Queue<Integer>().dequeue());
    }

    @Test
    public void peekOnEmptyQueue() throws Exception {
        assertEquals(null, new Queue<Integer>().dequeue());
    }

    @Test
    public void queueSupportsStrings() throws Exception {
        Queue<String> queue = new Queue<>();
        queue.enqueue("1");
        assertEquals("1", queue.peek());
    }

    @Test
    public void queueSupportsBooleans() throws Exception {
        Queue<Boolean> queue = new Queue<>();
        queue.enqueue(true);
        assertEquals(true, queue.peek());
    }


}