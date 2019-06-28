package michal.odpadyapi.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
public class KodyOdpadow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String kodOdpadu;
    private String nazwaOdpadu;
    private boolean aktywny;

//    @ManyToOne
//    @JoinColumn(name = "kodyOdpadow", nullable = false)
//    @OnDelete(action = OnDeleteAction.CASCADE)
//    @JsonIgnore
//    private  Posiadacz posiadacz;

//    public Posiadacz getPosiadacz() {
//        return posiadacz;
//    }
//
//    public void setPosiadacz(Posiadacz posiadacz) {
//        this.posiadacz = posiadacz;
//    }


    public KodyOdpadow() {
    }

    public KodyOdpadow(String kodOdpadu, String nazwaOdpadu, boolean aktywny) {
        this.kodOdpadu = kodOdpadu;
        this.nazwaOdpadu = nazwaOdpadu;
        this.aktywny = aktywny;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKodOdpadu() {
        return kodOdpadu;
    }

    public void setKodOdpadu(String kodOdpadu) {
        this.kodOdpadu = kodOdpadu;
    }

    public String getNazwaOdpadu() {
        return nazwaOdpadu;
    }

    public void setNazwaOdpadu(String nazwaOdpadu) {
        this.nazwaOdpadu = nazwaOdpadu;
    }

    public boolean isAktywny() {
        return aktywny;
    }

    public void setAktywny(boolean aktywny) {
        this.aktywny = aktywny;
    }
}
