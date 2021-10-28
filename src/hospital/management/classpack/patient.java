/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital.management.classpack;

/**
 *
 * @author Hepzi
 */
public class patient {
    int patientid;
    String patientname;
    String patientdob;
    String patientaddress;
    String patientdoctors[]=new String[10];
    int patientphone;
    String patientfathername;
    String patientbloodgroup;
    float patientweight;
    int patientage;
    String patientgender;
    String patientguardian;

    public int getPatientid() {
        return patientid;
    }

    public void setPatientid(int patientid) {
        this.patientid = patientid;
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }

    public String getPatientdob() {
        return patientdob;
    }

    public void setPatientdob(String patientdob) {
        this.patientdob = patientdob;
    }

    public String getPatientaddress() {
        return patientaddress;
    }

    public void setPatientaddress(String patientaddress) {
        this.patientaddress = patientaddress;
    }

    public String[] getPatientdoctors() {
        return patientdoctors;
    }

    public void setPatientdoctors(String[] patientdoctors) {
        this.patientdoctors = patientdoctors;
    }

    public int getPatientphone() {
        return patientphone;
    }

    public void setPatientphone(int patientphone) {
        this.patientphone = patientphone;
    }

    public String getPatientfathername() {
        return patientfathername;
    }

    public void setPatientfathername(String patientfathername) {
        this.patientfathername = patientfathername;
    }

    public String getPatientbloodgroup() {
        return patientbloodgroup;
    }

    public void setPatientbloodgroup(String patientbloodgroup) {
        this.patientbloodgroup = patientbloodgroup;
    }

    public float getPatientweight() {
        return patientweight;
    }

    public void setPatientweight(float patientweight) {
        this.patientweight = patientweight;
    }

    public int getPatientage() {
        return patientage;
    }

    public void setPatientage(int patientage) {
        this.patientage = patientage;
    }

    public String getPatientgender() {
        return patientgender;
    }

    public void setPatientgender(String patientgender) {
        this.patientgender = patientgender;
    }

    public String getPatientguardian() {
        return patientguardian;
    }

    public void setPatientguardian(String patientguardian) {
        this.patientguardian = patientguardian;
    }

}
