/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patientmonitor;

import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.text.html.parser.Entity;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import patientmonitor.definition.Doctor;
import patientmonitor.definition.EntityManager;
import static org.junit.Assert.*;
import patientmonitor.definition.ObservationPeriod;
import patientmonitor.definition.Patient;
import patientmonitor.definition.SessionController;
import sun.util.calendar.Gregorian;

/**
 *
 * @author seed
 */
public class MonitorSessionControllerTest {

    /**
     * "Dummy placeholder" test
     */
   @Test
   public void testLogout(){
        EntityManager em = new FakeEntityManager();
       SessionController c = new MonitorSessionController(new MonitorDoctor(1, "test", "test", "test"),em);
       c.logout();

   }

    /**
     * Test the assigning of a patient to a doctor
     * The patient does not yet exists in this test case
     *
     */
    @Test
    public void assignDoctorPatientNewPatientTest(){

        String name = "name";
        String firstname = "firstname";

        Doctor d = new MonitorDoctor(1, "test", "test", "test");
        EntityManager em = new FakeEntityManager();
        SessionController s = new MonitorSessionController(d,em);
        s.assignDoctorPatient(null, name, firstname);

        assertNotNull(d.getAssignedPatients());

        Boolean found = Boolean.FALSE;
        for (Patient p : d.getAssignedPatients()) {
            MonitorPatient mp = (MonitorPatient) p;
            System.out.println(mp.getName());
            if (mp.getName().equals(name) && mp.getFirstname().equals(firstname)){
                found = Boolean.TRUE;
            }
        }
        assertTrue("The patient is not in the list of assigned Patients", found);
    }

    /**
     * Test the assigning of a patient to a doctor
     * The patient does exists in this test case
     *
     */
    @Test
    public void assignDoctorPatientExistingPatientTest(){

        EntityManager em = new FakeEntityManager();
        Doctor d = new MonitorDoctor(1, "test", "test", "test");

        SessionController s = new MonitorSessionController(d,em);

        s.assignDoctorPatient(1, "Maulwurf1", "Hans");

        assertNotNull(d.getAssignedPatients());

        Boolean found = Boolean.FALSE;

        for (Patient p : d.getAssignedPatients()) {
            MonitorPatient mp = (MonitorPatient) p;
            System.out.println("Name: " + mp.getName() + " Vorname: " + mp.getFirstname());
            if (mp.getName().equals("Maulwurf1") && mp.getFirstname().equals("Hans") && mp.getPatientId().equals(new Integer(1))){
                found = Boolean.TRUE;
            }
        }
        assertTrue("The patient is not in the list of assigned Patients", found);
    }

    /**
     * Test of defineObservationPeriod method, of class MonitorSessionController.
     */
    @Test
    public void testDefineObservationPeriod() {
        EntityManager em = new FakeEntityManager();
        MonitorSessionController c = new MonitorSessionController(new MonitorDoctor(1,"password","Hans","Maulwurf"),em);
        c.defineObservationPeriod(3, 3, new GregorianCalendar(2010,6,3).getTime(), new GregorianCalendar(2010,7,3).getTime(), 60);

    }

    /**
     * Test of deviceReturn method, of class MonitorSessionController.
     */
    @Test
    public void testDeviceReturn() {
        System.out.println("deviceReturn");
        Integer deviceId = null;
        MonitorSessionController instance = null;
        instance.deviceReturn(deviceId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultObservationPeriod method, of class MonitorSessionController.
     */
    @Test
    public void testConsultObservationPeriod() {
        System.out.println("consultObservationPeriod");
        Integer patientId = null;
        MonitorSessionController instance = null;
        ObservationPeriod expResult = null;
        ObservationPeriod result = instance.consultObservationPeriod(patientId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultMeasure method, of class MonitorSessionController.
     */
    @Test
    public void testConsultMeasure() {

    }

    /**
     * Test of assignDoctorPatient method, of class MonitorSessionController.
     */
    @Test
    public void testAssignDoctorPatient_4args() throws Exception {
        System.out.println("assignDoctorPatient");
        Integer patientId = null;
        String patientName = "";
        String patientPrename = "";
        String password = "";
        MonitorSessionController instance = null;
        instance.assignDoctorPatient(patientId, patientName, patientPrename, password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of testMeasure method, of class MonitorSessionController.
     */
    @Test
    public void testTestMeasure() throws Exception {
        System.out.println("testMeasure");
        MonitorSessionController instance = null;
        Integer expResult = null;
        Integer result = instance.testMeasure();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}