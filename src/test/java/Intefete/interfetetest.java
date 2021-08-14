package Intefete;

import org.junit.Test;

public class interfetetest {


    @Test
    public void metodaTest(){

        PersoanaStudent Student = new PersoanaStudent("Dorca", "Alexandru", 26, "Restantier");

        Student.invata();
        Student.detaliistudent();

        PersoanaAngajat Angajat = new PersoanaAngajat("Dorca" ,"Alexandru", 26 , "Patron");
        Angajat.munceste();
        Angajat.detaliiangajat();


        Persoanaangajatsistudent Studenangajat = new Persoanaangajatsistudent("Dumitru","apopei",45,"Student si angajat");
        Studenangajat.invata();
       Studenangajat.detaliistudent();
        Studenangajat.detaliiangajat();
        Studenangajat.munceste();
    }




}
