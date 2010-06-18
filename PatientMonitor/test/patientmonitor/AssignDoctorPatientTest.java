/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patientmonitor;

import org.junit.Test;
import patient.exceptions.ObjectNotFoundException;
import patientmonitor.definition.Doctor;
import patientmonitor.definition.Patient;
import patientmonitor.definition.SessionController;

import static org.junit.Assert.*;

/**
 *
 * @author krigu
 */
public class AssignDoctorPatientTest {

    /**
     * Test the assigning of a patient to a doctor
     * The patient does not yet exists in this test case
     * 
     */
    @Test
    public void assignDoctorPatientNewTTest(){

        String name = "name";
        String firstname = "firstname";

        Doctor d = new MonitorDoctor(1, "test", "test", "test");
        
        SessionController s = new MonitorSessionController(d);
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

}