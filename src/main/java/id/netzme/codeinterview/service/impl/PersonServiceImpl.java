package id.netzme.codeinterview.service.impl;

import id.netzme.codeinterview.dao.PersonDAO;
import id.netzme.codeinterview.dto.randomuser.Result;
import id.netzme.codeinterview.dto.response.ResponseUser;
import id.netzme.codeinterview.dto.response.ResponseUserRetrofit;
import id.netzme.codeinterview.mapper.ResponseUserMapper;
import id.netzme.codeinterview.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Service
public class PersonServiceImpl implements PersonService {

    private final PersonDAO personDAO;
    private final ResponseUserMapper responseUserMapper;
    @Override
    public ResponseUser getPerson() throws IOException {
        ResponseUserRetrofit response = personDAO.getUser();
        ResponseUser responseUser = responseUserMapper.toResponseUser(response);
        return responseUser;
    }
}
