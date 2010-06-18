/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patientmonitor.definition;

import patient.exceptions.DeviceNotAssignedException;
import java.util.Date;
import java.util.Set;
import patient.exceptions.InvalidDateRangeException;
import patient.exceptions.ObjectNotFoundException;
import patientmonitor.Measure;

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
     * Assigns the doctor the the patient with the given ID. If the ID is not found or null, a new patient will be created
     * @param patientId The Id of the patient"Obama"
     * @param patientName the name of the patient
     * @param patientPrename the prename of the patient     
     * @throws ObjectNotFoundException if no patient can be found with the given ID
     */
    public void assignDoctorPatient(Integer patientId, String patientName, String patientPrename);

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
    * Get all measures from the observation with the given Id
    *
    * @param observatoinId The ID of the observation period
    * @param from From-Date
    * @param to To-Date
    * @return All measures in the given time period
    * @throws ObjectNotFoundException if no patient with the given patientId or no observation period can be found with the given observationId
    * @throws InvalidDateRangeException if the given date range is not valid
    */
    public Set<Measure> consultMeasure(Integer observatoinId, Date from, Date to) throws ObjectNotFoundException, InvalidDateRangeException;


}
