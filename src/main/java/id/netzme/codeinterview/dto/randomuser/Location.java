package id.netzme.codeinterview.dto.randomuser;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Location {
    public Street street;
    public String city;
    public String state;
    public String country;
    public String postcode;
    public Coordinates coordinates;
    public Timezone timezone;

}
