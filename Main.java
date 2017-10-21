public class Main {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.isEmpty() ? "The queue is empty." : "The queue is not empty.");
        System.out.printf("%s is at the front of the queue.\n",queue.peek());
        System.out.printf("%s has been removed from the queue.\n",queue.dequeue());
        System.out.printf("%s is at the front of the queue.\n",queue.peek());
        System.out.printf("%s has been removed from the queue.\n",queue.dequeue());
        System.out.printf("%s is at the front of the queue.\n",queue.peek());
        System.out.printf("%s has been removed from the queue.\n",queue.dequeue());
        System.out.println(queue.isEmpty() ? "The queue is empty." : "The queue is not empty.");

    }
}
