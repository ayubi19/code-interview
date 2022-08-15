package id.netzme.codeinterview.mapper;

import id.netzme.codeinterview.dto.response.ResponseUser;
import id.netzme.codeinterview.dto.response.ResponseUserRetrofit;
import org.mapstruct.Mapper;

@Mapper
public interface ResponseUserMapper {

    ResponseUser toResponseUser(ResponseUserRetrofit responseUserRetrofit);
}
