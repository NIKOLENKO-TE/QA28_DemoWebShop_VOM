package com.ait.phonebooks.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase{

    @Test
    public void isHomeComponentPresentTest() {
//        System.out.println("Home Component is " + isHomeComponentPresent());
        Assert.assertTrue(isHomeComponentPresent());
    }

}
