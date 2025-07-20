package za.ac.student_trade.factory;

import za.ac.student_trade.domain.Address;
import za.ac.student_trade.domain.Residence;
import za.ac.student_trade.util.Helper;

import java.util.Random;

public class AddressFactory {
    public static Address createAddress(String streetNumber, String streetName, String suburb, String city, String province,
                                        int postalCode, String residenceName, String roomNumber, int floorNumber, String buildingName) {

        Long addressId = Long.valueOf(Helper.generateId());

        Long residenceId = new Random().nextLong();


        Residence residence = new Residence.Builder()
                .setResidenceId(residenceId)
                .setResidenceName(residenceName)
                .setRoomNumber(roomNumber)
                .setFloorNumber(floorNumber)
                .setBuildingName(buildingName)
                .build();

        return new Address.Builder()
                .setAddressId(addressId)
                .setStreetNumber(streetNumber)
                .setStreetName(streetName)
                .setSuburb(suburb)
                .setCity(city)
                .setProvince(province)
                .setPostalCode(postalCode)
                .setResidence(residence)
                .build();
    }

    public static Address createAddress(String streetNumber, String streetName, String suburb, String city, String province,
                                        int postalCode, Residence residence){

        Long addressId = Long.valueOf(Helper.generateId());

        return new Address.Builder()
                .setAddressId(addressId)
                .setStreetNumber(streetNumber)
                .setStreetName(streetName)
                .setSuburb(suburb)
                .setCity(city)
                .setProvince(province)
                .setPostalCode(postalCode)
                .setResidence(residence)
                .build();
    }
}
