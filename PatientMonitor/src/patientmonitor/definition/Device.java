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
     * @param begin Startdate
     * @param end Enddate
     * @param frequency Frequency
     */
    public void initialize(Date begin, Date end, Integer frequency) throws InvalidDateRangeException;

    /**
     * Assigns a patient to this device
     * @param patient Patient, which will be assigned
     */
    public void setPatient(Patient patient);

    /**
     * 
     * Performs a mesaure and returns the temperature of the patient
     * 
     * @return Returns the temperature
     */
    public float performMeasure() throws NoPatientAssignedException;

}
