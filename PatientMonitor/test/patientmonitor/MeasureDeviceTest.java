/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patientmonitor;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import patientmonitor.definition.Patient;
import static org.junit.Assert.*;

/**
 *
 * @author seed
 */
public class MeasureDeviceTest {

    MeasureDevice device;

    @Before
    public void setUp() {
        this.device = new MeasureDevice(3);
    }

    @After
    public void tearDown() {
    }

    /**
     * This test tries to create an instance but gives a null parameter
     */
    @Test(expected=IllegalArgumentException.class)
    public void testInvalidConstruction() throws Exception {
        MeasureDevice d = new MeasureDevice(null);
    }

    /**
     * This of initialzie with a null parameter
     */
    @Test(expected=IllegalArgumentException.class)
    public void testInvalidInitialization() throws Exception {
        this.device.initialize(null);
    }

    /**
     * Test of performMeasure method, of class MeasureDevice.
     */
    @Test
    public void testPerformMeasure() throws Exception {

        this.device.setPatient(new MonitorPatient(1, "vorname", "name"));
        float result = this.device.performMeasure();

        assertTrue(result > 0.0);
        
    }

    /**
     * Test of getDeviceId
     */
    @Test
    public void testGetDeviceId() throws Exception {
        assertEquals(new Integer(3),this.device.getDeviceId());
    }

}
