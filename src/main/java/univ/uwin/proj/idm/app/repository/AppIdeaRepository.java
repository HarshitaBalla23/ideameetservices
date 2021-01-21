package univ.uwin.proj.idm.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import univ.uwin.proj.idm.app.model.AppIdea;

@Repository
public interface AppIdeaRepository extends JpaRepository<AppIdea, Long> {

}
