package com.kk.fem.openapi.gen.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * UserInsertPostRequest
 */

@JsonTypeName("_user_insert_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-02T13:28:51.840482375Z[Etc/UTC]", comments = "Generator version: 7.11.0-SNAPSHOT")
public class UserInsertPostRequest {

  private String userId;

  private String userPass;

  private String userNm;

  private String userMail;

  public UserInsertPostRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserInsertPostRequest(String userId, String userPass, String userNm, String userMail) {
    this.userId = userId;
    this.userPass = userPass;
    this.userNm = userNm;
    this.userMail = userMail;
  }

  public UserInsertPostRequest userId(String userId) {
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

  public UserInsertPostRequest userPass(String userPass) {
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

  public UserInsertPostRequest userNm(String userNm) {
    this.userNm = userNm;
    return this;
  }

  /**
   * ユーザ名（姓+全角スペース+名）
   * @return userNm
   */
  @NotNull 
  @Schema(name = "userNm", description = "ユーザ名（姓+全角スペース+名）", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("userNm")
  public String getUserNm() {
    return userNm;
  }

  public void setUserNm(String userNm) {
    this.userNm = userNm;
  }

  public UserInsertPostRequest userMail(String userMail) {
    this.userMail = userMail;
    return this;
  }

  /**
   * メールアドレス
   * @return userMail
   */
  @NotNull 
  @Schema(name = "userMail", description = "メールアドレス", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("userMail")
  public String getUserMail() {
    return userMail;
  }

  public void setUserMail(String userMail) {
    this.userMail = userMail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInsertPostRequest userInsertPostRequest = (UserInsertPostRequest) o;
    return Objects.equals(this.userId, userInsertPostRequest.userId) &&
        Objects.equals(this.userPass, userInsertPostRequest.userPass) &&
        Objects.equals(this.userNm, userInsertPostRequest.userNm) &&
        Objects.equals(this.userMail, userInsertPostRequest.userMail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, userPass, userNm, userMail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInsertPostRequest {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userPass: ").append(toIndentedString(userPass)).append("\n");
    sb.append("    userNm: ").append(toIndentedString(userNm)).append("\n");
    sb.append("    userMail: ").append(toIndentedString(userMail)).append("\n");
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

