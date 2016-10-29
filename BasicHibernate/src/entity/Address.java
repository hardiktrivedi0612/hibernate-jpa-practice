/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.persistence.Embeddable;

/**
 *
 * @author Hardik
 */
@Embeddable
public class Address {

    private String street;
    private String city;
    private String zipcode;

    public Address() {
    }

    public Address(String street, String city, String zipcode) {
        this.street = street;
        this.city = city;
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Address{" + "street=" + street + ", city=" + city + ", zipcode=" + zipcode + '}';
    }
}
