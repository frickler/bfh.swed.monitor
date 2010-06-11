/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patientmonitor.definition;

/**
 *
 * @author krigu
 */
public interface Doctor {

    /**
     * Compares the stored password with the parameter
     *
     * @param password Password to login
     * @return True if password matches with stored password, false if they are not equal
     */
    public Boolean comparePassword(String password);

    /**
     * Adds a patient to the doctor
     * 
     * @param patient Patient
     */
    public void addPatient(Patient patient);

}
