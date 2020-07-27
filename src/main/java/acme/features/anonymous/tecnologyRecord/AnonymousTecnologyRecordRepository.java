
package acme.features.anonymous.tecnologyRecord;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.records.TecnologyRecord;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousTecnologyRecordRepository extends AbstractRepository {

	@Query("select tr from TecnologyRecord tr")
	Collection<TecnologyRecord> findMany();

	@Query("select tr from TecnologyRecord tr where tr.id = ?1")
	TecnologyRecord findOneById(int id);

}
