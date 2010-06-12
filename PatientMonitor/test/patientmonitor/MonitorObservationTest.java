/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patientmonitor;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.junit.Test;

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

        //Date d = new Date();
        
        //MonitorObservationPeriod o = new MonitorObservationPeriod(d, m, p, null, null, Integer.MIN_VALUE)
    }

}