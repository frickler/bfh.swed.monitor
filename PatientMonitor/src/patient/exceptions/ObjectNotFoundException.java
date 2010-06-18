/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patient.exceptions;

/**
 * this exception is thrown when a method tries to get a object by an id and the
 * object can't be found from the EntityManager
 * @author krigu
 */
public class ObjectNotFoundException extends Exception {

    /**
     * Creates a new instance of <code>ObjectNotFoundException</code> without detail message.
     */
    public ObjectNotFoundException() {
    }


    /**
     * Constructs an instance of <code>ObjectNotFoundException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public ObjectNotFoundException(String msg) {
        super(msg);
    }
}
