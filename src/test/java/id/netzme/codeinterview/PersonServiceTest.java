package id.netzme.codeinterview;


import id.netzme.codeinterview.dao.PersonDAO;
import id.netzme.codeinterview.dto.randomuser.Info;
import id.netzme.codeinterview.dto.randomuser.Result;
import id.netzme.codeinterview.dto.response.ResponseUserRetrofit;
import id.netzme.codeinterview.service.impl.PersonServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;
import java.util.List;

@Extensions({
        @ExtendWith(MockitoExtension.class)
})
public class PersonServiceTest {

    @Mock
    private PersonDAO personDAO;

    @Mock
    private ResponseUserRetrofit responseUserRetrofit;
    @InjectMocks
    private PersonServiceImpl personServiceImpl;


    @BeforeEach
    void setup() {
        personServiceImpl = new PersonServiceImpl(personDAO);
    }

    @Test
    void testGetPersonSuccess() throws IOException {
        List<Result> result = null;
        Info info = null;
        ResponseUserRetrofit responseUserRetrofit = new ResponseUserRetrofit();
        responseUserRetrofit.setResults(result);
        responseUserRetrofit.setInfo(info);

        Mockito.when(personDAO.getUser())
                .thenReturn(new ResponseUserRetrofit());

        var person = personServiceImpl.getPerson();
        Assertions.assertEquals(result, person.getResults());
        Assertions.assertEquals(info, person.getInfo());
    }

    @Test
    void testGetPersonNotFound() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
        {
            personServiceImpl.getPerson();
        });
    }


}
