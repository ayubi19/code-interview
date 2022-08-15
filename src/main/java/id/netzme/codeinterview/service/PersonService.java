package id.netzme.codeinterview.service;

import id.netzme.codeinterview.dto.response.ResponseUser;

import java.io.IOException;

public interface PersonService {

    ResponseUser getPerson() throws IOException;
}
