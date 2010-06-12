/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmonitor;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import patient.exceptions.LoginException;

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
    public void setUp() {
        d = new MonitorDoctor(1,password, preName, name);
    }

    @After
    public void tearDown() {
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

        Assert.assertNotNull(d);

        Assert.assertEquals(d.getName(), this.name);
        Assert.assertEquals(d.getPreName(), this.preName);
        Assert.assertEquals(d.getPassword(), this.password);
        Assert.assertEquals(d.getDoctorId(), this.id);
    }

    @Test
    public void testCorrectPassword() throws LoginException {
        Assert.assertTrue(d.comparePassword(password));
    }

    @Test(expected = LoginException.class)
    public void testIncorrectPassword() throws LoginException {
        Assert.assertTrue(d.comparePassword("dummy"));
    }


    @Test
    public void testAddPatient() throws LoginException {
        MonitorDoctor doctor = new MonitorDoctor(1,password, preName, name);

        MonitorPatient p1 = new MonitorPatient(1, "Krigu");
        MonitorPatient p2 = new MonitorPatient(2, "C-Web");

        Assert.assertNotNull(doctor.getAssignedPatients());
        Assert.assertTrue(doctor.getAssignedPatients().isEmpty());

        doctor.addPatient(p1);
        doctor.addPatient(p2);

        Assert.assertEquals(doctor.getAssignedPatients().size(),2);

        Assert.assertTrue(doctor.getAssignedPatients().contains(p1));
        Assert.assertTrue(doctor.getAssignedPatients().contains(p2));
    }


}
