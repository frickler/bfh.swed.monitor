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
     * 
     * @param doctorId
     * @param password
     * @throws LoginException
     */
    public void login(Integer doctorId, String password) throws LoginException;

}
