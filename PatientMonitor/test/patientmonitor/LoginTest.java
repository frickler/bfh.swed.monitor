/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patientmonitor;

import org.junit.Test;
import patient.exceptions.LoginException;
import patientmonitor.definition.LoginController;
import patientmonitor.definition.SessionController;
import static org.junit.Assert.*;

/**
 *
 * @author krigu
 */
public class LoginTest {

    /**
     * Tests the Login Usecase (happy path)      
     */
    @Test
    public void loginTest() throws LoginException{

        LoginController lc = new MonitorLoginController();
        SessionController s = lc.login(2, "password2");

        assertNotNull(lc);

    }

     /**
     * Tests the Login Usecase with a false password
     *
     * Should return a session controller
     */
    @Test(expected=LoginException.class)
    public void loginInvalidPasswordTest() throws LoginException{

        LoginController lc = new MonitorLoginController();
        SessionController s = lc.login(2, "falsePassword");
        

    }

     /**
     * Tests the Login Usecase with a inexistend doctorId
     *
     * Should return a session controller
     */
    @Test(expected=LoginException.class)
    public void loginInvalidDoctorTest() throws LoginException{

        LoginController lc = new MonitorLoginController();
        SessionController s = lc.login(2221, "falsePassword");

    }

}