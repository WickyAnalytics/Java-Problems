/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elml3b;

/**
 *
 * @author Lenovo
 */
public class Field {
    private int Field_ID;
    private String Field_Name;
    private Boolean Field_Status;

    public int getField_ID() {
        return Field_ID;
    }

    public void setField_ID(int Field_ID) {
        this.Field_ID = Field_ID;
    }

    public Field(int Field_ID, String Field_Name, Boolean Field_Status) {
        this.Field_ID = Field_ID;
        this.Field_Name = Field_Name;
        this.Field_Status = Field_Status;
    }

    public boolean FieldState(Boolean Field_Status) {

        int i = 0;

        while (i < 10) {
            i++;
            return true;

        }

        return false;
    }
}
