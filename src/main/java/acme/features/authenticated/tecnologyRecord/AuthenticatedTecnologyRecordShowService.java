
package acme.features.authenticated.tecnologyRecord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.records.TecnologyRecord;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Authenticated;
import acme.framework.services.AbstractShowService;

@Service
public class AuthenticatedTecnologyRecordShowService implements AbstractShowService<Authenticated, TecnologyRecord> {

	// Internal state -----------------------------------------------------------

	@Autowired
	AuthenticatedTecnologyRecordRepository repository;

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
	public TecnologyRecord findOne(final Request<TecnologyRecord> request) {
		assert request != null;

		TecnologyRecord res;
		int id;

		id = request.getModel().getInteger("id");
		res = this.repository.findOneById(id);
		return res;
	}

}
