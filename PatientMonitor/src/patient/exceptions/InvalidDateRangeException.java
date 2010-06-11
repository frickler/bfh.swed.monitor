/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patient.exceptions;

/**
 *
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
