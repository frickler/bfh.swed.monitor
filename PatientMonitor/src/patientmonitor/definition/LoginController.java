/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patientmonitor.definition;

import patient.exceptions.LoginException;

/**
 *
 * @author krigu
 */
public interface LoginController {

    /**
     * Creates a new sessioncontroller, if the doctorId and the password is valid
     *
     * @param doctorId The ID of the doctor
     * @param password The password
     * @return returns a sessioncontroller
     * @throws LoginException If no doctor with the given Id exists or if the password does not match
     */
    public SessionController login(Integer doctorId, String password) throws LoginException;

}
