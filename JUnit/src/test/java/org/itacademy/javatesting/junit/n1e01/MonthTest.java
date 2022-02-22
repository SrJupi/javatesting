package org.itacademy.javatesting.junit.n1e01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MonthTest{

    @Test
    public void listHave12Months (){
        Month month = new Month();
        assertEquals(12, month.getListSize());
    }

    @Test
    public void listIsNull (){
        Month month = new Month();
        assertNotNull(month.getList());
    }

    @Test
    public void augustIs8thMonth (){
        Month month = new Month();
        assertEquals(7, month.getIndex("August"));
    }

    @Test
    public void _8thMonthIsAugust () {
        Month month = new Month();
        assertEquals("August", month.getMonth(7));
    }



}