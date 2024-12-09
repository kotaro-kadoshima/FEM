package com.kk.fem.openapi.gen.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * UserAuthGet200ResponseResultInner
 */

@JsonTypeName("_user_auth_get_200_response_result_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-09T22:54:12.765383677Z[Etc/UTC]", comments = "Generator version: 7.11.0-SNAPSHOT")
public class UserAuthGet200ResponseResultInner {

  private String loginDt;

  private String logoutDt;

  public UserAuthGet200ResponseResultInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserAuthGet200ResponseResultInner(String loginDt, String logoutDt) {
    this.loginDt = loginDt;
    this.logoutDt = logoutDt;
  }

  public UserAuthGet200ResponseResultInner loginDt(String loginDt) {
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

  public UserAuthGet200ResponseResultInner logoutDt(String logoutDt) {
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
    UserAuthGet200ResponseResultInner userAuthGet200ResponseResultInner = (UserAuthGet200ResponseResultInner) o;
    return Objects.equals(this.loginDt, userAuthGet200ResponseResultInner.loginDt) &&
        Objects.equals(this.logoutDt, userAuthGet200ResponseResultInner.logoutDt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loginDt, logoutDt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAuthGet200ResponseResultInner {\n");
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

