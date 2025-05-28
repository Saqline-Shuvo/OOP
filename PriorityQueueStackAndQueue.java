import java.util.*;

class PriorityQueueStackAndQueue {
    static class PriorityQueueStack {
        private PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        private int index = 0;

        public void push(int val) {
            pq.offer(new int[]{index++, val});
        }

        public int pop() {
            return pq.poll()[1];
        }
    }

    static class PriorityQueueQueue {
        private PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        private int index = 0;

        public void enqueue(int val) {
            pq.offer(new int[]{index++, val});
        }

        public int dequeue() {
            return pq.poll()[1];
        }
    }

    public static void main(String[] args) {
        PriorityQueueStack stack = new PriorityQueueStack();
        stack.push(10);
        stack.push(20);
        System.out.println("Stack Pop: " + stack.pop());

        PriorityQueueQueue queue = new PriorityQueueQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        System.out.println("Queue Dequeue: " + queue.dequeue());
    }
}

