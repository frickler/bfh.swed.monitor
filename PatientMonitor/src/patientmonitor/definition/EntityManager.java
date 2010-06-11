/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patientmonitor.definition;

/**
 * Stores the Datas
 *
 * @author krigu
 */
public interface EntityManager {

    /**
     * get a Doctor Object by his id
     * @param doctorId The Id of the doctor
     * @return the doctor, null if not found
     */
    public Doctor getDoctor(Integer doctorId) throws ObjectNotFoundException;

    /**
     *
     * @param patientId
     * @return
     */
    public Patient getPatient(Integer patientId);

    /**
     *
     * @param deviceId
     * @return
     */
    public Device getDevice(Integer deviceId);

    /**
     * 
     * @param patientName
     * @param patientPrename
     * @return
     */
    public Patient createPatient(String patientName, String patientPrename);

    /**
     * 
     * @param o
     */
    public void save(Object o);

}
