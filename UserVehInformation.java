package com.example.databasetest;

class UserVehInformation
{
    String id;
    String    classofvehicle;
    String typeofbody1;
    String   makersname1;
    String    purpose;
    String   axeltype1;
    String noofcylinder1;
    String ownersname1;
    String Cc;
    String   chassisno1;
    String unladenweigh1;
    String color;
    String  fuel;
    String  engineno1;

    public UserVehInformation(String id, String classofvehicle, String typeofbody1, String makersname1, String purpose, String axeltype1, String noofcylinder1, String ownersname1, String cc, String chassisno1, String unladenweigh1, String color, String fuel, String engineno1) {
        this.id = id;
        this.classofvehicle = classofvehicle;
        this.typeofbody1 = typeofbody1;
        this.makersname1 = makersname1;
        this.purpose = purpose;
        this.axeltype1 = axeltype1;
        this.noofcylinder1 = noofcylinder1;
        this.ownersname1 = ownersname1;
        this.Cc = cc;
        this.chassisno1 = chassisno1;
        this.unladenweigh1 = unladenweigh1;
        this.color = color;
        this.fuel = fuel;
        this.engineno1 = engineno1;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassofvehicle() {
        return classofvehicle;
    }

    public void setClassofvehicle(String classofvehicle) {
        this.classofvehicle = classofvehicle;
    }

    public String getTypeofbody1() {
        return typeofbody1;
    }

    public void setTypeofbody1(String typeofbody1) {
        this.typeofbody1 = typeofbody1;
    }

    public String getMakersname1() {
        return makersname1;
    }

    public void setMakersname1(String makersname1) {
        this.makersname1 = makersname1;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getAxeltype1() {
        return axeltype1;
    }

    public void setAxeltype1(String axeltype1) {
        this.axeltype1 = axeltype1;
    }

    public String getNoofcylinder1() {
        return noofcylinder1;
    }

    public void setNoofcylinder1(String noofcylinder1) {
        this.noofcylinder1 = noofcylinder1;
    }

    public String getOwnersname1() {
        return ownersname1;
    }

    public void setOwnersname1(String ownersname1) {
        this.ownersname1 = ownersname1;
    }

    public String getCc() {
        return Cc;
    }

    public void setCc(String cc) {
        Cc = cc;
    }

    public String getChassisno1() {
        return chassisno1;
    }

    public void setChassisno1(String chassisno1) {
        this.chassisno1 = chassisno1;
    }

    public String getUnladenweigh1() {
        return unladenweigh1;
    }

    public void setUnladenweigh1(String unladenweigh1) {
        this.unladenweigh1 = unladenweigh1;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getEngineno1() {
        return engineno1;
    }

    public void setEngineno1(String engineno1) {
        this.engineno1 = engineno1;
    }
}
