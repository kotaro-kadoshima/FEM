package com.kk.fem.openapi.impl;

import com.kk.fem.openapi.gen.api.FemApi;
import com.kk.fem.openapi.gen.model.VersionGet200Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class FemApiController implements FemApi {

    @Override
    public ResponseEntity<VersionGet200Response> versionGet() {
        // ダミーデータを作成
        VersionGet200Response response = new VersionGet200Response();
        response.setVersion("1.0.0"); // 例: アプリケーションのバージョン

        // 200 OKでレスポンスを返却
        return ResponseEntity.ok(response);
    }
}