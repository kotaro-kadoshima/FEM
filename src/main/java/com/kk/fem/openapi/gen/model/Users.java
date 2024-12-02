package com.kk.fem.openapi.gen.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Users
 */

@JsonTypeName("users")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-02T13:28:51.840482375Z[Etc/UTC]", comments = "Generator version: 7.11.0-SNAPSHOT")
public class Users {

  private String sysNo;

  private String insertDt;

  private String updateDt;

  private String insertUser;

  private String updateUser;

  private String userId;

  private String userPass;

  private String userNm;

  private String userMail;

  public Users() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Users(String sysNo, String insertDt, String updateDt, String insertUser, String updateUser, String userId, String userPass, String userNm, String userMail) {
    this.sysNo = sysNo;
    this.insertDt = insertDt;
    this.updateDt = updateDt;
    this.insertUser = insertUser;
    this.updateUser = updateUser;
    this.userId = userId;
    this.userPass = userPass;
    this.userNm = userNm;
    this.userMail = userMail;
  }

  public Users sysNo(String sysNo) {
    this.sysNo = sysNo;
    return this;
  }

  /**
   * システム番号（払い出し）
   * @return sysNo
   */
  @NotNull 
  @Schema(name = "sysNo", description = "システム番号（払い出し）", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sysNo")
  public String getSysNo() {
    return sysNo;
  }

  public void setSysNo(String sysNo) {
    this.sysNo = sysNo;
  }

  public Users insertDt(String insertDt) {
    this.insertDt = insertDt;
    return this;
  }

  /**
   * 登録日時（yyyymmddHHmmss形式）
   * @return insertDt
   */
  @NotNull 
  @Schema(name = "insertDt", description = "登録日時（yyyymmddHHmmss形式）", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("insertDt")
  public String getInsertDt() {
    return insertDt;
  }

  public void setInsertDt(String insertDt) {
    this.insertDt = insertDt;
  }

  public Users updateDt(String updateDt) {
    this.updateDt = updateDt;
    return this;
  }

  /**
   * 更新日時（yyyymmddHHmmss形式）
   * @return updateDt
   */
  @NotNull 
  @Schema(name = "updateDt", description = "更新日時（yyyymmddHHmmss形式）", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("updateDt")
  public String getUpdateDt() {
    return updateDt;
  }

  public void setUpdateDt(String updateDt) {
    this.updateDt = updateDt;
  }

  public Users insertUser(String insertUser) {
    this.insertUser = insertUser;
    return this;
  }

  /**
   * 登録ユーザ
   * @return insertUser
   */
  @NotNull 
  @Schema(name = "insertUser", description = "登録ユーザ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("insertUser")
  public String getInsertUser() {
    return insertUser;
  }

  public void setInsertUser(String insertUser) {
    this.insertUser = insertUser;
  }

  public Users updateUser(String updateUser) {
    this.updateUser = updateUser;
    return this;
  }

  /**
   * 更新ユーザ
   * @return updateUser
   */
  @NotNull 
  @Schema(name = "updateUser", description = "更新ユーザ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("updateUser")
  public String getUpdateUser() {
    return updateUser;
  }

  public void setUpdateUser(String updateUser) {
    this.updateUser = updateUser;
  }

  public Users userId(String userId) {
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

  public Users userPass(String userPass) {
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

  public Users userNm(String userNm) {
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

  public Users userMail(String userMail) {
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
    Users users = (Users) o;
    return Objects.equals(this.sysNo, users.sysNo) &&
        Objects.equals(this.insertDt, users.insertDt) &&
        Objects.equals(this.updateDt, users.updateDt) &&
        Objects.equals(this.insertUser, users.insertUser) &&
        Objects.equals(this.updateUser, users.updateUser) &&
        Objects.equals(this.userId, users.userId) &&
        Objects.equals(this.userPass, users.userPass) &&
        Objects.equals(this.userNm, users.userNm) &&
        Objects.equals(this.userMail, users.userMail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sysNo, insertDt, updateDt, insertUser, updateUser, userId, userPass, userNm, userMail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Users {\n");
    sb.append("    sysNo: ").append(toIndentedString(sysNo)).append("\n");
    sb.append("    insertDt: ").append(toIndentedString(insertDt)).append("\n");
    sb.append("    updateDt: ").append(toIndentedString(updateDt)).append("\n");
    sb.append("    insertUser: ").append(toIndentedString(insertUser)).append("\n");
    sb.append("    updateUser: ").append(toIndentedString(updateUser)).append("\n");
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

