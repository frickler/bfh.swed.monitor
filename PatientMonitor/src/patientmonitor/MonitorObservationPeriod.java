/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patientmonitor;

import java.util.Date;
import java.util.HashSet;
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

    public Device getDevice() {
        return device;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public Date getFrom() {
        return from;
    }

    public Set<Measure> getMeasures() {
        return measures;
    }

    public Patient getPatient() {
        return patient;
    }

    public Date getTo() {
        return to;
    }

    public List getMeasures(Date from, Date to) throws InvalidDateRangeException {
        return null;
    }

    public MonitorObservationPeriod(Integer periodId,Doctor doctor, Device device, Patient patient, Date from, Date to, Integer frequency) {
        if (doctor == null || device == null || patient == null || from == null || to == null || frequency == null){
            throw new IllegalArgumentException();
        }

        this.doctor = doctor;
        this.device = device;
        this.patient = patient;
        this.from = from;
        this.to = to;
        this.frequency = frequency;

        this.measures = new HashSet<Measure>();

        this.device.initialize(this);
        
    }    

}
