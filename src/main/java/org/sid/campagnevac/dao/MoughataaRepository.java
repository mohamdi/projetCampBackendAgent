package org.sid.campagnevac.dao;

import org.sid.campagnevac.entities.Moughataa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@RepositoryRestResource
@CrossOrigin("*")
public interface MoughataaRepository extends JpaRepository<Moughataa,Long> {

}
