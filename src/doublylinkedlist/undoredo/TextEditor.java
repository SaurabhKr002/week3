package doublylinkedlist.undoredo;

class TextEditor {
    private TextState currentState;
    private int maxHistorySize;
    private int currentSize;

    public TextEditor(int maxHistorySize) {
        this.maxHistorySize = maxHistorySize;
        this.currentSize = 0;
        this.currentState = null;
    }

    // Add a new text state
    public void addState(String textContent) {
        TextState newState = new TextState(textContent);

        if (currentState == null) {
            currentState = newState;
        } else {
            if (currentSize == maxHistorySize) {
                removeOldestState();
            }

            newState.prev = currentState;
            currentState.next = newState;
            currentState = newState;
        }
        currentSize++;
        System.out.println("Text state added: " + textContent);
    }

    // Remove the oldest state when the history size exceeds the limit
    private void removeOldestState() {
        TextState oldestState = currentState.prev;
        if (oldestState != null) {
            oldestState.next = null;
            currentState.prev = null;
        }
        currentSize--;
    }

    // Undo functionality
    public void undo() {
        if (currentState != null && currentState.prev != null) {
            currentState = currentState.prev;
            System.out.println("Undo: " + currentState.textContent);
        } else {
            System.out.println("No more undo actions.");
        }
    }

    // Redo functionality
    public void redo() {
        if (currentState != null && currentState.next != null) {
            currentState = currentState.next;
            System.out.println("Redo: " + currentState.textContent);
        } else {
            System.out.println("No more redo actions.");
        }
    }

    // Display current text state
    public void displayCurrentState() {
        if (currentState != null) {
            System.out.println("Current Text State: " + currentState.textContent);
        } else {
            System.out.println("No text state available.");
        }
    }
}