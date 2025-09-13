package com.durga.utils;

import java.util.Optional;

public class Address {
    private final Optional<Integer> flatNumber;
    private final int streetNumber;
    private final Optional<String> buildingName;
    private final String streetName;
    private final String postCode;

    public Address(Optional<Integer> flatNumber, int streetNumber, Optional<String> buildingName, String streetName, String postCode) {
        this.flatNumber = flatNumber;
        this.streetNumber = streetNumber;
        this.buildingName = buildingName;
        this.streetName = streetName;
        this.postCode = postCode;
    }

    public Optional<Integer> getFlatNumber() {
        return flatNumber;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public Optional<String> getBuildingName() {
        return buildingName;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getPostCode() {
        return postCode;
    }
}
