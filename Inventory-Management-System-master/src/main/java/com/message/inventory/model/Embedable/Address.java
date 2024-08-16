package com.message.inventory.model.Embedable;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @Pattern(regexp = "^[A-Za-z0-9 ]+$", message = "Please enter a valid apartment number")
    private String appartmentNo;

    @Pattern(regexp = "^[A-Za-z ]+$", message = "Please enter a valid society name")
    private String society;

    @Pattern(regexp = "^[A-Za-z ]+$", message = "Please enter a valid area name")
    private String area;

    @Pattern(regexp = "^[A-Za-z ]+$", message = "Please enter a valid city name")
    private String city;

    @Pattern(regexp = "^[A-Za-z ]+$", message = "Please enter a valid state name")
    private String state;

    @Pattern(regexp = "^[0-9]{6}$", message = "Please enter a valid 6-digit pincode")
    private String pincode;

    // Getters and Setters (if not using Lombok)
    public String getAppartmentNo() {
        return appartmentNo;
    }

    public void setAppartmentNo(String appartmentNo) {
        this.appartmentNo = appartmentNo;
    }

    public String getSociety() {
        return society;
    }

    public void setSociety(String society) {
        this.society = society;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
