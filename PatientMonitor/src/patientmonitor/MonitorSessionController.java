/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patientmonitor;

import java.util.Date;
import patient.exceptions.DeviceNotAssignedException;
import patientmonitor.definition.ObservationPeriod;
import patientmonitor.definition.SessionController;

/**
 *
 * @author seed
 */
public class MonitorSessionController implements SessionController{


    public void logout() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void assignDoctorPatient(Integer patientId, String patientName, String patientPrename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

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

    public Integer testMeasure() throws DeviceNotAssignedException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
