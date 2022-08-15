package id.netzme.codeinterview.dao;

import id.netzme.codeinterview.dto.response.ResponseUserRetrofit;
import retrofit2.Call;
import retrofit2.http.GET;

public interface IPersonRetrofitDAO {

    @GET("/api")
    Call<ResponseUserRetrofit> getPerson();
}
