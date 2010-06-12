/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patientmonitor;

import java.util.HashSet;
import java.util.List;
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
public class FakeEntityManager implements EntityManager{

    Set<Patient> patients;
    Set<Doctor> doctors;
    Set<Device> devices;

    public FakeEntityManager() {
        this.devices = new HashSet<Device>();
        for (int i=1; i<30;i++) {
           Device d = new MeasureDevice(i);
           this.devices.add(d);
        }

        this.doctors = new HashSet<Doctor>();
        for (int i=1; i<30;i++) {
           Doctor doc = new MonitorDoctor(i,"password" + i,"Hans" + i,"Maulwurf" + i);
           this.doctors.add(doc);
        }

        this.patients = new HashSet<Patient>();
        for (int i=1; i<30;i++) {
           Patient p = new MonitorPatient(i,"Hans","Maulwurf" + i);
           this.patients.add(p);
        }

    }

    public Doctor getDoctor(Integer doctorId) throws ObjectNotFoundException {
        for (Doctor doctor : this.doctors) {
            if (doctor.getDoctorId().equals(doctorId))
                return doctor;
        }
        throw new ObjectNotFoundException("Doctor with id not found: " + doctorId);
    }

    public Patient getPatient(Integer patientId) throws ObjectNotFoundException {
        for (Patient patient : this.patients) {
            if (patient.getPatientId().equals(patientId))
                return patient;
        }
        throw new ObjectNotFoundException("Patient with id not found: " + patientId);
    }

    public Device getDevice(Integer deviceId) throws ObjectNotFoundException{
        for (Device device : this.devices) {
            if (device.getDeviceId().equals(deviceId))
                return device;
        }
        throw new ObjectNotFoundException("Device with id not found: " + deviceId);
    }

    public Patient createPatient(String patientName, String patientPrename) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ObservationPeriod getObservationPeriod(Integer observationPeriodId) throws ObjectNotFoundException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<ObservationPeriod> getObservationPeriodsOfPatient(Integer patientId) throws ObjectNotFoundException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void save(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
