package Intefete;

// o clasa implemeteaza o interfata
// mostenire = extends ;  (o clasa se mosteneste)
// interfata = implements  ( o interfata se implementeaza )
// o clasa poate implementa o multime de interfete;
// cand implementezi o interfata trebuie sa oferi implementari pentru toate metodele interfetei;


public class PersoanaStudent extends persoana implements Student {

    public PersoanaStudent(String nume, String prenume, int varsta, String job) {
        super(nume, prenume, varsta, job);
    }

    @Override
    public void invata() {
        System.out.println("Studentul cu numele  " +getNume() + " " + getPrenume() + " invata.");
    }

    @Override
    public void detaliistudent() {

        System.out.println(super.toString());

    }




}
