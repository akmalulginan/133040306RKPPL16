/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ifunpas.rkkpl.rkkpl16;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
//import org.junit.runner.JUnitCore;
//import org.junit.runner.Result;
//import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;
/**
 *
 * @author SB-604-21
 */
public class MahasiswaMain {

    static Mahasiswa mhs;

    @Before
    public void mulaiTest() {
        mhs = new Mahasiswa();
        System.out.println("mulai test");
    }

    @Test
    public void setNrpTest(String nrp) {
        mhs.setNrp(nrp);
    }

    @Test
    public void setNamaTest(String nama) {
        mhs.setNama(nama);
        assertNotNull("seharusnya tidak null", mhs.getNrp());
    }
    
    @After
    public void selesaiTest(){
        System.out.println("selesai test");
    }

    
    public static void main(String[] args) {
//        Result result = JUnitCore.runClasses(JUnitAnnotation.class);
//        for (Failure failure : result.getFailures()) {
//            System.out.println(failure.toString());
//        }
//        System.out.println(result.wasSuccessful());
        assertNotNull("seharusnya tidak null", mhs.getNrp());

        
    }
}
