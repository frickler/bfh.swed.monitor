/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patientmonitor;

import java.util.Date;
import patient.exceptions.DeviceNotAssignedException;
import patient.exceptions.ObjectNotFoundException;
import patientmonitor.definition.ObservationPeriod;
import patientmonitor.definition.SessionController;

/**
 *
 * @author seed
 */
public class MonitorSessionController implements SessionController{


    /**
     * Empty method (would destroy the SessionController)
     */
    public void logout() {
        
    }

    /**
     *
     * @param patientId
     * @param patientName
     * @param patientPrename
     */
    public void assignDoctorPatient(Integer patientId, String patientName, String patientPrename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     *
     * @param patientId
     * @param doctorId
     * @param begin
     * @param end
     * @param frequency
     */
    public void defineObservationPeriod(Integer patientId, Integer doctorId, Date begin, Date end, Integer frequency) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void deviceReturn(Integer deviceId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ObservationPeriod consultObservationPeriod(Integer patientId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ObservationPeriod consultMeasure(Integer patientId, Integer observatoinId, Date from, Date to) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void assignDoctorPatient(Integer patientId, String patientName, String patientPrename, String password) throws ObjectNotFoundException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Integer testMeasure() throws DeviceNotAssignedException {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}
