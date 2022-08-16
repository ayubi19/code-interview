package id.netzme.codeinterview.service;

import id.netzme.codeinterview.dto.response.ResponseUserRetrofit;

import java.io.IOException;

public interface PersonService {

    ResponseUserRetrofit getPerson() throws IOException;
}
