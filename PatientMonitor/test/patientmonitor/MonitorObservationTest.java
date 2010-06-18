/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmonitor;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;
import patient.exceptions.InvalidDateRangeException;
import static org.junit.Assert.*;

/**
 *
 * @author krigu
 */
public class MonitorObservationTest {

    /**
     * Test the constructor and the correct assignment of the fields
     */
    @Test
    public void testCreate() {
        MonitorDoctor d = new MonitorDoctor(1, "pwd", "prename", "name");
        MonitorPatient p = new MonitorPatient(1, "Mäthu", "Schiwago");
        MeasureDevice m = new MeasureDevice(1);

        Date now = new Date();

        MonitorObservationPeriod op = new MonitorObservationPeriod(1, d, m, p, now, now, 5);


        assertEquals(m, op.getDevice());
        assertEquals(p, op.getPatient());
        assertEquals(d, op.getDoctor());
        assertEquals(now, op.getFrom());
        assertEquals(now, op.getTo());
        assertEquals(new Integer(5), op.getFrequency());
        assertEquals(new Integer(1), op.getPeriodId());


        assertNotNull("Measures should not be null", op.getMeasures());
        assertFalse(op.getMeasures().isEmpty());

    }

    @Test
    public void testGetMeasures() {
        MonitorDoctor d = new MonitorDoctor(1, "pwd", "prename", "name");
        MonitorPatient p = new MonitorPatient(1, "Mäthu", "Schiwago");
        MeasureDevice m = new MeasureDevice(1);

        Date now = new Date();

        GregorianCalendar calFrom = new GregorianCalendar(2010, Calendar.JUNE, 5);
        Date from = calFrom.getTime();

        GregorianCalendar calTo = new GregorianCalendar(2010, Calendar.JUNE, 10);
        Date to = calTo.getTime();

        MonitorObservationPeriod op = new MonitorObservationPeriod(1, d, m, p, now, now, 5);

        Set<Measure> result = new HashSet<Measure>();
        for (Measure measure : op.getMeasures()) {
            if ((measure.getDate().compareTo(from) > -1) && (measure.getDate().compareTo(to)  < 1)){
                result.add(measure);
            }
        }

        try {
            assertEquals(result.size(), op.getMeasures(from, to).size());
        } catch (Exception e) {
        }

    }

    /**
     * Calls the getMeasures with a invalid Date format from < to
     */
    @Test(expected=InvalidDateRangeException.class)
    public void testGetInvalidMeasures() throws InvalidDateRangeException {
        MonitorDoctor d = new MonitorDoctor(1, "pwd", "prename", "name");
        MonitorPatient p = new MonitorPatient(1, "Mäthu", "Schiwago");
        MeasureDevice m = new MeasureDevice(1);

        Date now = new Date();

        MonitorObservationPeriod op = new MonitorObservationPeriod(1, d, m, p, now, now, 5);        

        GregorianCalendar calFrom = new GregorianCalendar(2010, Calendar.JUNE, 10);
        Date from = calFrom.getTime();

        GregorianCalendar calTo = new GregorianCalendar(2010, Calendar.JUNE, 5);
        Date to = calTo.getTime();

        op.getMeasures(from, to);

    }


    /**
     * Calls the getMeasures with a invalid Date null
     */
    @Test(expected=InvalidDateRangeException.class)
    public void testGetdMeasuresWithNullParameter() throws InvalidDateRangeException {
        MonitorDoctor d = new MonitorDoctor(1, "pwd", "prename", "name");
        MonitorPatient p = new MonitorPatient(1, "Mäthu", "Schiwago");
        MeasureDevice m = new MeasureDevice(1);

        Date now = new Date();

        MonitorObservationPeriod op = new MonitorObservationPeriod(1, d, m, p, now, now, 5);

        op.getMeasures(null, null);

    }

    /**
     * Tests the construction with illegal construtor parameters
     */
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidCreate() {
        MonitorDoctor d = null;
        MonitorPatient p = null;
        MeasureDevice m = null;

        Date now = new Date();

        MonitorObservationPeriod op = new MonitorObservationPeriod(1, d, m, p, now, now, 5);

    }
}
