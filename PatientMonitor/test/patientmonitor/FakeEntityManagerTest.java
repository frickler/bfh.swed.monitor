/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patientmonitor;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import patient.exceptions.ObjectNotFoundException;
import patientmonitor.definition.Device;
import patientmonitor.definition.Doctor;
import patientmonitor.definition.ObservationPeriod;
import patientmonitor.definition.Patient;
import static org.junit.Assert.*;

/**
 *
 * @author seed
 */
public class FakeEntityManagerTest {

    FakeEntityManager manager;

    @Before
    public void setUp() {
        this.manager = new FakeEntityManager();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getDoctor method, of class FakeEntityManager.
     */
    @Test
    public void testGetDoctor() throws Exception {
        Doctor doctor = this.manager.getDoctor(3);
        assertNotNull(doctor);
    }

    @Test(expected=ObjectNotFoundException.class)
    public void testGetNotExistingDoctor() throws Exception {
        this.manager.getDoctor(40);
    }

    /**
     * Test of getPatient method, of class FakeEntityManager.
     */
    @Test
    public void testGetPatient() throws Exception {
        Patient patient = this.manager.getPatient(3);
        assertNotNull(patient);
    }

    @Test(expected=ObjectNotFoundException.class)
    public void testGetNotExistingPatient() throws Exception {
        this.manager.getPatient(40);
    }

    /**
     * Test of getDevice method, of class FakeEntityManager.
     */
    @Test
    public void testGetDevice() throws Exception {
        Device device = this.manager.getDevice(3);
        assertNotNull(device);
        assertEquals(device.getDeviceId(),new Integer(3));
    }
    
    @Test(expected=ObjectNotFoundException.class)
    public void testGetNotExistingDevice()throws Exception {
        this.manager.getDevice(40);
    }


    /**
     * Test of createPatient method, of class FakeEntityManager.
     */
    @Test
    public void testCreatePatient() {
        Patient patient = this.manager.createPatient("Oliver","Biberstein");
        assertNotNull(patient);
    }

    /**
     * Test of getObservationPeriod method, of class FakeEntityManager.
     */
    @Test
    public void testGetObservationPeriod() throws Exception {
        ObservationPeriod period = this.manager.getObservationPeriod(3);
        assertNotNull(period);
        
    }

    /**
     * Test of getObservationPeriodsOfPatient method, of class FakeEntityManager.
     */
    @Test
    public void testGetObservationPeriodsOfPatient() throws Exception {

    }

    /**
     * Test of save method, of class FakeEntityManager.
     */
    @Test
    public void testSave() {

    }

}