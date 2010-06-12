/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import patientmonitor.DoctorImplementation;
import patientmonitor.definition.Doctor;

/**
 *
 * @author krigu
 */
public class DoctorTest {

    public DoctorTest() {
    }

    @Test
    public void createTest(){

        Doctor d = new DoctorImplementation("pwd", "Krigu", "Feuz");
        
    }



}