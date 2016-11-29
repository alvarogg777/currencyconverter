package com.appisode.currencyconverter;

import org.junit.Before;
import org.junit.Test;

import Data.Currency_Names;

import static org.junit.Assert.assertEquals;

/**
 * Created by alvaro on 11/29/16.
 */

public class CurrencyNamesTest {

    private String short_name,abbreviation;
    public Currency_Names curr1= new Currency_Names();
    public Currency_Names curr2=null;
    @Before
    public void SetUp(){
        this.abbreviation="US";
        this.short_name="United States";
    }

    @Test
    public void testGettersandSetters(){
        assertEquals(null,curr1.getShort_name());
        assertEquals(null,curr1.getAbrivation());
        curr1.setAbrivation(abbreviation);
        curr1.setShort_name(short_name);
        assertEquals(abbreviation,curr1.getAbrivation());
        assertEquals(short_name,curr1.getShort_name());
        curr2=new Currency_Names(short_name,abbreviation);
        assertEquals(curr1.getAbrivation(),curr2.getAbrivation());
        assertEquals(curr2.getShort_name(),curr1.getShort_name());
    }
}
