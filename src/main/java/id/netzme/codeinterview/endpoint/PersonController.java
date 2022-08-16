package id.netzme.codeinterview.endpoint;

import id.netzme.codeinterview.dto.response.ResponseUser;
import id.netzme.codeinterview.dto.response.ResponseUserRetrofit;
import id.netzme.codeinterview.mapper.ResponseUserMapper;
import id.netzme.codeinterview.service.PersonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/person")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PersonController {

    private final PersonService personService;
    private final ResponseUserMapper responseUserMapper;

    @GetMapping("/")
    public ResponseEntity getPerson() {
        try {
            ResponseUserRetrofit responseUserRetrofit = personService.getPerson();
            if (responseUserRetrofit != null) {
                ResponseUser responseUser = responseUserMapper.toResponseUser(responseUserRetrofit);
                HttpHeaders headers = new HttpHeaders();
                headers.setContentType(MediaType.APPLICATION_JSON);
                return new ResponseEntity<>(responseUser, headers, HttpStatus.OK);
            }
            return new ResponseEntity(HttpEntity.EMPTY, HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            log.error(e.getMessage());
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
