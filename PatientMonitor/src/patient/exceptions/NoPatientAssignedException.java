/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patient.exceptions;

/**
 *
 * @author krigu
 */
public class NoPatientAssignedException extends Exception {

    /**
     * Creates a new instance of <code>NoPatientAssignedException</code> without detail message.
     */
    public NoPatientAssignedException() {
    }


    /**
     * Constructs an instance of <code>NoPatientAssignedException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public NoPatientAssignedException(String msg) {
        super(msg);
    }
}
