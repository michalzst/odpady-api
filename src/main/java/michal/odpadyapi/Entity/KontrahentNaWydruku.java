package michal.odpadyapi.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class KontrahentNaWydruku {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nazwaKontrahenta;
    private boolean aktywny;

    public KontrahentNaWydruku() {
    }

    public KontrahentNaWydruku(String nazwaKontrahenta, boolean aktywny) {
        this.nazwaKontrahenta = nazwaKontrahenta;
        this.aktywny = aktywny;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNazwaKontrahenta() {
        return nazwaKontrahenta;
    }

    public void setNazwaKontrahenta(String nazwaKontrahenta) {
        this.nazwaKontrahenta = nazwaKontrahenta;
    }

    public boolean isAktywny() {
        return aktywny;
    }

    public void setAktywny(boolean aktywny) {
        this.aktywny = aktywny;
    }
}
