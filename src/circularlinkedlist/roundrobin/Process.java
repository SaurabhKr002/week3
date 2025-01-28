package circularlinkedlist.roundrobin;

class Process {
    int processID;
    int burstTime;
    int remainingTime;
    int priority;
    Process next;

    public Process(int processID, int burstTime, int priority) {
        this.processID = processID;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;  // Initially, the remaining time is equal to burst time.
        this.priority = priority;
        this.next = null;
    }
}
