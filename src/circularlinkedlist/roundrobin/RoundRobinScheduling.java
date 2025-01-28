package circularlinkedlist.roundrobin;

public class RoundRobinScheduling {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();

        // Adding processes to the circular queue
        queue.addProcess(1, 10, 3);  // Process 1, burst time 10
        queue.addProcess(2, 5, 1);   // Process 2, burst time 5
        queue.addProcess(3, 8, 2);   // Process 3, burst time 8
        queue.addProcess(4, 12, 4);  // Process 4, burst time 12

        int timeQuantum = 4;  // Time quantum for Round Robin scheduling

        // Display initial processes in the queue
        queue.displayProcesses();

        // Perform Round Robin Scheduling
        queue.roundRobinScheduling(timeQuantum);
    }
}