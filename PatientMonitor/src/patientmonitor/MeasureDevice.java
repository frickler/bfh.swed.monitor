/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patientmonitor;

import java.util.Date;
import patient.exceptions.InvalidDateRangeException;
import patient.exceptions.NoPatientAssignedException;
import patientmonitor.definition.Device;
import patientmonitor.definition.Patient;

/**
 *
 * @author seed
 */
public class MeasureDevice implements Device{

    public MeasureDevice() {
    }

    public void initialize(Date begin, Date end, Integer frequency) throws InvalidDateRangeException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setPatient(Patient patient) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Integer performMeasure() throws NoPatientAssignedException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
