package de.michlb.sample.DTO;

import de.michlb.sample.domain.Prof;
import de.michlb.sample.domain.Takelesson;

import java.util.List;

/**
 * Created by Sam on 5/11/2017.
 */
public class ProfDTO {



    private Integer profID;
    private String profName;
    private String profPassword;
    private String profField;
    private String profDegree;
    private List<Takelesson> takelessonList;


    public ProfDTO() {
    }


    public void Transform ( Prof C )
    {
        this.profID = C.getProfID() ;
        this.profName = C.getProfName() ;
        this.profPassword = C.getProfPassword() ;
        this.profField = C.getProfField() ;
        this.profDegree = C.getProfDegree() ;
    }

    public Integer getProfID() {
        return profID;
    }

    public void setProfID(Integer profID) {
        this.profID = profID;
    }

    public String getProfName() {
        return profName;
    }

    public void setProfName(String profName) {
        this.profName = profName;
    }

    public String getProfPassword() {
        return profPassword;
    }

    public void setProfPassword(String profPassword) {
        this.profPassword = profPassword;
    }

    public String getProfField() {
        return profField;
    }

    public void setProfField(String profField) {
        this.profField = profField;
    }

    public String getProfDegree() {
        return profDegree;
    }

    public void setProfDegree(String profDegree) {
        this.profDegree = profDegree;
    }

    public List<Takelesson> getTakelessonList() {
        return takelessonList;
    }

    public void setTakelessonList(List<Takelesson> takelessonList) {
        this.takelessonList = takelessonList;
    }
}
