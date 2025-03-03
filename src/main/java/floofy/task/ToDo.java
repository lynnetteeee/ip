package floofy.task;

/**
 * Represents a ToDo task.
 */
public class ToDo extends Task {

    /**
     * Constructs a new object of the ToDo class.
     *
     * @param description The description of the ToDo task.
     */
    public ToDo(String description) {
        super(description);
    }

    /**
     * Returns the String form of the task type (ToDo) - "T".
     */
    @Override
    public String getType() {
        return "T";
    }

    /**
     * Returns a string form of a ToDo task.
     * */
    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}
