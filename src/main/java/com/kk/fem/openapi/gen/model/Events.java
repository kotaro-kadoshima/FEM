package com.kk.fem.openapi.gen.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Events
 */

@JsonTypeName("events")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-09T22:54:12.765383677Z[Etc/UTC]", comments = "Generator version: 7.11.0-SNAPSHOT")
public class Events {

  private String sysNo;

  private String insertDt;

  private String updateDt;

  private String insertUser;

  private String updateUser;

  private String eventId;

  private String eventNm;

  private String eventStartDate;

  private String eventEndDate;

  private String eventStartTime = null;

  private String eventEndTime = null;

  public Events() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Events(String sysNo, String insertDt, String updateDt, String insertUser, String updateUser, String eventId, String eventNm, String eventStartDate, String eventEndDate) {
    this.sysNo = sysNo;
    this.insertDt = insertDt;
    this.updateDt = updateDt;
    this.insertUser = insertUser;
    this.updateUser = updateUser;
    this.eventId = eventId;
    this.eventNm = eventNm;
    this.eventStartDate = eventStartDate;
    this.eventEndDate = eventEndDate;
  }

  public Events sysNo(String sysNo) {
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

  public Events insertDt(String insertDt) {
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

  public Events updateDt(String updateDt) {
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

  public Events insertUser(String insertUser) {
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

  public Events updateUser(String updateUser) {
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

  public Events eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * イベントID番号（払い出し）
   * @return eventId
   */
  @NotNull 
  @Schema(name = "eventId", description = "イベントID番号（払い出し）", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("eventId")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public Events eventNm(String eventNm) {
    this.eventNm = eventNm;
    return this;
  }

  /**
   * イベント名
   * @return eventNm
   */
  @NotNull 
  @Schema(name = "eventNm", description = "イベント名", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("eventNm")
  public String getEventNm() {
    return eventNm;
  }

  public void setEventNm(String eventNm) {
    this.eventNm = eventNm;
  }

  public Events eventStartDate(String eventStartDate) {
    this.eventStartDate = eventStartDate;
    return this;
  }

  /**
   * イベント開始日（yyyymmdd形式）
   * @return eventStartDate
   */
  @NotNull 
  @Schema(name = "eventStartDate", description = "イベント開始日（yyyymmdd形式）", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("eventStartDate")
  public String getEventStartDate() {
    return eventStartDate;
  }

  public void setEventStartDate(String eventStartDate) {
    this.eventStartDate = eventStartDate;
  }

  public Events eventEndDate(String eventEndDate) {
    this.eventEndDate = eventEndDate;
    return this;
  }

  /**
   * イベント終了日（yyyymmdd形式）
   * @return eventEndDate
   */
  @NotNull 
  @Schema(name = "eventEndDate", description = "イベント終了日（yyyymmdd形式）", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("eventEndDate")
  public String getEventEndDate() {
    return eventEndDate;
  }

  public void setEventEndDate(String eventEndDate) {
    this.eventEndDate = eventEndDate;
  }

  public Events eventStartTime(String eventStartTime) {
    this.eventStartTime = eventStartTime;
    return this;
  }

  /**
   * イベント開始時間（HHmmss形式）
   * @return eventStartTime
   */
  
  @Schema(name = "eventStartTime", description = "イベント開始時間（HHmmss形式）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventStartTime")
  public String getEventStartTime() {
    return eventStartTime;
  }

  public void setEventStartTime(String eventStartTime) {
    this.eventStartTime = eventStartTime;
  }

  public Events eventEndTime(String eventEndTime) {
    this.eventEndTime = eventEndTime;
    return this;
  }

  /**
   * イベント終了時間（HHmmss形式）
   * @return eventEndTime
   */
  
  @Schema(name = "eventEndTime", description = "イベント終了時間（HHmmss形式）", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventEndTime")
  public String getEventEndTime() {
    return eventEndTime;
  }

  public void setEventEndTime(String eventEndTime) {
    this.eventEndTime = eventEndTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Events events = (Events) o;
    return Objects.equals(this.sysNo, events.sysNo) &&
        Objects.equals(this.insertDt, events.insertDt) &&
        Objects.equals(this.updateDt, events.updateDt) &&
        Objects.equals(this.insertUser, events.insertUser) &&
        Objects.equals(this.updateUser, events.updateUser) &&
        Objects.equals(this.eventId, events.eventId) &&
        Objects.equals(this.eventNm, events.eventNm) &&
        Objects.equals(this.eventStartDate, events.eventStartDate) &&
        Objects.equals(this.eventEndDate, events.eventEndDate) &&
        Objects.equals(this.eventStartTime, events.eventStartTime) &&
        Objects.equals(this.eventEndTime, events.eventEndTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sysNo, insertDt, updateDt, insertUser, updateUser, eventId, eventNm, eventStartDate, eventEndDate, eventStartTime, eventEndTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Events {\n");
    sb.append("    sysNo: ").append(toIndentedString(sysNo)).append("\n");
    sb.append("    insertDt: ").append(toIndentedString(insertDt)).append("\n");
    sb.append("    updateDt: ").append(toIndentedString(updateDt)).append("\n");
    sb.append("    insertUser: ").append(toIndentedString(insertUser)).append("\n");
    sb.append("    updateUser: ").append(toIndentedString(updateUser)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventNm: ").append(toIndentedString(eventNm)).append("\n");
    sb.append("    eventStartDate: ").append(toIndentedString(eventStartDate)).append("\n");
    sb.append("    eventEndDate: ").append(toIndentedString(eventEndDate)).append("\n");
    sb.append("    eventStartTime: ").append(toIndentedString(eventStartTime)).append("\n");
    sb.append("    eventEndTime: ").append(toIndentedString(eventEndTime)).append("\n");
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

