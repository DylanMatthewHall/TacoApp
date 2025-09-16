package com.dylan.tacoapp;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class TacoOrder 
{
    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryState;
    private String deliveryZip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;

    private List<Taco> tacos = new ArrayList<>();

    //Behavior
    public void addTaco (Taco taco)
    {
        tacos.add(taco);
    }

    //constructors
    public TacoOrder() 
    {

    }

    public TacoOrder(String deliveryName, String deliveryStreet,
                     String deliveryCity, String deliveryState,
                     String deliveryZip, String ccNumber,
                     String ccExpiration, String ccCVV)
    {
        this.deliveryName = deliveryName;
        this.deliveryStreet = deliveryStreet;
        this.deliveryCity = deliveryCity;
        this.deliveryState = deliveryState;
        this.deliveryZip = deliveryZip;
        this.ccNumber = ccNumber;
        this.ccExpiration = ccExpiration;
        this.ccCVV = ccCVV;
    }


    //getters
    public String getDeliveryName()
    {
        return deliveryName;
    }

    public String getDeliveryStreet()
    {
        return deliveryStreet;
    }

    public String getDeliveryCity()
    {
        return deliveryCity;
    }

    public String getDeliveryState()
    {
        return deliveryState;
    }

    public String getDeliveryZip()
    {
        return deliveryZip;
    }

    public String getCcNumber()
    {
        return ccNumber;
    }

    public String getCcExpiration()
    {
        return ccExpiration;
    }

    public String getCcCVV()
    {
        return ccCVV;
    }

    public List<Taco> getTacos()
    {
        return tacos;
    }

    //setters
    public void setDeliveryName(String deliveryName)
    {
        this.deliveryName = deliveryName;
    }

    public void setDeliveryStreet(String deliveryStreet)
    {
        this.deliveryStreet = deliveryStreet;
    }

    public void setDeliveryCity(String deliveryCity)
    {
        this.deliveryCity = deliveryCity;
    }

    public void setDeliveryState(String deliveryState)
    {
        this.deliveryState = deliveryState;
    }

    public void setDeliveryZip(String deliveryZip)
    {
        this.deliveryZip = deliveryZip;
    }

    public void setCcNumber(String ccNumber)
    {
        this.ccNumber = ccNumber;
    }

    public void setCcExpiration(String ccExpiration)
    {
        this.ccExpiration = ccExpiration;
    }

    public void setCcCVV(String ccCVV)
    {
        this.ccCVV = ccCVV;
    }

    public void setTacos(List<Taco> tacos)
    {
        this.tacos = tacos;
    }

    //@Override
    @Override
    public boolean equals(Object o)
    {
        if(this == o)
        {
            return true;
        }
        if(!(o instanceof TacoOrder))
        {
            return false;
        }
        TacoOrder other = (TacoOrder) o;
        return Objects.equals(deliveryName, other.deliveryName) &&
               Objects.equals(deliveryStreet, other.deliveryStreet) &&
               Objects.equals(deliveryCity, other.deliveryCity) &&
               Objects.equals(deliveryState, other.deliveryState) &&
               Objects.equals(deliveryZip, other.deliveryZip) &&
               Objects.equals(ccNumber, other.ccNumber) &&
               Objects.equals(ccExpiration, other.ccExpiration) &&
               Objects.equals(ccCVV, other.ccCVV);
    }

    // TODO: refactor method to mask sensitive card information (number, Expiration, CVV)
    @Override
    public String toString()
    {
        return "TacoOrder(deliveryName=" + this.deliveryName +
               ", deliveryStreet=" + this.deliveryStreet +
               ", deliveryCity=" + this.deliveryCity +
               ", deliveryState=" + this.deliveryState + 
               ", deliveryZip=" + this.deliveryZip +
               ", ccNumber=" + this.ccNumber +
               ", ccExpiration=" + this.ccExpiration +
               ", ccCVV=" + this.ccCVV + ")";
    }

    @Override 
    public int hashCode()
    {
        return Objects.hash(deliveryName, 
                            deliveryStreet,
                            deliveryCity,
                            deliveryState,
                            deliveryZip,
                            ccNumber,
                            ccExpiration,
                            ccCVV);
    }
}