package com.erdemserhat.software_project_management_system;

/**
 * The Address class represents a physical address with various components such as street, city, state/province,
 * postal code, and country.
 */
public class Address {
    private String street;       // Street
    private String city;         // City
    private String state;        // State/Province
    private String postalCode;   // Postal Code
    private String country;      // Country

    /**
     * Constructs an Address object with the specified components.
     *
     * @param street     The street name of the address.
     * @param city       The city name of the address.
     * @param state      The state or province name of the address.
     * @param postalCode The postal code or ZIP code of the address.
     * @param country    The country name of the address.
     */
    public Address(String street, String city, String state, String postalCode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
    }

    /**
     * Creates a new instance of the Address class with default values.
     */
    public Address() {
        this.street = "Sample Street";
        this.city = "Sample City";
        this.state = "Sample State";
        this.postalCode = "Sample Postal Code";
        this.country = "Sample Country";
    }

    /**
     * Returns the street name of the address.
     *
     * @return The street name.
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the street name of the address.
     *
     * @param street The street name to set.
     */
    public void setStreet(String street) {
        try {
            this.street = street;
        } catch (Exception e) {
            System.out.println("Error: An error occurred while setting the street.");
            e.printStackTrace();
        }
    }

    /**
     * Returns the city name of the address.
     *
     * @return The city name.
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the city name of the address.
     *
     * @param city The city name to set.
     */
    public void setCity(String city) {
        try {
            this.city = city;
        } catch (Exception e) {
            System.out.println("Error: An error occurred while setting the city.");
            e.printStackTrace();
        }
    }

    /**
     * Returns the state or province name of the address.
     *
     * @return The state or province name.
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the state or province name of the address.
     *
     * @param state The state or province name to set.
     */
    public void setState(String state) {
        try {
            this.state = state;
        } catch (Exception e) {
            System.out.println("Error: An error occurred while setting the state.");
            e.printStackTrace();
        }
    }

    /**
     * Returns the postal code or ZIP code of the address.
     *
     * @return The postal code or ZIP code.
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the postal code or ZIP code of the address.
     *
     * @param postalCode The postal code or ZIP code to set.
     */
    public void setPostalCode(String postalCode) {
        try {
            this.postalCode = postalCode;
        } catch (Exception e) {
            System.out.println("Error: An error occurred while setting the postal code.");
            e.printStackTrace();
        }
    }

    /**
     * Returns the country name of the address.
     *
     * @return The country name.
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the country name of the address.
     *
     * @param country The country name to set.
     */
    public void setCountry(String country) {
        try {
            this.country = country;
        } catch (Exception e) {
            System.out.println("Error: An error occurred while setting the country.");
            e.printStackTrace();
        }
    }

}

