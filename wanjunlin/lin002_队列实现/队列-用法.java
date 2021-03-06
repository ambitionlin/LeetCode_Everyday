//大多数流行语言都提供内置的队列库，因此您无需重新发明轮子。

//如前所述，队列有两个重要的操作，入队 enqueue 和出队 dequeue。 此外，我们应该能够获得队列中的第一个元素，因为应该首先处理它。

//下面是使用内置队列库及其常见操作的一些示例：

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        // 1. Initialize a queue.
        Queue<Integer> q = new LinkedList();
        // 2. Get the first element - return null if queue is empty.
        System.out.println("The first element is: " + q.peek());
        // 3. Push new element.
        q.offer(5);
        q.offer(13);
        q.offer(8);
        q.offer(6);
        // 4. Pop an element.
        q.poll();
        // 5. Get the first element.
        System.out.println("The first element is: " + q.peek());
        // 7. Get the size of the queue.
        System.out.println("The size is: " + q.size());
    }
}