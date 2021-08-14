package Intefete;

public class PersoanaAngajat extends persoana implements angajat{
    public PersoanaAngajat(String nume, String prenume, int varsta, String job) {
        super(nume, prenume, varsta, job);
    }

    @Override
    public void munceste() {
        System.out.println("Persoana cu numele"+ getNume() + " "+ getPrenume()+ ", munceste "+getJob());

    }

    @Override
    public void detaliiangajat() {
  System.out.println("Detalii anagajat:"+super.toString());
    }
}
