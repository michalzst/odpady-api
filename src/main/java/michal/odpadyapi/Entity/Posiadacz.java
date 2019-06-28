package michal.odpadyapi.Entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

//Posiadacz to firma na ktora bedzie wystawiana karta przekazania odpadu
@Entity
public class Posiadacz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nazwa;
    private String ulicaNrDomu;
    private String kodPocztowy;
    private String miasto;
    private String nrBdo;
    private String nip;

//    @OneToMany(cascade = CascadeType.ALL,
//            fetch = FetchType.LAZY,
//            mappedBy = "posiadacz")
//    private Set<KodyOdpadow> kodyOdpadow=new HashSet<>();
//
//    public Set<KodyOdpadow> getKodyOdpadow() {
//        return kodyOdpadow;
//    }
//
//    public void setKodyOdpadow(Set<KodyOdpadow> kodyOdpadow) {
//        this.kodyOdpadow = kodyOdpadow;
//    }

    public Posiadacz(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getUlicaNrDomu() {
        return ulicaNrDomu;
    }

    public void setUlicaNrDomu(String ulicaNrDomu) {
        this.ulicaNrDomu = ulicaNrDomu;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    public String getNrBdo() {
        return nrBdo;
    }

    public void setNrBdo(String nrBdo) {
        this.nrBdo = nrBdo;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }


}
