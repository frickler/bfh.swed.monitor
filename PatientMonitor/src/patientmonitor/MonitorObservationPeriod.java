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
import patient.exceptions.InvalidDateRangeException;
import patientmonitor.definition.Device;
import patientmonitor.definition.Doctor;
import patientmonitor.definition.ObservationPeriod;
import patientmonitor.definition.Patient;

/**
 *
 * @author krigu
 */
public class MonitorObservationPeriod implements ObservationPeriod {

    private Set<Measure> measures;
    private Doctor doctor;
    private Device device;
    private Patient patient;
    private Date from;
    private Date to;
    private Integer frequency;
    private Integer periodId;

    public Integer getPeriodId() {
        return periodId;
    }

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

    public Set getMeasures(Date from, Date to) throws InvalidDateRangeException {
        if (from == null || to == null || from.compareTo(to) > 0){
            throw new InvalidDateRangeException();
        }
        Set<Measure> result = new HashSet<Measure>();
        for (Measure measure : measures) {
            if ((measure.getDate().compareTo(from) > -1) && (measure.getDate().compareTo(to)  < 1)){
                result.add(measure);
            }
        }
        return result;
    }

    public MonitorObservationPeriod(Integer periodId, Doctor doctor, Device device, Patient patient, Date from, Date to, Integer frequency) {
        if (doctor == null || device == null || patient == null || from == null || to == null || frequency == null || periodId == null) {
            throw new IllegalArgumentException();
        }

        this.doctor = doctor;
        this.device = device;
        this.patient = patient;
        this.from = from;
        this.to = to;
        this.frequency = frequency;
        this.periodId = periodId;

        this.measures = new HashSet<Measure>();

        this.device.initialize(this);
        
        createMeasureList();
    }

    /**
     * Create some "random" measures
     */
    private void createMeasureList() {
        for (int i = 0; i < 30; i++) {
            
            GregorianCalendar date = new GregorianCalendar(2010, Calendar.JUNE, (int)((Math.random() * 29)+1));
            Date d = date.getTime();
            
            this.measures.add(new Measure(i, new Float((Math.random() * 10) + 30),d));

        }

    }

}
