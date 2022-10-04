package org.example.strings.oop_excercises_SDA.department;

public enum Department {
 HR(1),
 BRANDING(2),
 SALES(3),
 MARKETING(4),
 ADMINISTRATION(5),
 HEAD(6),
 IT(7),
 UNKNOWN(8);


 final int DEPARTMENT_ID;

 Department(int departmentId) {
  this.DEPARTMENT_ID = departmentId;
 }

 public int getDEPARTMENT_ID() {
  return DEPARTMENT_ID;
 }
}
