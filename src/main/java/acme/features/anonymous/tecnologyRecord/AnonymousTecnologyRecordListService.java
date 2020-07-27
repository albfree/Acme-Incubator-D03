
package acme.features.anonymous.tecnologyRecord;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.records.TecnologyRecord;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousTecnologyRecordListService implements AbstractListService<Anonymous, TecnologyRecord> {

	// Internal state -----------------------------------------------------------

	@Autowired
	AnonymousTecnologyRecordRepository repository;

	// AbstractListService<Administrator, TecnologyRecord>


	@Override
	public boolean authorise(final Request<TecnologyRecord> request) {
		assert request != null;
		return true;
	}

	@Override
	public void unbind(final Request<TecnologyRecord> request, final TecnologyRecord entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "title", "activitySector", "inventorsName", "description", "website", "email", "indicator", "starsRate");
	}

	@Override
	public Collection<TecnologyRecord> findMany(final Request<TecnologyRecord> request) {
		assert request != null;

		Collection<TecnologyRecord> res;
		res = this.repository.findMany();
		return res;
	}

}
