package lk.ijse.vehicleservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Lahiru Dilshan
 * @created Sat 10:41 AM on 10/7/2023
 * @project nexttravel
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class VehicleDTO {

    private Integer vehicleId;

    private String vehicleBrand;

    private String vehicleCategory;

    private String fuelAndTransmissionType;

    private String vehicleType;

    private String versionType;

    private Double freeForDay;

    private Double freeFor1Km;

    private Integer fuelUsage;

    private Integer seatCapacity;

    private Integer qty;

    private String driverName;

    private String driverContact;

    private List<byte[]> imageList;
}
