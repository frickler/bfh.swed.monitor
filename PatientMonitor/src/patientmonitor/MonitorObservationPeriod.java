/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patientmonitor;

import java.util.Date;
import java.util.List;
import java.util.Set;
import patient.exceptions.InvalidDateRangeException;
import patientmonitor.definition.Device;
import patientmonitor.definition.Doctor;
import patientmonitor.definition.ObservationPeriod;
import patientmonitor.definition.Patient;

/**
 *
 * @author krigu
 */
public class MonitorObservationPeriod implements ObservationPeriod{

    private Set<Measure> measures;
    private Doctor doctor;
    private Device device;
    private Patient patient;
    private Date from;
    private Date to;
    private Integer frequency;

    public void setDevice(Device device) {
        this.device = device;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public void setMeasures(Set<Measure> measures) {
        this.measures = measures;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setTo(Date to) {
        this.to = to;
    }

    public List getMeasures(Date from, Date to) throws InvalidDateRangeException {
        return null;
    }

    public MonitorObservationPeriod(Doctor doctor, Device device, Patient patient, Date from, Date to, Integer frequency) {
        if (doctor == null || device == null || patient == null || from == null || to == null || frequency == null){
            throw new IllegalArgumentException();
        }

        this.doctor = doctor;
        this.device = device;
        this.patient = patient;
        this.from = from;
        this.to = to;
        this.frequency = frequency;
        
    }    

}
