package id.netzme.codeinterview.dto.randomuser;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Info {
    private String seed;
    private int results;
    private int page;
    private String version;
}
