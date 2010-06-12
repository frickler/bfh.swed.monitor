/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patientmonitor.definition;

import java.util.List;
import patient.exceptions.ObjectNotFoundException;

/**
 * Stores the Datas
 *
 * @author krigu
 */
public interface EntityManager {

    /**
     * Get a doctor object by his ID or throws an ObjectNotFoundException
     * if the doctor is not found
     * @param doctorId The Id of the doctor
     * @return the doctor
     * @throws ObjectNotFoundException If no doctor exists with the given doctorId
     */
    public Doctor getDoctor(Integer doctorId) throws ObjectNotFoundException;

    /**
     * Get a patient object by his ID or throws an ObjectNotFoundException
     * if the patient is not found
     * @param patientId The Id of the doctor
     * @return the patient
     * @throws ObjectNotFoundException If no patient exists with the given patientId
     */
    public Patient getPatient(Integer patientId) throws ObjectNotFoundException;

    /**
     * Get a device object by his ID or throws an ObjectNotFoundException
     * if the device is not found
     * @param deviceId The Id of the device
     * @return the patient
     * @throws ObjectNotFoundException If no patient exists with the given deviceId
     */
    public Device getDevice(Integer deviceId);

    /**
     * Creates a new patient
     * @param patientName
     * @param patientPrename
     * @return the new created instance of the patient
     */
    public Patient createPatient(String patientName, String patientPrename);

    /**
     * Get a observation period object by his ID or throws an ObjectNotFoundException
     * if the observation period is not found
     * @param observationPeriodId The Id of the doctor
     * @return the patient
     * @throws ObjectNotFoundException If no  exists with the given observationPeriodId
     */
    public Integer getObservationPeriod(Integer observationPeriodId) throws ObjectNotFoundException;


    /**
     * Get all Observation Periods of a patient
     *
     * @param patientId
     * @return List of obsrevation periods
     * @throws ObjectNotFoundException If no patient with the given ID can be found
     */
    public List<ObservationPeriod> getObservationPeriodsOfPatient(Integer patientId) throws ObjectNotFoundException;

    /**
     * Saves the given object
     * @param o
     */
    public void save(Object o);

}