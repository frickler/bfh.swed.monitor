/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patient.exceptions;

/**
 * This exception is thrown, when a invalid time period is passed.
 *
 * For example if the from-date is smaller then the to-date or a date is null
 * @author krigu
 */
public class InvalidDateRangeException extends Exception {

    /**
     * Creates a new instance of <code>InvalidDateRangeException</code> without detail message.
     */
    public InvalidDateRangeException() {
    }


    /**
     * Constructs an instance of <code>InvalidDateRangeException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public InvalidDateRangeException(String msg) {
        super(msg);
    }
}
