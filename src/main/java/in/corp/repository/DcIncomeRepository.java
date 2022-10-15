package in.corp.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.corp.entity.DcIncomeEntity;

public interface DcIncomeRepository extends JpaRepository<DcIncomeEntity, Serializable> {

}
