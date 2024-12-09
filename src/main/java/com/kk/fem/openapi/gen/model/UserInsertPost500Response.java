package com.kk.fem.openapi.gen.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * UserInsertPost500Response
 */

@JsonTypeName("_user_insert_post_500_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-09T22:54:12.765383677Z[Etc/UTC]", comments = "Generator version: 7.11.0-SNAPSHOT")
public class UserInsertPost500Response {

  private String msg;

  @Valid
  private List<Object> result = new ArrayList<>();

  private String msgId;

  public UserInsertPost500Response() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserInsertPost500Response(String msg, List<Object> result, String msgId) {
    this.msg = msg;
    this.result = result;
    this.msgId = msgId;
  }

  public UserInsertPost500Response msg(String msg) {
    this.msg = msg;
    return this;
  }

  /**
   * メッセージ
   * @return msg
   */
  @NotNull 
  @Schema(name = "msg", description = "メッセージ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("msg")
  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public UserInsertPost500Response result(List<Object> result) {
    this.result = result;
    return this;
  }

  public UserInsertPost500Response addResultItem(Object resultItem) {
    if (this.result == null) {
      this.result = new ArrayList<>();
    }
    this.result.add(resultItem);
    return this;
  }

  /**
   * 処理結果
   * @return result
   */
  @NotNull 
  @Schema(name = "result", description = "処理結果", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("result")
  public List<Object> getResult() {
    return result;
  }

  public void setResult(List<Object> result) {
    this.result = result;
  }

  public UserInsertPost500Response msgId(String msgId) {
    this.msgId = msgId;
    return this;
  }

  /**
   * メッセージID
   * @return msgId
   */
  @NotNull 
  @Schema(name = "msgId", description = "メッセージID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("msgId")
  public String getMsgId() {
    return msgId;
  }

  public void setMsgId(String msgId) {
    this.msgId = msgId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInsertPost500Response userInsertPost500Response = (UserInsertPost500Response) o;
    return Objects.equals(this.msg, userInsertPost500Response.msg) &&
        Objects.equals(this.result, userInsertPost500Response.result) &&
        Objects.equals(this.msgId, userInsertPost500Response.msgId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msg, result, msgId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInsertPost500Response {\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    msgId: ").append(toIndentedString(msgId)).append("\n");
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

