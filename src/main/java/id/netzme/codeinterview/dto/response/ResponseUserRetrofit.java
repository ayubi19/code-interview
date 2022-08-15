package id.netzme.codeinterview.dto.response;

import id.netzme.codeinterview.dto.randomuser.Info;
import id.netzme.codeinterview.dto.randomuser.Result;
import lombok.Data;

import java.util.List;

@Data
public class ResponseUserRetrofit {
    private List<Result> results;
    private Info info;
}
