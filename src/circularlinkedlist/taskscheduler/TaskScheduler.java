package circularlinkedlist.taskscheduler;

public class TaskScheduler {
    public static void main(String[] args) {
        CircularTaskScheduler scheduler = new CircularTaskScheduler();

        // Adding tasks
        scheduler.addTaskAtEnd(1, "Task 1", 3, "2025-02-20");
        scheduler.addTaskAtEnd(2, "Task 2", 2, "2025-03-15");
        scheduler.addTaskAtEnd(3, "Task 3", 1, "2025-04-10");

        // Display all tasks
        System.out.println("Displaying all tasks:");
        scheduler.displayAllTasks();

        // Add a task at the beginning
        scheduler.addTaskAtBeginning(4, "Task 4", 5, "2025-01-10");
        System.out.println("\nDisplaying all tasks after adding at the beginning:");
        scheduler.displayAllTasks();

        // Add a task at a specific position
        scheduler.addTaskAtPosition(2, 5, "Task 5", 4, "2025-02-15");
        System.out.println("\nDisplaying all tasks after adding at position 2:");
        scheduler.displayAllTasks();

        // Remove a task by Task ID
        scheduler.removeTask(2);
        System.out.println("\nDisplaying all tasks after removing Task ID 2:");
        scheduler.displayAllTasks();

        // View the current task
        System.out.println("\nViewing current task:");
        scheduler.viewCurrentTask();

        // Search for tasks with a specific priority
        System.out.println("\nSearching for tasks with priority 4:");
        scheduler.searchTaskByPriority(4);
    }
}

