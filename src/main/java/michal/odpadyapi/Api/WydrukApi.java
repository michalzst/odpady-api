package michal.odpadyapi.Api;

import michal.odpadyapi.Entity.*;
import michal.odpadyapi.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping("/wydruk-api")
public class WydrukApi {
    private String data;

    @EventListener(ApplicationReadyEvent.class)
    public void init() {
        Pojazd pojazdZst39275 = new Pojazd("ZST 39275", true);
        Pojazd pojazdZst44646 = new Pojazd("ZST 44646", true);
        Pojazd pojazdZstK877 = new Pojazd("ZST K877", true);
        pojazdRepo.save(pojazdZst39275);
        pojazdRepo.save(pojazdZst44646);
        pojazdRepo.save(pojazdZstK877);

        KontrahentNaWydruku kontrahentZom = new KontrahentNaWydruku("ZOM", true);
        KontrahentNaWydruku kontrahentZuk = new KontrahentNaWydruku("ZUK", true);
        KontrahentNaWydruku kontrahentZupic = new KontrahentNaWydruku("ZUPIC", true);
        kontrahentRepo.save(kontrahentZom);
        kontrahentRepo.save(kontrahentZuk);
        kontrahentRepo.save(kontrahentZupic);

        Posiadacz posiadacz1 = new Posiadacz();
        posiadacz1.setNazwa("Brand");
        posiadaczRepo.save(posiadacz1);

        Posiadacz posiadacz2 = new Posiadacz();
        posiadacz2.setNazwa("CCC");
        posiadaczRepo.save(posiadacz2);
        Posiadacz posiadacz3 = new Posiadacz();
        posiadacz2.setNazwa("SUEZ");
        posiadaczRepo.save(posiadacz3);

        KodyOdpadow kod170101 = new KodyOdpadow("170101", "Gruz betonowy", true);
        kodyOdpadowRepo.save(kod170101);
        KodyOdpadow kod170102 = new KodyOdpadow("170102", "Gruz ceglany", true);
        kodyOdpadowRepo.save(kod170102);
        KodyOdpadow kod170107 = new KodyOdpadow("170107", "Gruz zmieszany", true);
        kodyOdpadowRepo.save(kod170107);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        this.data = simpleDateFormat.format(c.getTime());
        Wydruk wydruk1 = new Wydruk(data, pojazdZst39275, kod170101, 1555, StaraNowaWaga.S, kontrahentZom, posiadacz1,"");
        Wydruk wydruk2 = new Wydruk(data, pojazdZst39275, kod170102, 5200, StaraNowaWaga.S, kontrahentZom,posiadacz2, "");
        Wydruk wydruk3 = new Wydruk(data, pojazdZst44646, kod170101, 3420, StaraNowaWaga.S, kontrahentZuk, posiadacz1,"");
        Wydruk wydruk4 = new Wydruk(data, pojazdZst44646, kod170102, 4550, StaraNowaWaga.S, kontrahentZuk,posiadacz1, "");
        Wydruk wydruk5 = new Wydruk(data, pojazdZstK877, kod170102, 8900, StaraNowaWaga.S, kontrahentZupic, posiadacz3,"");
        Wydruk wydruk6 = new Wydruk(data, pojazdZstK877, kod170107, 7000, StaraNowaWaga.S, kontrahentZupic, posiadacz1,"");
        wydrukRepo.save(wydruk1);
        wydrukRepo.save(wydruk2);
        wydrukRepo.save(wydruk3);
        wydrukRepo.save(wydruk4);
        wydrukRepo.save(wydruk5);
        wydrukRepo.save(wydruk6);
    }

    private KodyOdpadowRepo kodyOdpadowRepo;
    private KontrahentRepo kontrahentRepo;
    private PojazdRepo pojazdRepo;
    private PosiadaczRepo posiadaczRepo;
    private WydrukRepo wydrukRepo;

    @Autowired
    public WydrukApi(KodyOdpadowRepo kodyOdpadowRepo, KontrahentRepo kontrahentRepo, PojazdRepo pojazdRepo, PosiadaczRepo posiadaczRepo, WydrukRepo wydrukRepo) {
        this.kodyOdpadowRepo = kodyOdpadowRepo;
        this.kontrahentRepo = kontrahentRepo;
        this.pojazdRepo = pojazdRepo;
        this.posiadaczRepo = posiadaczRepo;
        this.wydrukRepo = wydrukRepo;
    }

    @GetMapping
    public Iterable<Wydruk> getWydruk() {
        return wydrukRepo.findAll();
    }

    @PostMapping
    public void dodaj(@RequestBody Wydruk wydruk) {
        wydrukRepo.save(wydruk);
    }

    @PutMapping
    public void modyfikuj(@RequestBody Wydruk wydruk) {
        Optional<Wydruk> byId = wydrukRepo.findById(wydruk.getId());
        if (byId.isPresent()) {
            wydrukRepo.save(wydruk);
        }
    }

    @DeleteMapping
    public void usun(@RequestParam Long id) {
        wydrukRepo.deleteById(id);
    }
}
