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
import patient.exceptions.ObjectNotFoundException;
import patientmonitor.definition.Doctor;
import patientmonitor.definition.EntityManager;
import static org.junit.Assert.*;
import patientmonitor.definition.ObservationPeriod;
import patientmonitor.definition.Patient;
import patientmonitor.definition.SessionController;

/**
 *
 * @author seed
 */
public class MonitorSessionControllerTest {

    /**
     * "Dummy placeholder" test
     */
    @Test
    public void testLogout() {
        EntityManager em = new FakeEntityManager();
        SessionController c = new MonitorSessionController(new MonitorDoctor(1, "test", "test", "test"), em);
        c.logout();

    }

    /**
     * Test the assigning of a patient to a doctor
     * The patient does not yet exists in this test case
     *
     */
    @Test
    public void assignDoctorPatientNewPatientTest() {

        String name = "name";
        String firstname = "firstname";

        Doctor d = new MonitorDoctor(1, "test", "test", "test");
        EntityManager em = new FakeEntityManager();
        SessionController s = new MonitorSessionController(d, em);
        s.assignDoctorPatient(null, name, firstname);

        assertNotNull(d.getAssignedPatients());

        Boolean found = Boolean.FALSE;
        for (Patient p : d.getAssignedPatients()) {
            MonitorPatient mp = (MonitorPatient) p;
            System.out.println(mp.getName());
            if (mp.getName().equals(name) && mp.getFirstname().equals(firstname)) {
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
    public void assignDoctorPatientExistingPatientTest() {

        EntityManager em = new FakeEntityManager();
        Doctor d = new MonitorDoctor(1, "test", "test", "test");

        SessionController s = new MonitorSessionController(d, em);

        s.assignDoctorPatient(1, "Maulwurf1", "Hans");

        assertNotNull(d.getAssignedPatients());

        Boolean found = Boolean.FALSE;

        for (Patient p : d.getAssignedPatients()) {
            MonitorPatient mp = (MonitorPatient) p;
            System.out.println("Name: " + mp.getName() + " Vorname: " + mp.getFirstname());
            if (mp.getName().equals("Maulwurf1") && mp.getFirstname().equals("Hans") && mp.getPatientId().equals(new Integer(1))) {
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
        MonitorSessionController c = new MonitorSessionController(new MonitorDoctor(1, "password", "Hans", "Maulwurf"), em);
        c.defineObservationPeriod(3, 3, new GregorianCalendar(2010, 6, 3).getTime(), new GregorianCalendar(2010, 7, 3).getTime(), 60);

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
    public void testConsultObservationPeriod() throws ObjectNotFoundException {

        Doctor d = new MonitorDoctor(1, "test", "test", "test");
        EntityManager em = new FakeEntityManager();
        SessionController s = new MonitorSessionController(d, em);

        s.consultObservationPeriod(1);

    }

    /**
     * Test of consultMeasure method (happy path)
     */
    @Test
    public void testConsultMeasure() throws InvalidDateRangeException, ObjectNotFoundException {

        Doctor d = new MonitorDoctor(1, "test", "test", "test");
        EntityManager em = new FakeEntityManager();
        SessionController s = new MonitorSessionController(d, em);

        GregorianCalendar calFrom = new GregorianCalendar(2010, Calendar.JUNE, 5);
        Date from = calFrom.getTime();

        GregorianCalendar calTo = new GregorianCalendar(2010, Calendar.JUNE, 10);
        Date to = calTo.getTime();

        Set<Measure> ml = s.consultMeasure(1, from, to);

        Set<Measure> result = new HashSet<Measure>();
        for (Measure measure : ml) {
            if ((measure.getDate().compareTo(from) > -1) && (measure.getDate().compareTo(to) < 1)) {
                result.add(measure);
            }
        }

        try {
            assertEquals(result.size(), ml.size());
        } catch (Exception e) {
        }

    }

    /**
     * Test of assignDoctorPatient method, of class MonitorSessionController.
     */
    @Test
    public void testAssignDoctorPatient_4args() throws Exception {

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
