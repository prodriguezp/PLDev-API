package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import entities.Proyecto;
import entities.Social;

@Repository
public interface SocialRepository extends JpaRepository<Social, Long>{
	
}
