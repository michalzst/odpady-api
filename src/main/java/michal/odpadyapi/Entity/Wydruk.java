package michal.odpadyapi.Entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Wydruk {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String data;

    @OneToOne
    private Pojazd nrRejestracyjnyPojazdu;
    @OneToOne
    private KodyOdpadow kodOpadu;
    private int masa;
    @Enumerated(EnumType.STRING)
    private StaraNowaWaga staraNowaWaga;
    @OneToOne
    private KontrahentNaWydruku kontrahentNaWydruku;
    @OneToOne
    private Posiadacz posiadacz;
    private String dodatkoweInformacje;

    public Wydruk(){}

    public Wydruk(String data, Pojazd nrRejestracyjnyPojazdu, KodyOdpadow kodOpadu, int masa, StaraNowaWaga staraNowaWaga, KontrahentNaWydruku kontrahentNaWydruku, Posiadacz posiadacz, String dodatkoweInformacje) {
        this.data = data;
        this.nrRejestracyjnyPojazdu = nrRejestracyjnyPojazdu;
        this.kodOpadu = kodOpadu;
        this.masa = masa;
        this.staraNowaWaga = staraNowaWaga;
        this.kontrahentNaWydruku = kontrahentNaWydruku;
        this.posiadacz = posiadacz;
        this.dodatkoweInformacje = dodatkoweInformacje;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Pojazd getNrRejestracyjnyPojazdu() {
        return nrRejestracyjnyPojazdu;
    }

    public void setNrRejestracyjnyPojazdu(Pojazd nrRejestracyjnyPojazdu) {
        this.nrRejestracyjnyPojazdu = nrRejestracyjnyPojazdu;
    }

    public KodyOdpadow getKodOpadu() {
        return kodOpadu;
    }

    public void setKodOpadu(KodyOdpadow kodOpadu) {
        this.kodOpadu = kodOpadu;
    }

    public int getMasa() {
        return masa;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }

    public StaraNowaWaga getStaraNowaWaga() {
        return staraNowaWaga;
    }

    public void setStaraNowaWaga(StaraNowaWaga staraNowaWaga) {
        this.staraNowaWaga = staraNowaWaga;
    }

    public KontrahentNaWydruku getKontrahentNaWydruku() {
        return kontrahentNaWydruku;
    }

    public void setKontrahentNaWydruku(KontrahentNaWydruku kontrahentNaWydruku) {
        this.kontrahentNaWydruku = kontrahentNaWydruku;
    }

    public Posiadacz getPosiadacz() {
        return posiadacz;
    }

    public void setPosiadacz(Posiadacz posiadacz) {
        this.posiadacz = posiadacz;
    }

    public String getDodatkoweInformacje() {
        return dodatkoweInformacje;
    }

    public void setDodatkoweInformacje(String dodatkoweInformacje) {
        this.dodatkoweInformacje = dodatkoweInformacje;
    }
}
