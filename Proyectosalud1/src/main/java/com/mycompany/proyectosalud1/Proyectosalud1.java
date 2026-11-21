/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectosalud1;

/**
 *
 * @author USER
 */
public class Proyectosalud1 {
    private String codigoPaciente;
    private String nombreCompleto;
    private String dniProtegido;

    public Proyectosalud1(String codigoPaciente, String nombreCompleto, String dniOriginal) {
        this.codigoPaciente = codigoPaciente;
        this.nombreCompleto = nombreCompleto;
        setDniProtegido(dniOriginal);
    }

    public String getCodigoPaciente() {
        return codigoPaciente;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getDniProtegido() {
        return dniProtegido;
    }

    public void setDniProtegido(String dniOriginal) {
        if (dniOriginal != null && dniOriginal.length() >= 4) {
            String ultimosDos = dniOriginal.substring(dniOriginal.length() - 2);
            this.dniProtegido = "******" + ultimosDos;
        } else {
            this.dniProtegido = "NO_REGISTRADO";
        }
    }
}