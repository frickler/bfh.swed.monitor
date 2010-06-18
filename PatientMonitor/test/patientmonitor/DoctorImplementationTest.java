/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmonitor;

import org.junit.Before;
import org.junit.Test;
import patient.exceptions.LoginException;

import static org.junit.Assert.*;

/**
 *
 * @author krigu
 */
public class DoctorImplementationTest {

    private MonitorDoctor d;
    private String name = "Schiwago";
    private String preName = "Doktor";
    private String password = "$ecr3t";
    private Integer id = 1;

    @Before
    public void setUp(){
        d = new MonitorDoctor(id, password, preName, name);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testFalseConstructor(){
        MonitorDoctor doctor = new MonitorDoctor(id,null, null, name);

    }

    /**
     * Tests the constructor of the doctor object
     */
    @Test
    public void testCreateDoctor() {

        assertNotNull(d);

        assertEquals(d.getName(), this.name);
        assertEquals(d.getFirstName(), this.preName);
        assertEquals(d.getPassword(), this.password);
        assertEquals(d.getDoctorId(), this.id);
    }

    @Test
    public void testCorrectPassword() throws LoginException {
        assertTrue(d.comparePassword(password));
    }

    @Test(expected = LoginException.class)
    public void testIncorrectPassword() throws LoginException {
        assertTrue(d.comparePassword("dummy"));
    }


    @Test
    public void testAddPatient() throws LoginException {
        MonitorDoctor doctor = new MonitorDoctor(1,password, preName, name);

        MonitorPatient p1 = new MonitorPatient(1, "Krigu","Feuz");
        MonitorPatient p2 = new MonitorPatient(2, "Timo","Hildebrand");

        assertNotNull(doctor.getAssignedPatients());
        assertTrue(doctor.getAssignedPatients().isEmpty());

        doctor.addPatient(p1);
        doctor.addPatient(p2);

        assertEquals(doctor.getAssignedPatients().size(),2);

        assertTrue(doctor.getAssignedPatients().contains(p1));
        assertTrue(doctor.getAssignedPatients().contains(p2));
    }

    @Test
    public void testAddSamePatientTwice() throws LoginException {
        MonitorDoctor doctor = new MonitorDoctor(1,password, preName, name);

        MonitorPatient p1 = new MonitorPatient(1, "Blaise","Nkufo");
        MonitorPatient p2 = new MonitorPatient(2, "Christof","Blocher");

        assertNotNull(doctor.getAssignedPatients());
        assertTrue(doctor.getAssignedPatients().isEmpty());

        doctor.addPatient(p1);
        doctor.addPatient(p1);

        assertEquals(doctor.getAssignedPatients().size(), 1);
    }



}
