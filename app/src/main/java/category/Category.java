package category;

import java.util.List;

import cakes.Cakes;

public class Category {
    private String nameCategory;
    private List<Cakes> cakes;

    public Category(String nameCategory, List<Cakes> foods) {
        this.nameCategory = nameCategory;
        this.cakes = cakes;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public List<Cakes> getCakes() {
        return cakes;
    }

    public void setCakes(List<Cakes> cakes) {
        this.cakes = cakes;
    }
}
