package Intefete;

public class Persoanaangajatsistudent extends persoana implements Student , angajat  {

    public Persoanaangajatsistudent(String nume, String prenume, int varsta, String job) {
        super(nume, prenume, varsta, job);
    }

    @Override
    public void invata() {
        System.out.println("Persoana student, angajat cu " +getNume() + " si" + getPrenume() + " invata si munceste");
    }

    @Override
    public void detaliistudent() {

        System.out.println(super.toString());

    }

    @Override
    public void munceste() {
        System.out.println("Persoana student, angajat cu numele"+ getNume() + " "+ getPrenume()+ " munceste "+getJob()+ " si invata");

    }

    @Override
    public void detaliiangajat() {
        System.out.println(super.toString());
    }
}

