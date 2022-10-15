package in.corp.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.corp.entity.DcCasesEntity;

public interface DcCasesRepository extends JpaRepository<DcCasesEntity, Serializable> {

}
