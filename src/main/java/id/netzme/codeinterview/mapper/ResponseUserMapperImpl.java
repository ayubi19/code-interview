package id.netzme.codeinterview.mapper;

import id.netzme.codeinterview.dto.randomuser.Result;
import id.netzme.codeinterview.dto.response.ResponseUser;
import id.netzme.codeinterview.dto.response.ResponseUserRetrofit;
import org.springframework.stereotype.Component;

@Component
public class ResponseUserMapperImpl implements ResponseUserMapper{
    @Override
    public ResponseUser toResponseUser(ResponseUserRetrofit responseUserRetrofit) {
        if (responseUserRetrofit == null){
            return null;
        }
        Result result = responseUserRetrofit.getResults().get(0);

        ResponseUser responseUser = new ResponseUser();
        responseUser.setGender(result.getGender());
        responseUser.setFullname(result.getName().getTitle() + " " + result.getName().getFirst() + " " + result.getName().getLast());
        responseUser.setAddress(result.getLocation().getStreet() + " " + result.getLocation().getCity());
        responseUser.setPicture(result.getPicture().getLarge());
        return responseUser;
    }
}
