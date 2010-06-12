/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patientmonitor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import patient.exceptions.LoginException;
import patientmonitor.definition.Patient;

/**
 *
 * @author krigu
 */
public class MonitorDoctor implements patientmonitor.definition.Doctor{

    private Set<Patient> assignedPatients;

    private Integer doctorId;
    private String password;
    private String firstName;
    private String name;

    /**
     * 
     * @return
     */
    public Set<Patient> getAssignedPatients() {
        return assignedPatients;
        
    }

    public Boolean comparePassword(String password) throws LoginException {
        if (this.password.equals(password)){
            return Boolean.TRUE;
        } else {
            throw new LoginException("Password does not match");
        }
    }

    public void addPatient(Patient patient) {
        if (patient == null){
            throw new IllegalArgumentException();
        }
        this.assignedPatients.add(patient);
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

    public String getFirstName() {
        return firstName;
    }

    public void setPreName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public MonitorDoctor(Integer doctorId, String password, String firstName, String name) {
        if (password == null || firstName == null || name == null || doctorId == null){
            throw new IllegalArgumentException();
        }

        this.password = password;
        this.firstName = firstName;
        this.name = name;
        this.doctorId = doctorId;

        this.assignedPatients = new HashSet<Patient>();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MonitorDoctor other = (MonitorDoctor) obj;
        if (this.doctorId != other.doctorId && (this.doctorId == null || !this.doctorId.equals(other.doctorId))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (this.doctorId != null ? this.doctorId.hashCode() : 0);
        return hash;
    }

    
}
