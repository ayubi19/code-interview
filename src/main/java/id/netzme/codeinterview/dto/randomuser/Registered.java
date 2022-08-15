package id.netzme.codeinterview.dto.randomuser;

import lombok.*;

import java.util.Date;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Registered {
    private Date date;
    private int age;
}
