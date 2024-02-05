public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getTask() {
        return this.description;
    }

    public String getType() {
        return "";
    }

    public String getStatusIcon() {
        return (isDone ? "[X]" : "[ ]"); // mark done task with X
    }

    public void markTask() {
        this.isDone = true;
        System.out.println("Nice! I've marked this task as done:");
        System.out.println(this.toString());
    }

    public void unmarkTask() {
        this.isDone = false;
        System.out.println("OK, I've marked this task as not done yet:");
        System.out.println(this.toString());
    }

    public void addTask(int total) {
        System.out.println("Got it. I've added this task:");
        System.out.println(this.toString());
        String formatted = String.format("Now you have %d tasks in the list.", total);
        System.out.println(formatted);
    }

    public void deleteTask(int newTotal) {
        System.out.println("Noted. I've removed this task:");
        System.out.println(this.toString());
        String formatted = String.format("Now you have %d tasks in the list.", newTotal);
        System.out.println(formatted);
    }

    public String toFileFormat() {
        return String.format("%s | %d | %s", this.getType(), this.isDone ? 1 : 0, this.description);
    }

    @Override
    public String toString() {
        return getStatusIcon() + " " + this.description;
    }
}
