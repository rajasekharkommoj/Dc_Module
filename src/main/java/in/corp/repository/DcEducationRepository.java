package in.corp.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.corp.entity.DcEducationEntity;

public interface DcEducationRepository extends JpaRepository<DcEducationEntity,Serializable> {

}
