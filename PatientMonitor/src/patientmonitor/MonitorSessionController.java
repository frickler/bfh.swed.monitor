/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patientmonitor;

import java.util.Date;
import java.util.Set;
import patient.exceptions.DeviceNotAssignedException;
import patient.exceptions.InvalidDateRangeException;
import patient.exceptions.ObjectNotFoundException;
import patientmonitor.definition.Doctor;
import patientmonitor.definition.EntityManager;
import patientmonitor.definition.ObservationPeriod;
import patientmonitor.definition.Patient;
import patientmonitor.definition.SessionController;

/**
 *
 * @author seed
 */
public class MonitorSessionController implements SessionController{

    private EntityManager em;
    private Doctor d;

    public MonitorSessionController(Doctor d,EntityManager em) {
        if (d == null){
            throw new IllegalArgumentException("Doctor can't be null");
        }
        this.em = em;
        this.d = d;
    }

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

        Patient p = null;
        try {
            p = em.getPatient(patientId);
        } catch (ObjectNotFoundException ex) {
            // No patient found -> create new
            p = em.createPatient(patientName, patientPrename);            
        }
        d.addPatient(p);

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

    public Set<Measure> consultMeasure(Integer observatoinId, Date from, Date to) throws ObjectNotFoundException, InvalidDateRangeException {
        ObservationPeriod op = em.getObservationPeriod(observatoinId);
        return op.getMeasures(from, to);
    }

    public void assignDoctorPatient(Integer patientId, String patientName, String patientPrename, String password) throws ObjectNotFoundException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Integer testMeasure() throws DeviceNotAssignedException {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}
