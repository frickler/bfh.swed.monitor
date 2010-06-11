/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patientmonitor.definition;

import patient.exceptions.DeviceNotAssignedException;
import java.util.Date;
import patient.exceptions.InvalidDateRangeException;
import patient.exceptions.ObjectNotFoundException;

/**
 * 
 *
 * @author krigu
 */
public interface SessionController {

    /**
     * empty method body
     */
    public void logout();

    /**
     * Assigns the doctor the the patient with the given ID
     * @param patientId The Id of the patient
     * @param patientName the name of the patient
     * @param patientPrename the prename of the patient
     * @throws ObjectNotFoundException if no patient can be found with the given ID
     */
    public void assignDoctorPatient(Integer patientId, String patientName, String patientPrename) throws ObjectNotFoundException;

    /**
     * Defines a new Oobservation period
     * @param patientId The ID of the patient
     * @param doctorId The ID of the doctor
     * @param begin Startdate
     * @param end Enddate
     * @param frequency
     * @throws ObjectNotFoundException if no patient with the given patientId or no doctor can be found with the given doctorId
     * @throws InvalidDateRangeException if the given date range is not valid
     */
    public void defineObservationPeriod(Integer patientId, Integer doctorId, Date begin, Date end, Integer frequency) throws ObjectNotFoundException, InvalidDateRangeException;

    /**
     * 
     * @param deviceId The ID of the device
     */
    public void deviceReturn(Integer deviceId) throws ObjectNotFoundException;

    /**
     * Returns the obser
     * @param patientId The ID of the patient
     * @return
     */
    public ObservationPeriod consultObservationPeriod(Integer patientId) throws ObjectNotFoundException;

    /**
     * Performs a measure and returns the temperature
     * <b>Attention</b> Before calling this method, defineObservationPeriod must be called
     * @return the temperature from the measure
     * @throws  If no device is assigned to perform the measure with
     */
    public Integer testMeasure() throws DeviceNotAssignedException;

   /**
    * 
    * @param patientId
    * @param observatoinId
    * @param from
    * @param to
    * @return
    */
    public ObservationPeriod consultMeasure(Integer patientId, Integer observatoinId, Date from, Date to);


}
