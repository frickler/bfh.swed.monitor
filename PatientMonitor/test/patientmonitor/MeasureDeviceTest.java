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
     * Test of initialize method, of class MeasureDevice.
     */
    @Test
    public void testInitialize() throws Exception {
        System.out.println("initialize");
        Date begin = null;
        Date end = null;
        Integer frequency = null;
        MeasureDevice instance = new MeasureDevice();
        instance.initialize(begin, end, frequency);
        Assert.assertTrue(false);
    }

    /**
     * Test of setPatient method, of class MeasureDevice.
     */
    @Test
    public void testSetPatient() {
        System.out.println("setPatient");
        Patient patient = null;
        MeasureDevice instance = new MeasureDevice();
        instance.setPatient(patient);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of performMeasure method, of class MeasureDevice.
     */
    @Test
    public void testPerformMeasure() throws Exception {
        System.out.println("performMeasure");
        MeasureDevice instance = new MeasureDevice();
        Integer expResult = null;
        Integer result = instance.performMeasure();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}