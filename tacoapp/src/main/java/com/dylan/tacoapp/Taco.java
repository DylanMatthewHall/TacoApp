package com.dylan.tacoapp;
import java.util.List;
import java.util.Objects;
import lombok.Data;

@Data
public class Taco 
{
    private String name;

    private List<Ingredient> ingredients;

    //constructors
    public Taco()
    {

    }

    public Taco(String name, List<Ingredient> ingredients)
    {
        this.name = name;
        this.ingredients = ingredients;
    }

    //getters
    public String getName()
    {
        return name;
    }

    public List<Ingredient> getIngredients()
    {
        return ingredients;
    }

    //setters
    public void setName(String name)
    {
        this.name = name;
    }

    public void setIngredients(List<Ingredient> ingredients)
    {
        this.ingredients = ingredients;
    }

    //equals
    @Override
    public boolean equals(Object o)
    {
        if(this == o) return true;
        if(!(o instanceof Taco)) return false;
        Taco other = (Taco) o;
        return Objects.equals(name, other.name) &&
               Objects.equals(ingredients, other.ingredients);
    }

    //toString
    @Override
    public String toString()
    {
        return "Taco(name =" + this.name +
                ", ingredients=" + this.ingredients + ")";
    }

    //hashCode
    @Override
    public int hashCode()
    {
        return Objects.hash(name, ingredients);
    }
}