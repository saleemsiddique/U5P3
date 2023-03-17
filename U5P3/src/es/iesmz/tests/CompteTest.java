package es.iesmz.tests;

import static org.junit.jupiter.api.Assertions.*;

class CompteTest {

    @org.junit.jupiter.api.Test
    void compruebaIBAN1() {
        Compte cuenta = new Compte();
        boolean resultadoEsperado = cuenta.compruebaIBAN("ES6621000418401234567891");
        boolean resultadoReal = true;
        assertEquals(resultadoEsperado, resultadoReal);
    }
    @org.junit.jupiter.api.Test
    void compruebaIBAN2() {
        Compte cuenta = new Compte();
        boolean resultadoEsperado = cuenta.compruebaIBAN("ES6000491500051234567892");
        boolean resultadoReal = true;
        assertEquals(resultadoEsperado, resultadoReal);
    }
    @org.junit.jupiter.api.Test
    void compruebaIBAN3() {
        Compte cuenta = new Compte();
        boolean resultadoEsperado = cuenta.compruebaIBAN("ES9420805801101234567891");
        boolean resultadoReal = true;
        assertEquals(resultadoEsperado, resultadoReal);
    }
    @org.junit.jupiter.api.Test
    void compruebaIBAN4() {
        Compte cuenta = new Compte();
        boolean resultadoEsperado = cuenta.compruebaIBAN("ES7600246912501234567891");
        boolean resultadoReal = false;
        assertEquals(resultadoEsperado, resultadoReal);
    }
    @org.junit.jupiter.api.Test
    void compruebaIBAN5() {
        Compte cuenta = new Compte();
        boolean resultadoEsperado = cuenta.compruebaIBAN("ES4721000418401234567891");
        boolean resultadoReal = false;
        assertEquals(resultadoEsperado, resultadoReal);
    }    @org.junit.jupiter.api.Test
    void compruebaIBAN6() {
        Compte cuenta = new Compte();
        boolean resultadoEsperado = cuenta.compruebaIBAN("ES8200491500051234567892");
        boolean resultadoReal = false;
        assertEquals(resultadoEsperado, resultadoReal);
    }


    @org.junit.jupiter.api.Test
    void generaIBAN1() {
        Compte cuenta = new Compte();
        String resultadoEsperado = cuenta.generaIBAN("0030", "2053", "09", "1234567895");
        String resultadoReal = "ES7100302053091234567895";
        assertEquals(resultadoEsperado, resultadoReal);
    }
    @org.junit.jupiter.api.Test
    void generaIBAN2() {
        Compte cuenta = new Compte();
        String resultadoEsperado = cuenta.generaIBAN("0049","2352","08","2414205416");
        String resultadoReal = "ES1000492352082414205416";
        assertEquals(resultadoEsperado, resultadoReal);
    }
    @org.junit.jupiter.api.Test
    void generaIBAN3() {
        Compte cuenta = new Compte();
        String resultadoEsperado = cuenta.generaIBAN("2085","2066","62","3456789011");
        String resultadoReal = "ES1720852066623456789011";
        assertEquals(resultadoEsperado, resultadoReal);
    }
    @org.junit.jupiter.api.Test
    void generaIBAN4() {
        Compte cuenta = new Compte();
        String resultadoEsperado = cuenta.generaIBAN("2085","2066","62","3456AE9011");
        String resultadoReal = null;
        assertEquals(resultadoEsperado, resultadoReal);
    }
    @org.junit.jupiter.api.Test
    void generaIBAN5() {
        Compte cuenta = new Compte();
        String resultadoEsperado = cuenta.generaIBAN("208","2066","62","3456789011");
        String resultadoReal = null;
        assertEquals(resultadoEsperado, resultadoReal);
    }
    @org.junit.jupiter.api.Test
    void generaIBAN6() {
        Compte cuenta = new Compte();
        String resultadoEsperado = cuenta.generaIBAN("2080","20A6","62","3456789011");
        String resultadoReal = null;
        assertEquals(resultadoEsperado, resultadoReal);
    }
    @org.junit.jupiter.api.Test
    void generaIBAN7() {
        Compte cuenta = new Compte();
        String resultadoEsperado = cuenta.generaIBAN("2080","2086","6","3456789011");
        String resultadoReal = null;
        assertEquals(resultadoEsperado, resultadoReal);
    }
    @org.junit.jupiter.api.Test
    void generaIBAN8() {
        Compte cuenta = new Compte();
        String resultadoEsperado = cuenta.generaIBAN("2080","2086","63","345678911");
        String resultadoReal = null;
        assertEquals(resultadoEsperado, resultadoReal);
    }
}