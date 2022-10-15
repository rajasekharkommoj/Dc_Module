package in.corp.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name = "DC_CASES")
public class DcCasesEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer caseId;
	private Integer caseNumber;
	private Integer appId;
	private Integer planId;
	@CreationTimestamp
	private LocalDate createdDate;
	@UpdateTimestamp
	private LocalDate updatedDate;
	private String createdBy;
	private String updatedBy;

}
