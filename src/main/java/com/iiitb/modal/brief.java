package com.iiitb.modal;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class brief {
	@Id
	int ADBS_ID;
	
	int Assessment_ID;
	String D_no;
	int Family_no;
	int p_no;
	String p_name;
	Date date_of_consent;
	String index_cohort;
	String lab_group;
	String remarks;
	Date date_of_assessment;
	String Assessed_by;
	String psw;
	String pdf;
	String consultant_incharge;
	Boolean sociodemography;
	Boolean HOPI;
	Boolean Developmental;
	Boolean physical_exam;
	Boolean MSE;
	Boolean Life_chart;
	Boolean Treatment;
	Boolean DSM5CC;
	Boolean Pedigree;
	Boolean FIGS;
	Boolean MINI;
	Boolean ASRS;
	Boolean HMSE;
	Boolean CGI_S;
	String Document_verified_by_PDF;
	Date Date_verified_by_pdf;
	String Document_verified_by_cohort;
	String Date_verified_by_cohort;
	String Comments;
	String Updated_verification_by;
	Date Update_verification_date;
	
	
	public int getADBS_ID() {
		return ADBS_ID;
	}

	public void setADBS_ID(int aDBS_ID) {
		ADBS_ID = aDBS_ID;
	}

	public int getAssessment_ID() {
		return Assessment_ID;
	}

	public void setAssessment_ID(int assessment_ID) {
		Assessment_ID = assessment_ID;
	}

	public String getD_no() {
		return D_no;
	}

	public void setD_no(String d_no) {
		D_no = d_no;
	}

	public int getFamily_no() {
		return Family_no;
	}

	public void setFamily_no(int family_no) {
		Family_no = family_no;
	}

	public int getP_no() {
		return p_no;
	}

	public void setP_no(int p_no) {
		this.p_no = p_no;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public Date getDate_of_consent() {
		return date_of_consent;
	}

	public void setDate_of_consent(Date date_of_consent) {
		this.date_of_consent = date_of_consent;
	}

	public String getIndex_cohort() {
		return index_cohort;
	}

	public void setIndex_cohort(String index_cohort) {
		this.index_cohort = index_cohort;
	}

	public String getLab_group() {
		return lab_group;
	}

	public void setLab_group(String lab_group) {
		this.lab_group = lab_group;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Date getDate_of_assessment() {
		return date_of_assessment;
	}

	public void setDate_of_assessment(Date date_of_assessment) {
		this.date_of_assessment = date_of_assessment;
	}

	public String getAssessed_by() {
		return Assessed_by;
	}

	public void setAssessed_by(String assessed_by) {
		Assessed_by = assessed_by;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	public String getPdf() {
		return pdf;
	}

	public void setPdf(String pdf) {
		this.pdf = pdf;
	}

	public String getConsultant_incharge() {
		return consultant_incharge;
	}

	public void setConsultant_incharge(String consultant_incharge) {
		this.consultant_incharge = consultant_incharge;
	}

	public Boolean getSociodemography() {
		return sociodemography;
	}

	public void setSociodemography(Boolean sociodemography) {
		this.sociodemography = sociodemography;
	}

	public Boolean getHOPI() {
		return HOPI;
	}

	public void setHOPI(Boolean hOPI) {
		HOPI = hOPI;
	}

	public Boolean getDevelopmental() {
		return Developmental;
	}

	public void setDevelopmental(Boolean developmental) {
		Developmental = developmental;
	}

	public Boolean getPhysical_exam() {
		return physical_exam;
	}

	public void setPhysical_exam(Boolean physical_exam) {
		this.physical_exam = physical_exam;
	}

	public Boolean getMSE() {
		return MSE;
	}

	public void setMSE(Boolean mSE) {
		MSE = mSE;
	}

	public Boolean getLife_chart() {
		return Life_chart;
	}

	public void setLife_chart(Boolean life_chart) {
		Life_chart = life_chart;
	}

	public Boolean getTreatment() {
		return Treatment;
	}

	public void setTreatment(Boolean treatment) {
		Treatment = treatment;
	}

	public Boolean getDSM5CC() {
		return DSM5CC;
	}

	public void setDSM5CC(Boolean dSM5CC) {
		DSM5CC = dSM5CC;
	}

	public Boolean getPedigree() {
		return Pedigree;
	}

	public void setPedigree(Boolean pedigree) {
		Pedigree = pedigree;
	}

	public Boolean getFIGS() {
		return FIGS;
	}

	public void setFIGS(Boolean fIGS) {
		FIGS = fIGS;
	}

	public Boolean getMINI() {
		return MINI;
	}

	public void setMINI(Boolean mINI) {
		MINI = mINI;
	}

	public Boolean getASRS() {
		return ASRS;
	}

	public void setASRS(Boolean aSRS) {
		ASRS = aSRS;
	}

	public Boolean getHMSE() {
		return HMSE;
	}

	public void setHMSE(Boolean hMSE) {
		HMSE = hMSE;
	}

	public Boolean getCGI_S() {
		return CGI_S;
	}

	public void setCGI_S(Boolean cGI_S) {
		CGI_S = cGI_S;
	}

	public String getDocument_verified_by_PDF() {
		return Document_verified_by_PDF;
	}

	public void setDocument_verified_by_PDF(String document_verified_by_PDF) {
		Document_verified_by_PDF = document_verified_by_PDF;
	}

	public Date getDate_verified_by_pdf() {
		return Date_verified_by_pdf;
	}

	public void setDate_verified_by_pdf(Date date_verified_by_pdf) {
		Date_verified_by_pdf = date_verified_by_pdf;
	}

	public String getDocument_verified_by_cohort() {
		return Document_verified_by_cohort;
	}

	public void setDocument_verified_by_cohort(String document_verified_by_cohort) {
		Document_verified_by_cohort = document_verified_by_cohort;
	}

	public String getDate_verified_by_cohort() {
		return Date_verified_by_cohort;
	}

	public void setDate_verified_by_cohort(String date_verified_by_cohort) {
		Date_verified_by_cohort = date_verified_by_cohort;
	}

	public String getComments() {
		return Comments;
	}

	public void setComments(String comments) {
		Comments = comments;
	}

	public String getUpdated_verification_by() {
		return Updated_verification_by;
	}

	public void setUpdated_verification_by(String updated_verification_by) {
		Updated_verification_by = updated_verification_by;
	}

	public Date getUpdate_verification_date() {
		return Update_verification_date;
	}

	public void setUpdate_verification_date(Date update_verification_date) {
		Update_verification_date = update_verification_date;
	}
	
}
