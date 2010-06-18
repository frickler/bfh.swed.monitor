/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patientmonitor.definition;

import java.util.Set;
import patient.exceptions.LoginException;

/**
 * 
 *
 * @author krigu
 */
public interface Doctor {

    /**
     * Returns a set of all assigned patients to this doctor
     * @return assigned patients
     */
    public Set<Patient> getAssignedPatients();

    /**
     * Compares the stored password with the parameter
     *
     * @param password Password to login
     * @return True if password matches with stored password, false if they are not equal
     * @throws LoginException if password does not match with the password in parameter
     */
    public Boolean comparePassword(String password) throws LoginException;

    /**
     * Adds a patient to the doctor
     * 
     * @param patient Patient
     */
    public void addPatient(Patient patient);

    /**
     * Returns the doctor
     * @return The doctors ID
     */
    public Integer getDoctorId();

}
