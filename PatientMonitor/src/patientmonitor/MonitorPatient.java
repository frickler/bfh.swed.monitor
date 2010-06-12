/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmonitor;

import patientmonitor.definition.Patient;

/**
 *
 * @author krigu
 */
public class MonitorPatient implements Patient {

    private String name;
    private String firstname;
    private Integer patientId;

    public String getName() {
        return name;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public MonitorPatient(Integer patientId,String firstname,String name) {
        if (name == null || patientId == null || firstname == null){
            throw new IllegalArgumentException();
        }

        this.name = name;
        this.firstname = firstname;
        this.patientId = patientId;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MonitorPatient other = (MonitorPatient) obj;
        if (this.patientId != other.patientId && (this.patientId == null || !this.patientId.equals(other.patientId))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + (this.patientId != null ? this.patientId.hashCode() : 0);
        return hash;
    }


}
