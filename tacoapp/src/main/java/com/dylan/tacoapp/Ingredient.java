package com.dylan.tacoapp;
import java.util.Objects;


public class Ingredient 
{
    private final String id;
    private final String name;
    private final Type type;
    
    //Constructors
    public Ingredient(String id, String name, Type type)
    {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    //Getters
    public String getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public Type getType()
    {
        return type;
    }

    //toString
    @Override
    public String toString()
    {
        return "Ingredient(id=" + this.id +
                ", name=" + this.name +
                ", type=" + this.type + ")";
    }

    //equals
    @Override
    public boolean equals(Object o)
    {
        if(this == o) return true;
        if(!(o instanceof Ingredient)) return false;
        Ingredient other = (Ingredient) o;
        return Objects.equals(id, other.id) &&
               Objects.equals(name, other.name) &&
               type == other.type;
    }

    //hashCode
    @Override
    public int hashCode()
    {
        return Objects.hash(id, name, type);
    }

    public enum Type{
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}