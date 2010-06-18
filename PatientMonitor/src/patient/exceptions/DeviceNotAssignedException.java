/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patient.exceptions;

/**
 * This Exception is thrown, when a operation requires a Device but no
 * device is attached
 * @author krigu
 */
public class DeviceNotAssignedException extends Exception {

    /**
     * Creates a new instance of <code>DeviceNotAssignedException</code> without detail message.
     */
    public DeviceNotAssignedException() {
    }


    /**
     * Constructs an instance of <code>DeviceNotAssignedException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public DeviceNotAssignedException(String msg) {
        super(msg);
    }
}
