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
 * UserInsertPost200Response
 */

@JsonTypeName("_user_insert_post_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-02T13:28:51.840482375Z[Etc/UTC]", comments = "Generator version: 7.11.0-SNAPSHOT")
public class UserInsertPost200Response {

  private String msgId;

  private String msg;

  @Valid
  private List<Object> result = new ArrayList<>();

  public UserInsertPost200Response() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserInsertPost200Response(String msgId, String msg, List<Object> result) {
    this.msgId = msgId;
    this.msg = msg;
    this.result = result;
  }

  public UserInsertPost200Response msgId(String msgId) {
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

  public UserInsertPost200Response msg(String msg) {
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

  public UserInsertPost200Response result(List<Object> result) {
    this.result = result;
    return this;
  }

  public UserInsertPost200Response addResultItem(Object resultItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInsertPost200Response userInsertPost200Response = (UserInsertPost200Response) o;
    return Objects.equals(this.msgId, userInsertPost200Response.msgId) &&
        Objects.equals(this.msg, userInsertPost200Response.msg) &&
        Objects.equals(this.result, userInsertPost200Response.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msgId, msg, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInsertPost200Response {\n");
    sb.append("    msgId: ").append(toIndentedString(msgId)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

