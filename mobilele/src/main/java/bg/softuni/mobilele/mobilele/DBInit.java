package bg.softuni.mobilele.mobilele;

import bg.softuni.mobilele.mobilele.model.entities.Brand;
import bg.softuni.mobilele.mobilele.model.entities.Model;
import bg.softuni.mobilele.mobilele.model.entities.Offer;
import bg.softuni.mobilele.mobilele.model.entities.enums.Category;
import bg.softuni.mobilele.mobilele.model.entities.enums.Engine;
import bg.softuni.mobilele.mobilele.model.entities.enums.Transmission;
import bg.softuni.mobilele.mobilele.repository.BrandRepository;
import bg.softuni.mobilele.mobilele.repository.ModelRepository;
import bg.softuni.mobilele.mobilele.repository.OfferRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.Instant;
import java.util.List;

@Component
public class DBInit implements CommandLineRunner {

    private final BrandRepository brandRepository;
    private final ModelRepository modelRepository;
    private final OfferRepository offerRepository;

    public DBInit(BrandRepository brandRepository, ModelRepository modelRepository, OfferRepository offerRepository) {
        this.brandRepository = brandRepository;
        this.modelRepository = modelRepository;
        this.offerRepository = offerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Brand fordBrand = new Brand();
        fordBrand.setName("Ford");
        fordBrand.setCreated(Instant.now());
        fordBrand.setUpdated(Instant.now());


        Brand hondaBrand = new Brand();
        hondaBrand.setName("Honda");
        hondaBrand.setCreated(Instant.now());
        hondaBrand.setUpdated(Instant.now());

        brandRepository.saveAll(List.of(fordBrand, hondaBrand));

        Model fiestaModel = initFiesta(fordBrand);
        initEscort(fordBrand);
        initialNC750S(hondaBrand);
        createFiestaOffer(fiestaModel);
    }
    private void createFiestaOffer(Model model){
        Offer fiestaOffer= new Offer();
        fiestaOffer.setEngine(Engine.GASOLINE);
        fiestaOffer.setImageUrl("https://upload.wikimedia.org/wikipedia/" +
                "commons/thumb/7/7d/2017_Ford_Fiesta_Zetec_Turbo_1.0_Front.jpg/" +
                "1280px-2017_Ford_Fiesta_Zetec_Turbo_1.0_Front.jpg");
        fiestaOffer.setMileAge(80000);
        fiestaOffer.setPrice(BigDecimal.valueOf(10000));
        fiestaOffer.setYear(2016);
        fiestaOffer.setDescription("Уникати с криви врати!");
        fiestaOffer.setTransmission(Transmission.MANUAL);
        fiestaOffer.setModel(model);
        fiestaOffer.setCreated(Instant.now());
        fiestaOffer.setUpdated(Instant.now());

        this.offerRepository.save(fiestaOffer);
    }

    private Model initialNC750S(Brand hondaBrand) {
        Model hondaNC750S = new Model();
        hondaNC750S.setName("NC750S");
        hondaNC750S.setCategory(Category.MOTORCYCLE);
        hondaNC750S.setImgUrl("https://s3-eu-west-1.amazonaws.com/crash.net/visordown.com/styles/v2_large/s3/69286.jpg?itok=VyQYwS5w");
        hondaNC750S.setStartYear(2016);
        hondaNC750S.setEndYear(2026);
        hondaNC750S.setBrand(hondaBrand);
        hondaNC750S.setCreated(Instant.now());
        hondaNC750S.setUpdated(Instant.now());

        return modelRepository.save(hondaNC750S);
    }

    private Model initEscort(Brand fordBrand) {
        Model escort =new Model();
        escort.setName("Escort");
        escort.setCategory(Category.CAR);
        escort.setImgUrl("https://www.carscoops.com/wp-content/uploads/2018/08/8c1523e1-1972-ford-escort-rs1600-00.jpg");
        escort.setStartYear(1968);
        escort.setEndYear(2001);
        escort.setBrand(fordBrand);
        escort.setCreated(Instant.now());
        escort.setUpdated(Instant.now());

        return modelRepository.save(escort);
    }

    private Model initFiesta(Brand fordBrand) {
        Model fiesta = new Model();

        fiesta.setName("Fiesta");
        fiesta.setCategory(Category.CAR);
        fiesta.setImgUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7d/2017_Ford_Fiesta_Zetec_Turbo_1.0_Front.jpg/1280px-2017_Ford_Fiesta_Zetec_Turbo_1.0_Front.jpg");
        fiesta.setStartYear(2010);
        fiesta.setEndYear(2021);
        fiesta.setBrand(fordBrand);
        fiesta.setCreated(Instant.now());
        fiesta.setUpdated(Instant.now());

        return modelRepository.save(fiesta);
    }
}
