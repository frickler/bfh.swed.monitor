/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patientmonitor;

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
                return new MonitorSessionController(d,em);
            }
            return null;
        } catch (ObjectNotFoundException ex) {
            // Doctor not found
            throw new LoginException(ex.getMessage());
        }
    }

}
