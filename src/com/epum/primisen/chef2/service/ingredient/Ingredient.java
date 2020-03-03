package com.epum.primisen.chef2.service.ingredient;

public class Ingredient {

    private String name;
    private double weight;
    private int calorie;
    private double carbohydrates;
    private double fits;
    private double proteins;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public double getFits() {
        return fits;
    }

    public void setFits(double fits) {
        this.fits = fits;
    }

    public double getProteins() {
        return proteins;
    }

    public void setProteins(double proteins) {
        this.proteins = proteins;
    }

    @Override
    public int hashCode() {
        int result = 3;
        result += weight * 17;
        result += calorie * 17;
        result += carbohydrates * 17;
        result += fits * 17;
        result += proteins * 17;
        result += name.hashCode() * 17;

        return result;
    }

    @Override
    public boolean equals(Object object) {

        if (this == object) {
            return true;
        }
        if (object == null || object.getClass() != this.getClass()) {
            return false;
        } else {
            Ingredient ingredient = (Ingredient) object;
            return this.name.equals(ingredient.getName()) &&
                    this.weight == ingredient.weight &&
                    this.calorie == ingredient.getCalorie() &&
                    this.carbohydrates == ingredient.getCarbohydrates() &&
                    this.fits == ingredient.getFits() &&
                    this.proteins == ingredient.getProteins();
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ingredient{");
        sb.append("name='").append(name).append('\'');
        sb.append(", weight=").append(weight);
        sb.append(", calorie=").append(calorie);
        sb.append(", carbohydrates=").append(carbohydrates);
        sb.append(", fits=").append(fits);
        sb.append(", proteins=").append(proteins);
        sb.append('}');
        return sb.toString();
    }
}
