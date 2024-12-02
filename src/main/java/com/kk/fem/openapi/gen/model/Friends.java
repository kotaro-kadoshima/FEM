package com.kk.fem.openapi.gen.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Friends
 */

@JsonTypeName("friends")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-02T13:28:51.840482375Z[Etc/UTC]", comments = "Generator version: 7.11.0-SNAPSHOT")
public class Friends {

  private String sysNo;

  private String insertDt;

  private String updateDt;

  private String insertUser;

  private String updateUser;

  private String friendNm;

  public Friends() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Friends(String sysNo, String insertDt, String updateDt, String insertUser, String updateUser, String friendNm) {
    this.sysNo = sysNo;
    this.insertDt = insertDt;
    this.updateDt = updateDt;
    this.insertUser = insertUser;
    this.updateUser = updateUser;
    this.friendNm = friendNm;
  }

  public Friends sysNo(String sysNo) {
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

  public Friends insertDt(String insertDt) {
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

  public Friends updateDt(String updateDt) {
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

  public Friends insertUser(String insertUser) {
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

  public Friends updateUser(String updateUser) {
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

  public Friends friendNm(String friendNm) {
    this.friendNm = friendNm;
    return this;
  }

  /**
   * 友達名
   * @return friendNm
   */
  @NotNull 
  @Schema(name = "friendNm", description = "友達名", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("friendNm")
  public String getFriendNm() {
    return friendNm;
  }

  public void setFriendNm(String friendNm) {
    this.friendNm = friendNm;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Friends friends = (Friends) o;
    return Objects.equals(this.sysNo, friends.sysNo) &&
        Objects.equals(this.insertDt, friends.insertDt) &&
        Objects.equals(this.updateDt, friends.updateDt) &&
        Objects.equals(this.insertUser, friends.insertUser) &&
        Objects.equals(this.updateUser, friends.updateUser) &&
        Objects.equals(this.friendNm, friends.friendNm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sysNo, insertDt, updateDt, insertUser, updateUser, friendNm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Friends {\n");
    sb.append("    sysNo: ").append(toIndentedString(sysNo)).append("\n");
    sb.append("    insertDt: ").append(toIndentedString(insertDt)).append("\n");
    sb.append("    updateDt: ").append(toIndentedString(updateDt)).append("\n");
    sb.append("    insertUser: ").append(toIndentedString(insertUser)).append("\n");
    sb.append("    updateUser: ").append(toIndentedString(updateUser)).append("\n");
    sb.append("    friendNm: ").append(toIndentedString(friendNm)).append("\n");
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

