/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tunipharma.entities;

/**
 *
 * @author sahar
 */
public class Pharmacien {
    private String id_pharmacien;
    private String nom_pharmacien;
    private String prenom_pharmacien;
    private Number num_telPharmacien;
    private String addresse_pharmacien;

    public String getId_pharmacien() {
        return id_pharmacien;
    }

    public void setId_pharmacien(String id_pharmacien) {
        this.id_pharmacien = id_pharmacien;
    }

    public String getNom_pharmacien() {
        return nom_pharmacien;
    }

    public void setNom_pharmacien(String nom_pharmacien) {
        this.nom_pharmacien = nom_pharmacien;
    }

    public String getPrenom_pharmacien() {
        return prenom_pharmacien;
    }

    public void setPrenom_pharmacien(String prenom_pharmacien) {
        this.prenom_pharmacien = prenom_pharmacien;
    }

    public Number getNum_telPharmacien() {
        return num_telPharmacien;
    }

    public void setNum_telPharmacien(Number num_telPharmacien) {
        this.num_telPharmacien = num_telPharmacien;
    }

    public String getAddresse_pharmacien() {
        return addresse_pharmacien;
    }

    public void setAddresse_pharmacien(String addresse_pharmacien) {
        this.addresse_pharmacien = addresse_pharmacien;
    }
    
    
}
