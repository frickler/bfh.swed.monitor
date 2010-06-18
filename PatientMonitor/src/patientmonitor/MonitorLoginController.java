/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patientmonitor;

import java.util.logging.Level;
import java.util.logging.Logger;
import patient.exceptions.LoginException;
import patient.exceptions.ObjectNotFoundException;
import patientmonitor.definition.Doctor;
import patientmonitor.definition.EntityManager;
import patientmonitor.definition.LoginController;
import patientmonitor.definition.SessionController;

/**
 *
 * @author krigu
 */
public class MonitorLoginController implements LoginController{

    public SessionController login(Integer doctorId, String password) throws LoginException {
        
        EntityManager em = new FakeEntityManager();
        try {
            Doctor d = em.getDoctor(doctorId);
            if (d.comparePassword(password)){
                return new MonitorSessionController();
            }
            return null;
        } catch (ObjectNotFoundException ex) {
            // Doctor not found
            throw new LoginException(ex.getMessage());
        }
    }

}
