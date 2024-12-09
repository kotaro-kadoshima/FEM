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
 * UserAuthGet200Response
 */

@JsonTypeName("_user_auth_get_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-09T22:54:12.765383677Z[Etc/UTC]", comments = "Generator version: 7.11.0-SNAPSHOT")
public class UserAuthGet200Response {

  private String msgId;

  private String msg;

  @Valid
  private List<@Valid UserAuthGet200ResponseResultInner> result = new ArrayList<>();

  public UserAuthGet200Response() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserAuthGet200Response(String msgId, String msg, List<@Valid UserAuthGet200ResponseResultInner> result) {
    this.msgId = msgId;
    this.msg = msg;
    this.result = result;
  }

  public UserAuthGet200Response msgId(String msgId) {
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

  public UserAuthGet200Response msg(String msg) {
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

  public UserAuthGet200Response result(List<@Valid UserAuthGet200ResponseResultInner> result) {
    this.result = result;
    return this;
  }

  public UserAuthGet200Response addResultItem(UserAuthGet200ResponseResultInner resultItem) {
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
  @NotNull @Valid 
  @Schema(name = "result", description = "処理結果", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("result")
  public List<@Valid UserAuthGet200ResponseResultInner> getResult() {
    return result;
  }

  public void setResult(List<@Valid UserAuthGet200ResponseResultInner> result) {
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
    UserAuthGet200Response userAuthGet200Response = (UserAuthGet200Response) o;
    return Objects.equals(this.msgId, userAuthGet200Response.msgId) &&
        Objects.equals(this.msg, userAuthGet200Response.msg) &&
        Objects.equals(this.result, userAuthGet200Response.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msgId, msg, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAuthGet200Response {\n");
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

