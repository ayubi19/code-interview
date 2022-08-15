package id.netzme.codeinterview.dao;

import id.netzme.codeinterview.dto.response.ResponseUserRetrofit;
import org.springframework.stereotype.Repository;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;

@Repository
public class PersonDAO implements IPersonDAO {

    @Override
    public ResponseUserRetrofit getUser() throws IOException {
        Retrofit retrofitClientInstance = RetrofitClientInstance.getRetrofitInstance();
        IPersonRetrofitDAO personRetrofitDAO = retrofitClientInstance.create(IPersonRetrofitDAO.class);
        Call<ResponseUserRetrofit> responseUserCall = personRetrofitDAO.getPerson();
        Response<ResponseUserRetrofit> execute = responseUserCall.execute();
        ResponseUserRetrofit result = execute.body();
        return result;
    }
}
