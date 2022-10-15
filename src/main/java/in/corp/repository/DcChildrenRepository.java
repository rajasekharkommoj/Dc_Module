package in.corp.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.corp.entity.DcChildrenEntity;

public interface DcChildrenRepository extends JpaRepository<DcChildrenEntity, Serializable> {

}
