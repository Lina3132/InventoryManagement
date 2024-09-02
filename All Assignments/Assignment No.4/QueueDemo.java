import java.util.Scanner;

public class QueueDemo {

    int front = -1, rear = -1, size = 5;
    int[] queue = new int[5];

    void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is Full");
        } else {
            if (front == -1) front = 0;
            rear = (rear + 1) % size;
            queue[rear] = value;
            display();
        }
    }

    void display(){
        if(isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            for(int i = front; i != rear; i = (i + 1) % size) {
                System.out.print(queue[i] + " ");
            }
            System.out.println(queue[rear]);
        }
    }

    void dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            front = (front + 1) % size;
            if(front == (rear + 1) % size) {
                front = rear = -1; // Reset the queue
            }
            display();
        }
    }

    boolean isEmpty() {
        return front == -1;
    }

    boolean isFull() {
        return (rear + 1) % size == front;
    }

    public static void main(String[] args) {
        String ch1 = "y";
        int ch2;
        QueueDemo qd = new QueueDemo();
        Scanner sc = new Scanner(System.in);

        while(ch1.equals("y")) {
            System.out.println("1. Enqueue \n2. Dequeue \n3. Print");
            System.out.println("Enter Choice: ");
            ch2 = sc.nextInt();

            switch (ch2) {
                case 1: {
                    System.out.println("Enter Value to enqueue in queue: ");
                    int v = sc.nextInt();
                    qd.enqueue(v);
                    break;
                }
                case 2: {
                    qd.dequeue();
                    break;
                }
                case 3: {
                    qd.display();
                    break;
                }
                default: {
                    System.out.println("Wrong choice..!");
                    break;
                }
            }
            System.out.println("Do you wish to perform operations again?(n/y): ");
            ch1 = sc.next();
        }
    }
}
