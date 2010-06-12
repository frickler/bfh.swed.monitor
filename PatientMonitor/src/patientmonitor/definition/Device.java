/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patientmonitor.definition;

import java.util.Date;
import patient.exceptions.InvalidDateRangeException;
import patient.exceptions.NoPatientAssignedException;

/**
 * This interface represents a device
 *
 * @author krigu
 */
public interface Device {

    /**
     * Initialize the device
     * @param period ObservationPeriod
     */
    public void initialize(ObservationPeriod period) throws NullPointerException;

    /**
     * Assigns a patient to this device
     * @param patient Patient, which will be assigned
     */
    @Deprecated
    public void setPatient(Patient patient);

    /**
     * 
     * Performs a mesaure and returns the temperature of the patient
     * 
     * @return Returns the temperature
     */
    public Float performMeasure() throws NoPatientAssignedException;

    /**
     *
     * Returns the id from the device
     *
     */
    public Integer getDeviceId();

}
