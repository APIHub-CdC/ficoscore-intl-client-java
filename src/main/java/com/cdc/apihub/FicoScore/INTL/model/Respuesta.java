package com.cdc.apihub.FicoScore.INTL.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;


public class Respuesta {
  @SerializedName("folioConsulta")
  private String folioConsulta = null;
  @SerializedName("folio")
  private String folio = null;
  @SerializedName("persona")
  private PersonaResponse persona = null;
  @SerializedName("score")
  private Score score = null;
  public Respuesta folioConsulta(String folioConsulta) {
    this.folioConsulta = folioConsulta;
    return this;
  }
   
  @ApiModelProperty(example = "386636538", value = "Folio de la consulta")
  public String getFolioConsulta() {
    return folioConsulta;
  }
  public void setFolioConsulta(String folioConsulta) {
    this.folioConsulta = folioConsulta;
  }
  public Respuesta folio(String folio) {
    this.folio = folio;
    return this;
  }
   
  @ApiModelProperty(example = "0000001", value = "Folio de la consulta con relación al otorgante")
  public String getFolio() {
    return folio;
  }
  public void setFolio(String folio) {
    this.folio = folio;
  }
  public Respuesta persona(PersonaResponse persona) {
    this.persona = persona;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public PersonaResponse getPersona() {
    return persona;
  }
  public void setPersona(PersonaResponse persona) {
    this.persona = persona;
  }
  public Respuesta score(Score score) {
    this.score = score;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public Score getScore() {
    return score;
  }
  public void setScore(Score score) {
    this.score = score;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Respuesta respuesta = (Respuesta) o;
    return Objects.equals(this.folioConsulta, respuesta.folioConsulta) &&
        Objects.equals(this.folio, respuesta.folio) &&
        Objects.equals(this.persona, respuesta.persona) &&
        Objects.equals(this.score, respuesta.score);
  }
  @Override
  public int hashCode() {
    return Objects.hash(folioConsulta, folio, persona, score);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Respuesta {\n");
    
    sb.append("    folioConsulta: ").append(toIndentedString(folioConsulta)).append("\n");
    sb.append("    folio: ").append(toIndentedString(folio)).append("\n");
    sb.append("    persona: ").append(toIndentedString(persona)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
