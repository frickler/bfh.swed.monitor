/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patientmonitor.definition;

import java.util.Date;

/**
 *
 * @author krigu
 */
public interface SessionController {

    /**
     *
     */
    public void logout();

    /**
     *
     * @param patientId
     * @param patientName
     * @param patientPrename
     */
    public void assignDoctorPatient(Integer patientId, String patientName, String patientPrename);

    /**
     *
     * @param patientId
     * @param doctorId
     * @param begin
     * @param end
     * @param frequency
     */
    public void defineObservationPeriod(Integer patientId, Integer doctorId, Date begin, Date end, Integer frequency);

    /**
     * 
     * @param deviceId
     */
    public void deviceReturn(Integer deviceId);

    /**
     * 
     * @param patientId
     * @return
     */
    public ObservationPeriod consultObservationPeriod(Integer patientId);

    /**
     * @todo: Param??
     */
    public void testMeasure();

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
