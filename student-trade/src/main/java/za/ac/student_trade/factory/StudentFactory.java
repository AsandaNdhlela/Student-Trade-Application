package za.ac.student_trade.factory;

import za.ac.student_trade.domain.Address;
import za.ac.student_trade.domain.Residence;
import za.ac.student_trade.domain.Student;
import za.ac.student_trade.util.Helper;

import java.util.Random;

public class StudentFactory {

    public static Student createStudentWithAddressAndResidence(String firstName, String lastName, String email, String password,
                                        String streetNumber, String streetName, String suburb, String city,  String province, int postalCode,
                                        String residenceName, String roomNumber, int floorNumber, String buildingName) {

        Long studentId = Long.valueOf(Helper.generateId());

        Long addressId = new Random().nextLong();

        Long residenceId = new Random().nextLong();


        Residence residence = new Residence.Builder()
                .setResidenceId(residenceId)
                .setResidenceName(residenceName)
                .setRoomNumber(roomNumber)
                .setFloorNumber(floorNumber)
                .setBuildingName(buildingName)
                .build();

        Address address = new Address.Builder()
                .setAddressId(addressId)
                .setStreetNumber(streetNumber)
                .setStreetName(streetName)
                .setSuburb(suburb)
                .setCity(city)
                .setProvince(province)
                .setPostalCode(postalCode)
                .setResidence(residence)
                .build();

        return new Student.Builder()
                .setStudentId(studentId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setPassword(password)
                .setAddress(address)
                .build();
    }

    public static Student createStudentWithAddress(String firstName, String lastName, String email, String password, String streetNumber, String streetName, String suburb, String city,  String province, int postalCode, Residence residence) {

        Long studentId = Long.valueOf(Helper.generateId());

        Long addressId = new Random().nextLong();


        Address address = new Address.Builder()
                .setAddressId(addressId)
                .setStreetNumber(streetNumber)
                .setStreetName(streetName)
                .setSuburb(suburb)
                .setCity(city)
                .setProvince(province)
                .setPostalCode(postalCode)
                .setResidence(residence)
                .build();


        return new Student.Builder()
                .setStudentId(studentId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setPassword(password)
                .setAddress(address)
                .build();
    }

    public static Student createStudent(String firstName, String lastName, String email, String password, Address address) {

        Long studentId = Long.valueOf(Helper.generateId());

        return new Student.Builder()
                .setStudentId(studentId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setPassword(password)
                .setAddress(address)
                .build();
    }
}
