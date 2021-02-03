package bg.softuni.mobilele.mobilele.view;

public class BrandViewModel {
    private String name;
    private ModelViewModel models;

    public BrandViewModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ModelViewModel getModels() {
        return models;
    }

    public void setModels(ModelViewModel models) {
        this.models = models;
    }

    @Override
    public String toString() {
        return "BrandViewModel{" +
                "name='" + name + '\'' +
                ", models=" + models +
                '}';
    }
}
