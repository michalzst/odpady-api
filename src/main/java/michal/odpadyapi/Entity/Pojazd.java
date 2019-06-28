package michal.odpadyapi.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pojazd {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPojazdu;
    private String nrRejestracyjny;
    private boolean aktywny;

    public Pojazd(){}

    public Pojazd(String nrRejestracyjny, boolean aktywny) {
        this.nrRejestracyjny = nrRejestracyjny;
        this.aktywny = aktywny;
    }

    public Long getIdPojazdu() {
        return idPojazdu;
    }

    public void setIdPojazdu(Long idPojazdu) {
        this.idPojazdu = idPojazdu;
    }

    public String getNrRejestracyjny() {
        return nrRejestracyjny;
    }

    public void setNrRejestracyjny(String nrRejestracyjny) {
        this.nrRejestracyjny = nrRejestracyjny;
    }

    public boolean isAktywny() {
        return aktywny;
    }

    public void setAktywny(boolean aktywny) {
        this.aktywny = aktywny;
    }
}
