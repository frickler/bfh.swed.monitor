/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patientmonitor.definition;

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
