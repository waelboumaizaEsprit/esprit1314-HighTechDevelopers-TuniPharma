/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.entities;

/**
 *
 * @author wael.boumaiza
 */
public class Patient {
    private int idPatient;
    private String nomPatient;
    private String prenomPatient;

    public Patient() {
    }

    public int getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
    }

    public String getNomPatient() {
        return nomPatient;
    }

    public void setNomPatient(String nomPatient) {
        this.nomPatient = nomPatient;
    }

    public String getPrenomPatient() {
        return prenomPatient;
    }

    public void setPrenomPatient(String prenomPatient) {
        this.prenomPatient = prenomPatient;
    }
    
    
}
