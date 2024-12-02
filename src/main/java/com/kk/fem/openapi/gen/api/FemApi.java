/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.11.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.kk.fem.openapi.gen.api;

import com.kk.fem.openapi.gen.model.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-02T13:28:51.840482375Z[Etc/UTC]", comments = "Generator version: 7.11.0-SNAPSHOT")
@Validated
@Tag(name = "FEM/ユーザ管理", description = "the FEM/ユーザ管理 API")
public interface FemApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /user/auth : ユーザ認証API
     * ユーザ管理テーブルから該当するユーザ認証確認を行うAPI
     *
     * @param userAuthGetRequest  (optional)
     * @return  (status code 200)
     *         or  (status code 500)
     */
    @Operation(
        operationId = "userAuthGet",
        summary = "ユーザ認証API",
        description = "ユーザ管理テーブルから該当するユーザ認証確認を行うAPI",
        tags = { "FEM/ユーザ管理" },
        responses = {
            @ApiResponse(responseCode = "200", description = "", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = UserInsertPost200Response.class))
            }),
            @ApiResponse(responseCode = "500", description = "", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = UserInsertPost500Response.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/auth",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<UserInsertPost200Response> userAuthGet(
        @Parameter(name = "UserAuthGetRequest", description = "") @Valid @RequestBody(required = false) UserAuthGetRequest userAuthGetRequest
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"msg\" : \"msg\", \"result\" : [ \"{}\", \"{}\" ], \"msgId\" : \"msgId\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"msg\" : \"msg\", \"result\" : [ \"{}\", \"{}\" ], \"msgId\" : \"msgId\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /user/insert : ユーザ登録API
     * ユーザ管理テーブルにレコードを登録するAPI
     *
     * @param userInsertPostRequest  (optional)
     * @return  (status code 200)
     *         or  (status code 500)
     */
    @Operation(
        operationId = "userInsertPost",
        summary = "ユーザ登録API",
        description = "ユーザ管理テーブルにレコードを登録するAPI",
        tags = { "FEM/ユーザ管理" },
        responses = {
            @ApiResponse(responseCode = "200", description = "", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = UserInsertPost200Response.class))
            }),
            @ApiResponse(responseCode = "500", description = "", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = UserInsertPost500Response.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/user/insert",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<UserInsertPost200Response> userInsertPost(
        @Parameter(name = "UserInsertPostRequest", description = "") @Valid @RequestBody(required = false) UserInsertPostRequest userInsertPostRequest
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"msg\" : \"msg\", \"result\" : [ \"{}\", \"{}\" ], \"msgId\" : \"msgId\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"msg\" : \"msg\", \"result\" : [ \"{}\", \"{}\" ], \"msgId\" : \"msgId\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /version : appバージョン
     * アプリケーションのバージョンを返却
     *
     * @return  (status code 200)
     */
    @Operation(
        operationId = "versionGet",
        summary = "appバージョン",
        description = "アプリケーションのバージョンを返却",
        tags = { "FEM" },
        responses = {
            @ApiResponse(responseCode = "200", description = "", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = VersionGet200Response.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/version",
        produces = { "application/json" }
    )
    
    default ResponseEntity<VersionGet200Response> versionGet(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"version\" : \"version\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
