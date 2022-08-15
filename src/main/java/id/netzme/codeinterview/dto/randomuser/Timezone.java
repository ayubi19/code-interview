package id.netzme.codeinterview.dto.randomuser;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Timezone {
    private String offset;
    private String description;
}
