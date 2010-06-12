/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patientmonitor;

import java.util.Date;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import patientmonitor.definition.Patient;

/**
 *
 * @author seed
 */
public class MeasureDeviceTest {

    public MeasureDeviceTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of performMeasure method, of class MeasureDevice.
     */
    @Test
    public void testPerformMeasure() throws Exception {
        MeasureDevice instance = new MeasureDevice();
        float result = instance.performMeasure();
        Assert.assertTrue(result > 0.0);
        
    }

}