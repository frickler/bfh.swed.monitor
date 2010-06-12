/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patientmonitor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import patient.exceptions.LoginException;
import patientmonitor.definition.Patient;

/**
 *
 * @author krigu
 */
public class DoctorImplementation implements patientmonitor.definition.Doctor{

    private List<Patient> assignedPatients;

    private String password;
    private String preName;
    private String name;

    /**
     * 
     * @return
     */
    public List<Patient> getAssignedPatients() {
        return assignedPatients;
        
    }

    public Boolean comparePassword(String password) throws LoginException {
        return this.password.equals(password);
    }

    public void addPatient(Patient patient) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPreName() {
        return preName;
    }

    public void setPreName(String preName) {
        this.preName = preName;
    }

    public DoctorImplementation(String password, String preName, String name) {
        if (password == null || preName == null || name == null){
            throw new IllegalArgumentException();
        }

        this.password = password;
        this.preName = preName;
        this.name = name;

        this.assignedPatients = new ArrayList<Patient>();
    }

}
