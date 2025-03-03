package floofy.task;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests the Deadline class.
 */
public class DeadlineTest {

    /**
     * Tests the string format of the deadline task.
     */
    @Test
    public void deadlineStringFormat_validDescAndDateInput_success() {
        Deadline deadline = new Deadline("return book", LocalDate.parse("2021-08-27"));
        assertEquals("[D][ ] return book (by: 2021-08-27)", deadline.toString());
    }

    /**
     * Tests the file format of the deadline task.
     */
    @Test
    public void deadlineFileFormat_validDescAndDateInput_success() {
        Deadline deadline = new Deadline("return book", LocalDate.parse("2021-08-27"));
        assertEquals("D | 0 | return book | Aug 27 2021", deadline.toFileFormat());
    }
}
