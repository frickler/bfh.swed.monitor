/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patientmonitor.definition;

import java.util.Date;
import java.util.List;
import patient.exceptions.InvalidDateRangeException;

/**
 *
 * @author krigu
 */
public interface ObservationPeriod {

    /**
     * Returns a list of all measures within the given Period
     * @param from Startdate
     * @param to Enddate
     * @return List of measures
     * @throws InvalidDateRangeException if the from > to or one of them is null
     */
    public List getMeasures(Date from, Date to) throws InvalidDateRangeException;

}
