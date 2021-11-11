package com.cdc.apihub.FicoScore.INTL.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(description = "Datos generales de la persona a consultada.")


public class PersonaResponse {
  @SerializedName("apellidoPaterno")
  private String apellidoPaterno = null;
  @SerializedName("apellidoMaterno")
  private String apellidoMaterno = null;
  @SerializedName("apellidoAdicional")
  private String apellidoAdicional = null;
  @SerializedName("nombres")
  private String nombres = null;
  @SerializedName("fechaNacimiento")
  private String fechaNacimiento = null;
  @SerializedName("RFC")
  private String RFC = null;
  @SerializedName("prefijo")
  private String prefijo = null;
  @SerializedName("sufijo")
  private String sufijo = null;
  @SerializedName("CURP")
  private String CURP = null;
  @SerializedName("nacionalidad")
  private String nacionalidad = null;
  @SerializedName("residencia")
  private Integer residencia = null;
  @SerializedName("numeroLicenciaConducir")
  private String numeroLicenciaConducir = null;
  @SerializedName("estadoCivil")
  private String estadoCivil = null;
  @SerializedName("sexo")
  private String sexo = null;
  @SerializedName("numeroCedulaProfesional")
  private String numeroCedulaProfesional = null;
  @SerializedName("claveElectorIFE")
  private String claveElectorIFE = null;
  @SerializedName("clavePais")
  private String clavePais = null;
  @SerializedName("numeroDependientes")
  private Integer numeroDependientes = null;
  @SerializedName("edadDependientes")
  private Integer edadDependientes = null;
  @SerializedName("fechaRecepcionDatosDep")
  private String fechaRecepcionDatosDep = null;
  @SerializedName("fechaDefuncion")
  private String fechaDefuncion = null;
  public PersonaResponse apellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
    return this;
  }
   
  @ApiModelProperty(example = "PRUEBA", value = "Reportar el Apellido Paterno completo, no usar abreviaturas o iniciales")
  public String getApellidoPaterno() {
    return apellidoPaterno;
  }
  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
  }
  public PersonaResponse apellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
    return this;
  }
   
  @ApiModelProperty(example = "CUATRO", value = "Cuando solo se reporte un Apellido, este debe ser puesto en Apellido Paterno y el ApellidoMaterno contendrá \"NO PROPORCIONADO\".")
  public String getApellidoMaterno() {
    return apellidoMaterno;
  }
  public void setApellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
  }
  public PersonaResponse apellidoAdicional(String apellidoAdicional) {
    this.apellidoAdicional = apellidoAdicional;
    return this;
  }
   
  @ApiModelProperty(value = "Puede utilizarse para reporta el Apellido de casada.")
  public String getApellidoAdicional() {
    return apellidoAdicional;
  }
  public void setApellidoAdicional(String apellidoAdicional) {
    this.apellidoAdicional = apellidoAdicional;
  }
  public PersonaResponse nombres(String nombres) {
    this.nombres = nombres;
    return this;
  }
   
  @ApiModelProperty(example = "JUAN", value = "Reportar Primer Nombre, Segundo Nombre o Nombres compuestos del consumidor. No se aceptan abreviaciones")
  public String getNombres() {
    return nombres;
  }
  public void setNombres(String nombres) {
    this.nombres = nombres;
  }
  public PersonaResponse fechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
    return this;
  }
   
  @ApiModelProperty(example = "1980-01-04", value = "Fecha de nacimiento de la persona, en el formato especificado (por defecto yyyy-MM-dd)")
  public String getFechaNacimiento() {
    return fechaNacimiento;
  }
  public void setFechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }
  public PersonaResponse RFC(String RFC) {
    this.RFC = RFC;
    return this;
  }
   
  @ApiModelProperty(example = "PUAC800104", value = "RFC con homoclave de la persona")
  public String getRFC() {
    return RFC;
  }
  public void setRFC(String RFC) {
    this.RFC = RFC;
  }
  public PersonaResponse prefijo(String prefijo) {
    this.prefijo = prefijo;
    return this;
  }
   
  @ApiModelProperty(example = "", value = "prefijo")
  public String getPrefijo() {
    return prefijo;
  }
  public void setPrefijo(String prefijo) {
    this.prefijo = prefijo;
  }
  public PersonaResponse sufijo(String sufijo) {
    this.sufijo = sufijo;
    return this;
  }
   
  @ApiModelProperty(example = "", value = "sufijo")
  public String getSufijo() {
    return sufijo;
  }
  public void setSufijo(String sufijo) {
    this.sufijo = sufijo;
  }
  public PersonaResponse CURP(String CURP) {
    this.CURP = CURP;
    return this;
  }
   
  @ApiModelProperty(example = "SAZR010101HCMLNS09", value = "CURP de la persona, emitida por RENAPO")
  public String getCURP() {
    return CURP;
  }
  public void setCURP(String CURP) {
    this.CURP = CURP;
  }
  public PersonaResponse nacionalidad(String nacionalidad) {
    this.nacionalidad = nacionalidad;
    return this;
  }
   
  @ApiModelProperty(value = "Debe contener la clave de la nacionalidad del consumidor.")
  public String getNacionalidad() {
    return nacionalidad;
  }
  public void setNacionalidad(String nacionalidad) {
    this.nacionalidad = nacionalidad;
  }
  public PersonaResponse residencia(Integer residencia) {
    this.residencia = residencia;
    return this;
  }
   
  @ApiModelProperty(value = "residencia")
  public Integer getResidencia() {
    return residencia;
  }
  public void setResidencia(Integer residencia) {
    this.residencia = residencia;
  }
  public PersonaResponse numeroLicenciaConducir(String numeroLicenciaConducir) {
    this.numeroLicenciaConducir = numeroLicenciaConducir;
    return this;
  }
   
  @ApiModelProperty(example = "", value = "numeroLicenciaConducir")
  public String getNumeroLicenciaConducir() {
    return numeroLicenciaConducir;
  }
  public void setNumeroLicenciaConducir(String numeroLicenciaConducir) {
    this.numeroLicenciaConducir = numeroLicenciaConducir;
  }
  public PersonaResponse estadoCivil(String estadoCivil) {
    this.estadoCivil = estadoCivil;
    return this;
  }
   
  @ApiModelProperty(example = "", value = "estadoCivil")
  public String getEstadoCivil() {
    return estadoCivil;
  }
  public void setEstadoCivil(String estadoCivil) {
    this.estadoCivil = estadoCivil;
  }
  public PersonaResponse sexo(String sexo) {
    this.sexo = sexo;
    return this;
  }
   
  @ApiModelProperty(example = "", value = "sexo")
  public String getSexo() {
    return sexo;
  }
  public void setSexo(String sexo) {
    this.sexo = sexo;
  }
  public PersonaResponse numeroCedulaProfesional(String numeroCedulaProfesional) {
    this.numeroCedulaProfesional = numeroCedulaProfesional;
    return this;
  }
   
  @ApiModelProperty(example = "", value = "numeroCedulaProfesional")
  public String getNumeroCedulaProfesional() {
    return numeroCedulaProfesional;
  }
  public void setNumeroCedulaProfesional(String numeroCedulaProfesional) {
    this.numeroCedulaProfesional = numeroCedulaProfesional;
  }
  public PersonaResponse claveElectorIFE(String claveElectorIFE) {
    this.claveElectorIFE = claveElectorIFE;
    return this;
  }
   
  @ApiModelProperty(value = "La clave de elector que se encuentra en el IFE/INE.")
  public String getClaveElectorIFE() {
    return claveElectorIFE;
  }
  public void setClaveElectorIFE(String claveElectorIFE) {
    this.claveElectorIFE = claveElectorIFE;
  }
  public PersonaResponse clavePais(String clavePais) {
    this.clavePais = clavePais;
    return this;
  }
   
  @ApiModelProperty(example = "", value = "clavePais")
  public String getClavePais() {
    return clavePais;
  }
  public void setClavePais(String clavePais) {
    this.clavePais = clavePais;
  }
  public PersonaResponse numeroDependientes(Integer numeroDependientes) {
    this.numeroDependientes = numeroDependientes;
    return this;
  }
   
  @ApiModelProperty(value = "Se debe de reportar el número de Dependientes Económicos del Consumidor.")
  public Integer getNumeroDependientes() {
    return numeroDependientes;
  }
  public void setNumeroDependientes(Integer numeroDependientes) {
    this.numeroDependientes = numeroDependientes;
  }
  public PersonaResponse edadDependientes(Integer edadDependientes) {
    this.edadDependientes = edadDependientes;
    return this;
  }
   
  @ApiModelProperty(value = "clavePais")
  public Integer getEdadDependientes() {
    return edadDependientes;
  }
  public void setEdadDependientes(Integer edadDependientes) {
    this.edadDependientes = edadDependientes;
  }
  public PersonaResponse fechaRecepcionDatosDep(String fechaRecepcionDatosDep) {
    this.fechaRecepcionDatosDep = fechaRecepcionDatosDep;
    return this;
  }
   
  @ApiModelProperty(value = "fechaRecepcionDatosDep")
  public String getFechaRecepcionDatosDep() {
    return fechaRecepcionDatosDep;
  }
  public void setFechaRecepcionDatosDep(String fechaRecepcionDatosDep) {
    this.fechaRecepcionDatosDep = fechaRecepcionDatosDep;
  }
  public PersonaResponse fechaDefuncion(String fechaDefuncion) {
    this.fechaDefuncion = fechaDefuncion;
    return this;
  }
   
  @ApiModelProperty(value = "Fecha de nacimiento de la persona, en el formato especificado (por defecto yyyy-MM-dd)")
  public String getFechaDefuncion() {
    return fechaDefuncion;
  }
  public void setFechaDefuncion(String fechaDefuncion) {
    this.fechaDefuncion = fechaDefuncion;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonaResponse personaResponse = (PersonaResponse) o;
    return Objects.equals(this.apellidoPaterno, personaResponse.apellidoPaterno) &&
        Objects.equals(this.apellidoMaterno, personaResponse.apellidoMaterno) &&
        Objects.equals(this.apellidoAdicional, personaResponse.apellidoAdicional) &&
        Objects.equals(this.nombres, personaResponse.nombres) &&
        Objects.equals(this.fechaNacimiento, personaResponse.fechaNacimiento) &&
        Objects.equals(this.RFC, personaResponse.RFC) &&
        Objects.equals(this.prefijo, personaResponse.prefijo) &&
        Objects.equals(this.sufijo, personaResponse.sufijo) &&
        Objects.equals(this.CURP, personaResponse.CURP) &&
        Objects.equals(this.nacionalidad, personaResponse.nacionalidad) &&
        Objects.equals(this.residencia, personaResponse.residencia) &&
        Objects.equals(this.numeroLicenciaConducir, personaResponse.numeroLicenciaConducir) &&
        Objects.equals(this.estadoCivil, personaResponse.estadoCivil) &&
        Objects.equals(this.sexo, personaResponse.sexo) &&
        Objects.equals(this.numeroCedulaProfesional, personaResponse.numeroCedulaProfesional) &&
        Objects.equals(this.claveElectorIFE, personaResponse.claveElectorIFE) &&
        Objects.equals(this.clavePais, personaResponse.clavePais) &&
        Objects.equals(this.numeroDependientes, personaResponse.numeroDependientes) &&
        Objects.equals(this.edadDependientes, personaResponse.edadDependientes) &&
        Objects.equals(this.fechaRecepcionDatosDep, personaResponse.fechaRecepcionDatosDep) &&
        Objects.equals(this.fechaDefuncion, personaResponse.fechaDefuncion);
  }
  @Override
  public int hashCode() {
    return Objects.hash(apellidoPaterno, apellidoMaterno, apellidoAdicional, nombres, fechaNacimiento, RFC, prefijo, sufijo, CURP, nacionalidad, residencia, numeroLicenciaConducir, estadoCivil, sexo, numeroCedulaProfesional, claveElectorIFE, clavePais, numeroDependientes, edadDependientes, fechaRecepcionDatosDep, fechaDefuncion);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonaResponse {\n");
    
    sb.append("    apellidoPaterno: ").append(toIndentedString(apellidoPaterno)).append("\n");
    sb.append("    apellidoMaterno: ").append(toIndentedString(apellidoMaterno)).append("\n");
    sb.append("    apellidoAdicional: ").append(toIndentedString(apellidoAdicional)).append("\n");
    sb.append("    nombres: ").append(toIndentedString(nombres)).append("\n");
    sb.append("    fechaNacimiento: ").append(toIndentedString(fechaNacimiento)).append("\n");
    sb.append("    RFC: ").append(toIndentedString(RFC)).append("\n");
    sb.append("    prefijo: ").append(toIndentedString(prefijo)).append("\n");
    sb.append("    sufijo: ").append(toIndentedString(sufijo)).append("\n");
    sb.append("    CURP: ").append(toIndentedString(CURP)).append("\n");
    sb.append("    nacionalidad: ").append(toIndentedString(nacionalidad)).append("\n");
    sb.append("    residencia: ").append(toIndentedString(residencia)).append("\n");
    sb.append("    numeroLicenciaConducir: ").append(toIndentedString(numeroLicenciaConducir)).append("\n");
    sb.append("    estadoCivil: ").append(toIndentedString(estadoCivil)).append("\n");
    sb.append("    sexo: ").append(toIndentedString(sexo)).append("\n");
    sb.append("    numeroCedulaProfesional: ").append(toIndentedString(numeroCedulaProfesional)).append("\n");
    sb.append("    claveElectorIFE: ").append(toIndentedString(claveElectorIFE)).append("\n");
    sb.append("    clavePais: ").append(toIndentedString(clavePais)).append("\n");
    sb.append("    numeroDependientes: ").append(toIndentedString(numeroDependientes)).append("\n");
    sb.append("    edadDependientes: ").append(toIndentedString(edadDependientes)).append("\n");
    sb.append("    fechaRecepcionDatosDep: ").append(toIndentedString(fechaRecepcionDatosDep)).append("\n");
    sb.append("    fechaDefuncion: ").append(toIndentedString(fechaDefuncion)).append("\n");
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
