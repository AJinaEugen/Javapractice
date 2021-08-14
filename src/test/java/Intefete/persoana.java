package Intefete;

public class persoana {



    private String nume;
    private String prenume;
    private int varsta ;
    private String job;


    public persoana (String nume, String prenume, int varsta, String job){

        this.nume=nume;
        this.prenume=prenume;
        this.varsta=varsta;
        this.job=job;



    }

    @Override
    public String toString() {
        return "persoana{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                ", job='" + job + '\'' +
                '}';
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getJob() {
        return job;
    }
}
