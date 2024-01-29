
package com.mycompany.practicaswingmaven;


public class DatosCompartidos {
    private Integer fechaInicioExp;
    private Integer fechaFinExp;
    private String lugarExp;
    private String descExp;
    private Integer fechaInicioEdu;
    private Integer fechaFinEdu;
    private String lugarEdu;
    private String tituloEdu;
    private String descEdu;
    private String descHab;
    private String acercaDe;

    public DatosCompartidos() {
    }

    public DatosCompartidos(Integer fechaInicioExp, Integer fechaFinExp, String lugarExp, String descExp,
            Integer fechaInicioEdu, Integer fechaFinEdu, String lugarEdu, String tituloEdu, String descEdu,
            String descHab, String acercaDe) {
        this.fechaInicioExp = fechaInicioExp;
        this.fechaFinExp = fechaFinExp;
        this.lugarExp = lugarExp;
        this.descExp = descExp;
        this.fechaInicioEdu = fechaInicioEdu;
        this.fechaFinEdu = fechaFinEdu;
        this.lugarEdu = lugarEdu;
        this.tituloEdu = tituloEdu;
        this.descEdu = descEdu;
        this.descHab = descHab;
        this.acercaDe = acercaDe;
    }
    
    //Getters y Setters   

    public Integer getFechaInicioExp() {
        return fechaInicioExp;
    }

    public void setFechaInicioExp(Integer fechaInicioExp) {
        this.fechaInicioExp = fechaInicioExp;
    }

    public Integer getFechaFinExp() {
        return fechaFinExp;
    }

    public void setFechaFinExp(Integer fechaFinExp) {
        this.fechaFinExp = fechaFinExp;
    }

    public String getLugarExp() {
        return lugarExp;
    }

    public void setLugarExp(String lugarExp) {
        this.lugarExp = lugarExp;
    }

    public String getDescExp() {
        return descExp;
    }

    public void setDescExp(String descExp) {
        this.descExp = descExp;
    }

    public Integer getFechaInicioEdu() {
        return fechaInicioEdu;
    }

    public void setFechaInicioEdu(Integer fechaInicioEdu) {
        this.fechaInicioEdu = fechaInicioEdu;
    }

    public Integer getFechaFinEdu() {
        return fechaFinEdu;
    }

    public void setFechaFinEdu(Integer fechaFinEdu) {
        this.fechaFinEdu = fechaFinEdu;
    }

    public String getLugarEdu() {
        return lugarEdu;
    }

    public void setLugarEdu(String lugarEdu) {
        this.lugarEdu = lugarEdu;
    }

    public String getTituloEdu() {
        return tituloEdu;
    }

    public void setTituloEdu(String tituloEdu) {
        this.tituloEdu = tituloEdu;
    }

    public String getDescEdu() {
        return descEdu;
    }

    public void setDescEdu(String descEdu) {
        this.descEdu = descEdu;
    }

    public String getDescHab() {
        return descHab;
    }

    public void setDescHab(String descHab) {
        this.descHab = descHab;
    }

    public String getAcercaDe() {
        return acercaDe;
    }

    public void setAcercaDe(String acercaDe) {
        this.acercaDe = acercaDe;
    }
          
    
}


