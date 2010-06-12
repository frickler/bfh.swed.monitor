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

    @Test(expected=IllegalArgumentException.class)
    public void testInvalidConstruction() throws Exception {
        MeasureDevice d = new MeasureDevice(null);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testInvalidInitialization() throws Exception {
        this.device.initialize(null);
    }

    /**
     * Test of performMeasure method, of class MeasureDevice.
     */
    @Test
    public void testPerformMeasure() throws Exception {
        float result = this.device.performMeasure();
        assertTrue(result > 0.0);
        
    }

    @Test
    public void testGetDeviceId() throws Exception {
        int expected = 3;
        int result = this.device.getDeviceId();
        assertTrue(result == expected);
    }

}
