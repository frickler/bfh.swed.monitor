/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patientmonitor.definition;

import java.util.Date;
import java.util.Set;
import patient.exceptions.ObjectNotFoundException;

/**
 * Stores the Datas
 *
 * @author krigu
 */
public interface EntityManager {

    /**password
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
    public Device getDevice(Integer deviceId) throws ObjectNotFoundException;

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
     * @return the observation period
     * @throws ObjectNotFoundException If no  exists with the given observationPeriodId
     */
    public ObservationPeriod getObservationPeriod(Integer observationPeriodId) throws ObjectNotFoundException;


    /**
     * Get all Observation Periods of a patient
     *
     * @param patientId
     * @return List of obsrevation periods
     * @throws ObjectNotFoundException If no patient with the given ID can be found
     */
    public Set<ObservationPeriod> getObservationPeriodsOfPatient(Integer patientId) throws ObjectNotFoundException;

    /**
     * Creates a new ObservationPeriod Object and returns it
     *
     * @param doctorId
     * @param patientId
     * @param deviceId
     * @param from
     * @param to
     * @param frequency
     * @return
     * @throws ObjectNotFoundException
     */
    public ObservationPeriod createObservationPeriod(Doctor doctor, Patient patient, Device device,
                                                     Date from, Date to, Integer frequency)throws ObjectNotFoundException;
}