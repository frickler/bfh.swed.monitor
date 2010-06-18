/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patientmonitor;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import patientmonitor.definition.LoginController;
import static org.junit.Assert.*;

/**
 *
 * @author krigu
 */
public class LoginTest {

    /**
     * Tests the Login Usecase (happy path)
     *
     * Should return a session controller
     */
    @Test
    public void loginTest(){

        LoginController login = new MonitorLoginController();

    }

}