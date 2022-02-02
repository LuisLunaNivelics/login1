package com.nivelics.automation.commons.runner;

import com.nivelics.automation.commons.pages.Login;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Login_Test {

    @Test
    public void login() {
        var login = new Login();
        assertTrue(login.loginSucessful());
    }
}
