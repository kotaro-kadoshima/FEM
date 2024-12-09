package com.kk.fem.openapi.impl;

import com.kk.fem.openapi.gen.api.FemApi;
import com.kk.fem.openapi.gen.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

@Controller
public class FemApiImpl implements FemApi {
    @Override
    public Optional<NativeWebRequest> getRequest() {
        return FemApi.super.getRequest();
    }

    @Override
    public ResponseEntity<UserAuthGet200Response> userAuthGet(UserAuthGetRequest userAuthGetRequest) {
        return FemApi.super.userAuthGet(userAuthGetRequest);
    }

    @Override
    public ResponseEntity<UserInsertPost200Response> userInsertPost(UserInsertPostRequest userInsertPostRequest) {
        return FemApi.super.userInsertPost(userInsertPostRequest);
    }

    @Override
    public ResponseEntity<Version200Response> version() {

        // 実際のレスポンスオブジェクトを作成
        Version200Response response = new Version200Response();
        response.setVersion("0.0.1");

        // レスポンスとして200 OKとデータを返す
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
