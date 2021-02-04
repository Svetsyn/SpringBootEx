package bg.softuni.mobilele.mobilele.service.impl;

import bg.softuni.mobilele.mobilele.model.entities.Brand;
import bg.softuni.mobilele.mobilele.model.entities.Model;
import bg.softuni.mobilele.mobilele.repository.ModelRepository;
import bg.softuni.mobilele.mobilele.service.BrandService;
import bg.softuni.mobilele.mobilele.view.BrandViewModel;
import bg.softuni.mobilele.mobilele.view.ModelViewModel;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BrandServiceImpl implements BrandService {

    private final ModelRepository modelRepository;
    private final ModelMapper modelMapper;

    public BrandServiceImpl(ModelRepository modelRepository, ModelMapper
            modelMapper) {
        this.modelRepository = modelRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<BrandViewModel> getAllBrands() {
        List<BrandViewModel> result = new ArrayList<>();
        List<Model> allModels = modelRepository.findAll();

        allModels.forEach(me -> {
            Brand brand = me.getBrand();
            Optional<BrandViewModel> brandViewModel = findByName(result,
                    brand.getName());
            if (!brandViewModel.isPresent()) {
                BrandViewModel brandViewModel1 = new BrandViewModel();
                modelMapper.map(brand,brandViewModel1);
                result.add(brandViewModel1);
                brandViewModel=Optional.of(brandViewModel1);
            }
            ModelViewModel newModelViewModel = new ModelViewModel();
            modelMapper.map(me,newModelViewModel);
            brandViewModel.get().addModel(newModelViewModel);
        });
        return result;
    }

    private Optional<BrandViewModel> findByName(List<BrandViewModel> result, String name) {
        return result.stream().filter(m->m.getName().equals(name)).findAny();

    }
}
