package com.kk.fem.openapi.gen.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * UserAuthGetRequest
 */

@JsonTypeName("_user_auth_get_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-09T22:54:12.765383677Z[Etc/UTC]", comments = "Generator version: 7.11.0-SNAPSHOT")
public class UserAuthGetRequest {

  private String userId;

  private String userPass;

  private String loginDt;

  private String logoutDt;

  public UserAuthGetRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserAuthGetRequest(String userId, String userPass, String loginDt, String logoutDt) {
    this.userId = userId;
    this.userPass = userPass;
    this.loginDt = loginDt;
    this.logoutDt = logoutDt;
  }

  public UserAuthGetRequest userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * ユーザID
   * @return userId
   */
  @NotNull 
  @Schema(name = "userId", description = "ユーザID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public UserAuthGetRequest userPass(String userPass) {
    this.userPass = userPass;
    return this;
  }

  /**
   * パスワード（登録時はハッシュ値に変換）
   * @return userPass
   */
  @NotNull 
  @Schema(name = "userPass", description = "パスワード（登録時はハッシュ値に変換）", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("userPass")
  public String getUserPass() {
    return userPass;
  }

  public void setUserPass(String userPass) {
    this.userPass = userPass;
  }

  public UserAuthGetRequest loginDt(String loginDt) {
    this.loginDt = loginDt;
    return this;
  }

  /**
   * ログイン日時（yyyymmddHHmmss形式）
   * @return loginDt
   */
  @NotNull 
  @Schema(name = "loginDt", description = "ログイン日時（yyyymmddHHmmss形式）", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("loginDt")
  public String getLoginDt() {
    return loginDt;
  }

  public void setLoginDt(String loginDt) {
    this.loginDt = loginDt;
  }

  public UserAuthGetRequest logoutDt(String logoutDt) {
    this.logoutDt = logoutDt;
    return this;
  }

  /**
   * ログアウト日時（yyyymmddHHmmss形式）
   * @return logoutDt
   */
  @NotNull 
  @Schema(name = "logoutDt", description = "ログアウト日時（yyyymmddHHmmss形式）", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("logoutDt")
  public String getLogoutDt() {
    return logoutDt;
  }

  public void setLogoutDt(String logoutDt) {
    this.logoutDt = logoutDt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAuthGetRequest userAuthGetRequest = (UserAuthGetRequest) o;
    return Objects.equals(this.userId, userAuthGetRequest.userId) &&
        Objects.equals(this.userPass, userAuthGetRequest.userPass) &&
        Objects.equals(this.loginDt, userAuthGetRequest.loginDt) &&
        Objects.equals(this.logoutDt, userAuthGetRequest.logoutDt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, userPass, loginDt, logoutDt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAuthGetRequest {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userPass: ").append(toIndentedString(userPass)).append("\n");
    sb.append("    loginDt: ").append(toIndentedString(loginDt)).append("\n");
    sb.append("    logoutDt: ").append(toIndentedString(logoutDt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

