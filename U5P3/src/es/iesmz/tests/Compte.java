package es.iesmz.tests;

import java.math.BigInteger;

public class Compte {
    private String IBAN;
    private String titularCuenta;
    private int ultimasCuatro = 142800;

    public boolean compruebaIBAN(String iban) {
        iban = iban.replace(" ", "");
        if (!iban.matches("^[A-Z]{2}[0-9]{22}")) {
            return false;
        } else {
            String digitosDeControlS = iban.substring(2, 4);
            System.out.println(digitosDeControlS);
            int digitosDeControlReal = Integer.parseInt(digitosDeControlS);
            String ibannum = iban + ultimasCuatro;
            ibannum = ibannum.substring(4);
            System.out.println(ibannum);
            BigInteger ibanNumber = new BigInteger(String.valueOf(ibannum));
            BigInteger res = ibanNumber.mod(new BigInteger("97"));
            BigInteger num98 = new BigInteger("98");
            BigInteger digitosDeControlres = num98.subtract(res);
            if (digitosDeControlres.compareTo(new BigInteger(String.valueOf(digitosDeControlReal))) == 0) {
                this.IBAN = iban;
                return true;
            } else return false;
        }
    }

    public String generaIBAN(String entidad, String oficina, String dc, String compte) {
        String IBAN = "ES";
        String compIBAN = entidad + oficina + dc + compte;
        if (compIBAN.matches("[0-9]{20}")) {
            compIBAN += ultimasCuatro;
            BigInteger comprobIBAN = new BigInteger(compIBAN);
            BigInteger res = comprobIBAN.mod(new BigInteger("97"));
            BigInteger num98 = new BigInteger("98");
            BigInteger digitosDeControl = num98.subtract(res);
            IBAN += digitosDeControl + entidad + oficina + dc + compte;
            return IBAN;
        } else return null;
    }
}
