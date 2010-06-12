/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patientmonitor;

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author krigu
 */
public class MonitorObservationTest {

    @Test
    public void testCreate(){
        MonitorDoctor d = new MonitorDoctor(1,"pwd", "prename", "name");
        MonitorPatient p = new MonitorPatient(1, "Mäthu","Schiwago");
        MeasureDevice m = new MeasureDevice(1);

        Date now = new Date();
        
        MonitorObservationPeriod op = new MonitorObservationPeriod(d, m, p, now, now, 5);


        assertEquals(m,op.getDevice());
        assertEquals(p,op.getPatient());
        assertEquals(d,op.getDoctor());
        assertEquals(now,op.getFrom());
        assertEquals(now,op.getTo());
        assertEquals(new Integer(5),op.getFrequency());

        assertNotNull("Measures should not be null",op.getMeasures());
        assertTrue(op.getMeasures().isEmpty());

    }

}
