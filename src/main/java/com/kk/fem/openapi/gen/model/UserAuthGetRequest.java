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
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-02T13:28:51.840482375Z[Etc/UTC]", comments = "Generator version: 7.11.0-SNAPSHOT")
public class UserAuthGetRequest {

  private String userId;

  private String userPass;

  public UserAuthGetRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserAuthGetRequest(String userId, String userPass) {
    this.userId = userId;
    this.userPass = userPass;
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
        Objects.equals(this.userPass, userAuthGetRequest.userPass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, userPass);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAuthGetRequest {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userPass: ").append(toIndentedString(userPass)).append("\n");
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

