package id.netzme.codeinterview.dto.response;

import lombok.*;


@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseUser {
    private String gender;
    private String fullname;
    private String address;
    private String picture;
}
