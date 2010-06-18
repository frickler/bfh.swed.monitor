/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patientmonitor;

import org.junit.Test;
import patientmonitor.definition.SessionController;

/**
 *
 * @author krigu
 */
public class LogoutTest {

    /**
     * "Dummy placeholder" test
     */
   @Test
   public void logoutTest(){

       SessionController c = new MonitorSessionController(new MonitorDoctor(1, "test", "test", "test"));
       c.logout();

   }

}