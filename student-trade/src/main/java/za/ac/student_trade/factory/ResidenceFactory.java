package za.ac.student_trade.factory;

import za.ac.student_trade.domain.Address;
import za.ac.student_trade.domain.Residence;
import za.ac.student_trade.util.Helper;

import java.util.Random;

public class ResidenceFactory {
    public static Residence createResidence(String residenceName, String roomNumber, int floorNumber, String buildingName, Address address) {

        Long residenceId = new Random().nextLong();
        return new Residence.Builder()
                .setResidenceId(residenceId)
                .setResidenceName(residenceName)
                .setRoomNumber(roomNumber)
                .setFloorNumber(floorNumber)
                .setBuildingName(buildingName)
                .setAddress(address)
                .build();
    }
}
