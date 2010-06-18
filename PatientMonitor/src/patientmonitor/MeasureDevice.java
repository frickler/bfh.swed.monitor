/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmonitor;

import patient.exceptions.NoPatientAssignedException;
import patientmonitor.definition.Device;
import patientmonitor.definition.ObservationPeriod;
import patientmonitor.definition.Patient;

/**
 *
 * @author seed
 */
public class MeasureDevice implements Device {

    private Integer deviceId;
    private Patient patient;
    private ObservationPeriod period;

    public MeasureDevice(Integer deviceId) throws IllegalArgumentException {
        if (deviceId == null) {
            throw new IllegalArgumentException();
        }
        this.deviceId = deviceId;
    }

    public void initialize(ObservationPeriod period) throws IllegalArgumentException {
        if (period == null) {
            throw new IllegalArgumentException();
        }
        this.period = period;
    }

    public Float performMeasure() throws NoPatientAssignedException {
        if (patient == null) {
            throw new NoPatientAssignedException();
        }
        return 37.3f;
    }

    public Integer getDeviceId() {
        return this.deviceId;
    }

    public void setPatient(Patient p) {
        this.patient = p;
    }

    public Patient getPatient() {
        return this.patient;
    }
}
