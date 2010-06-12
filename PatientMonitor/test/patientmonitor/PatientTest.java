/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patientmonitor;

import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author krigu
 */
public class PatientTest {

    @Test
    public void testCreate(){
        MonitorPatient m = new MonitorPatient(1, "Alex","Frei");

        assertEquals(m.getPatientId(), new Integer("1"));
        assertEquals(m.getName(), "Frei");
        assertEquals(m.getFirstname(), "Alex");
    }

    @Test(expected=IllegalArgumentException.class)
    public void testIllegalCreate(){
        new MonitorPatient(1, null,null);
        new MonitorPatient(1,"Alex","Frei");
    }

}