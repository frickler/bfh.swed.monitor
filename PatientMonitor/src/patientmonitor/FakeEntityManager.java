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
import patient.exceptions.ObjectNotFoundException;
import patientmonitor.definition.Device;
import patientmonitor.definition.Doctor;
import patientmonitor.definition.EntityManager;
import patientmonitor.definition.ObservationPeriod;
import patientmonitor.definition.Patient;

/**
 *
 * @author seed
 */
public class FakeEntityManager implements EntityManager {

    private Set<Patient> patients;
    private Set<Doctor> doctors;
    private Set<Device> devices;
    private Set<ObservationPeriod> observations;

    public FakeEntityManager() {
        this.devices = new HashSet<Device>();
        for (int i = 1; i <= 30; i++) {
            Device d = new MeasureDevice(i + 1);
            this.devices.add(d);
        }

        this.doctors = new HashSet<Doctor>();
        for (int i = 1; i <= 30; i++) {
            Doctor doc = new MonitorDoctor(i, "password" + i, "Hans" + i, "Maulwurf" + i);
            this.doctors.add(doc);
        }

        this.patients = new HashSet<Patient>();
        for (int i = 1; i <= 30; i++) {
            Patient p = this.createPatient("Maulwurf" + i, "Hans");
            this.patients.add(p);
        }

        this.observations = new HashSet<ObservationPeriod>();
        for (int i = 1; i <= 30; i++) {
            GregorianCalendar date = new GregorianCalendar(2010, Calendar.JUNE, (int) ((Math.random() * 29) + 1));
            Date from = date.getTime();
            date = new GregorianCalendar(2010, Calendar.JULY, (int) ((Math.random() * 29) + 1));
            Date to = date.getTime();
            try {
                this.observations.add(new MonitorObservationPeriod(i + 1, this.getDoctor(5), this.getDevice(5), this.getPatient(5), from, to, i));
            } catch (Exception e) {
            }
            //this.patients.add(op);
        }


    }

    public Doctor getDoctor(Integer doctorId) throws ObjectNotFoundException {
        for (Doctor doctor : this.doctors) {
            if (doctor.getDoctorId().equals(doctorId)) {
                return doctor;
            }
        }
        throw new ObjectNotFoundException("Doctor with id not found: " + doctorId);
    }

    public Patient getPatient(Integer patientId) throws ObjectNotFoundException {
        for (Patient patient : this.patients) {
            if (patient.getPatientId().equals(patientId)) {
                return patient;
            }
        }
        throw new ObjectNotFoundException("Patient with id not found: " + patientId);
    }

    public Device getDevice(Integer deviceId) throws ObjectNotFoundException {
        for (Device device : this.devices) {
            if (device.getDeviceId().equals(deviceId)) {
                return device;
            }
        }
        throw new ObjectNotFoundException("Device with id not found: " + deviceId);
    }

    public Patient createPatient(String patientName, String patientPrename) {
        Patient p = new MonitorPatient(this.patients.size() + 1, patientPrename, patientName);
        this.patients.add(p);
        return p;

    }

    public ObservationPeriod createObservationPeriod(Doctor doctor, Patient patient, Device device,
                                                     Date from, Date to, Integer frequency)
                                                     throws ObjectNotFoundException {
           ObservationPeriod op = new MonitorObservationPeriod(this.observations.size()+1,doctor, device,patient,from, to, frequency);
           this.observations.add(op);
           return op;
    }

    public ObservationPeriod getObservationPeriod(Integer observationPeriodId) throws ObjectNotFoundException {
        for (ObservationPeriod period : this.observations) {
            if (period.getPeriodId().equals(observationPeriodId)) {
                return period;
            }
        }
        throw new ObjectNotFoundException("Observation period with id not found: " + observationPeriodId);
    }

    public Set<ObservationPeriod> getObservationPeriodsOfPatient(Integer patientId) throws ObjectNotFoundException {
        Set<ObservationPeriod> s = new HashSet<ObservationPeriod>();
        for (ObservationPeriod op : this.observations) {
            if (((MonitorObservationPeriod) op).getPatient().getPatientId().equals(patientId)) {
                s.add(op);
            }
        }
        return s;
    }

    public Set<Doctor> getDoctors() {
        return this.doctors;
    }

    public Set<Patient> getPatient() {
        return this.patients;
    }

    public Set<ObservationPeriod> getObservationPeriods() {
        return this.observations;
    }
}
