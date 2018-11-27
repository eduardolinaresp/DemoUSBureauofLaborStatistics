/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edward.serviceTest;

import junit.framework.Assert;

import org.junit.Test;

/**
 *
 * @author ext_ealinares
 */
public class ServiceTest {

    public ServiceTest() {
    }

    @Test
    public void serviceTest() throws Exception {
        //Name of the properties file that needs encryption
        String propertyFileName = "properties/application.properties";
        //Key portion of the properties the left hand side
        String userPwdKey = "database.user.password";
        //Key in the properties file that will tell us if the password is already encrypted or not
        String isPwdEcnryptedKey = "is.database.user.password.encrypted";
        //Invoke the constrsuctor
        
        //Retrieve the decrypted password
        //Assert.assertTrue("Decrypted password should be \"mydbpassword\"", result.equalsIgnoreCase("mydbpassword"));
    }

}
