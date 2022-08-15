package id.netzme.codeinterview.dto.randomuser;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Picture {
    private String large;
    private String medium;
    private String thumbnail;
}
