/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patientmonitor;

import java.util.Date;

/**
 *
 * @author krigu
 */
public class Measure {

    private Integer measureId;
    private Float temperature;
    private Date date;

    public Date getDate() {
        return date;
    }

    public Float getTemperature() {
        return temperature;
    }

    public Integer getMeasureId() {
        return measureId;
    }

    public Measure(Integer measureId, Float temperature, Date date) {
        this.measureId = measureId;
        this.temperature = temperature;
        this.date = date;
    }

    /**
     * For debugging purposes
     * @return
     */
    @Override
    public String toString() {
        return "Id: " + measureId.toString() + " From: " + getDate().toString() + "Temperature" + temperature.toString();
    }



}
