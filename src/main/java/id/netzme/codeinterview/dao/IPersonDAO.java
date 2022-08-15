package id.netzme.codeinterview.dao;

import id.netzme.codeinterview.dto.response.ResponseUserRetrofit;

import java.io.IOException;

public interface IPersonDAO {

    ResponseUserRetrofit getUser() throws IOException;
}
