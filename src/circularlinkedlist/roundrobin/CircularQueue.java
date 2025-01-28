package circularlinkedlist.roundrobin;

class CircularQueue {
    private Process head;
    private Process tail;

    public CircularQueue() {
        head = null;
        tail = null;
    }

    // Add process to the circular linked list
    public void addProcess(int processID, int burstTime, int priority) {
        Process newProcess = new Process(processID, burstTime, priority);
        if (head == null) {
            head = newProcess;
            tail = newProcess;
            newProcess.next = head;  // Point to itself to make the list circular
        } else {
            tail.next = newProcess;
            tail = newProcess;
            tail.next = head;  // Ensure circular link
        }
    }

    // Remove process from the list by Process ID
    public void removeProcess(int processID) {
        if (head == null) return;

        Process temp = head;
        Process prev = null;

        // If the process to be removed is the head
        if (temp.processID == processID) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                tail.next = head;  // Update tail's next pointer
            }
            return;
        }

        // Search for the process in the list
        while (temp != null && temp.processID != processID) {
            prev = temp;
            temp = temp.next;
            if (temp == head) break;
        }

        // If process is found
        if (temp != null && temp.processID == processID) {
            prev.next = temp.next;
            if (temp == tail) {
                tail = prev;  // Update tail if needed
            }
        }
    }

    // Perform the Round Robin scheduling
    public void roundRobinScheduling(int timeQuantum) {
        if (head == null) return;

        int totalWaitingTime = 0;
        int totalTurnAroundTime = 0;
        int numProcesses = 0;

        Process currentProcess = head;
        while (currentProcess != null) {
            numProcesses++;
            totalWaitingTime += currentProcess.remainingTime;
            totalTurnAroundTime += currentProcess.burstTime;
            currentProcess = currentProcess.next;
            if (currentProcess == head) break;
        }

        currentProcess = head;
        while (currentProcess != null) {
            // Execute the process for the time quantum
            System.out.println("Executing Process ID: " + currentProcess.processID);

            if (currentProcess.remainingTime > timeQuantum) {
                currentProcess.remainingTime -= timeQuantum;
            } else {
                // Process completes execution
                totalWaitingTime -= currentProcess.remainingTime;
                currentProcess.remainingTime = 0;
                removeProcess(currentProcess.processID);
                System.out.println("Process ID " + currentProcess.processID + " is finished.");
            }

            // Move to the next process in the circular list
            currentProcess = currentProcess.next;
            if (currentProcess == head) break;
        }

        // Display results
        System.out.println("Average Waiting Time: " + (totalWaitingTime / numProcesses));
        System.out.println("Average Turnaround Time: " + (totalTurnAroundTime / numProcesses));
    }

    // Display the list of processes
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in the queue.");
            return;
        }

        Process temp = head;
        System.out.println("Processes in the Circular Queue:");
        while (temp != null) {
            System.out.println("Process ID: " + temp.processID + " | Burst Time: " + temp.burstTime +
                    " | Priority: " + temp.priority + " | Remaining Time: " + temp.remainingTime);
            temp = temp.next;
            if (temp == head) break;
        }
    }
}

