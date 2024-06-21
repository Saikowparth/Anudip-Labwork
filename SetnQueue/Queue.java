package com.Anudip;

public class Queue {
    int SIZE = 10; // Initializing the size of the Queue
    int items[] = new int[SIZE];
    int front, rear; // Defining the front and rear variables

    Queue(){ // initializing the front and rear variables
        front = -1;
        rear = -1;
    }

    boolean isFull(){ // Function to check if the Queue is full
        if(front == 0 && rear == SIZE-1){
            return true;
        }
        return false;
    }

    boolean isEmpty(){ // Function to check if the Queue is empty
        if(front == -1)
            return true;
        else
            return false;
    }

    void enQueue(int element){ // Function to enter elements in the Queue
        if (isFull()){
            System.out.println("Queue is full.");
        }
        else{
            if(front == -1){
                front = 0;
            }
            rear++;
            items[rear] = element;
            System.out.println("Insert " + element);
        }
    }
    int deQueue() { // Function to delete elements from the Queue
        int element;

        // if queue is empty
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        }
        else {
            // remove element from the front of queue
            element = items[front];

            // if the queue has only one element
            if (front >= rear) {
                front = -1;
                rear = -1;
            }
            else {
                // mark next element as the front
                front++;
            }
            System.out.println( element + " Deleted");
            return (element);
        }
    }

    void display() {  // Function to display element of the Queue
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        }
        else {
            // display the front of the queue
            System.out.println("\nFront index-> " + front);

            // display element of the queue
            System.out.println("Items -> ");
            for (i = front; i <= rear; i++)
                System.out.print(items[i] + "  ");

            // display the rear of the queue
            System.out.println("\nRear index-> " + rear);
        }
    }

    public static void main(String[]args){
        Queue q1 = new Queue();
        q1.enQueue(1);
        q1.enQueue(2);
        q1.enQueue(6);
        q1.enQueue(9);

        q1.display();

        q1.deQueue();
        q1.deQueue();

        q1.display();
    }

}


