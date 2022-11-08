package app.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "flights")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="flight_id")
    private int flightId;

//     @OneToSOMETHING(mappedBy="cityName")
    @Column(name="departing")
    private String departingCity;

    @Column(name="arriving")
    private String arrivingCity;


}
