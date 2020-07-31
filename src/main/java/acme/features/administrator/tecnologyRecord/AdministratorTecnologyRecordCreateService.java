
package acme.features.administrator.tecnologyRecord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.records.TecnologyRecord;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Administrator;
import acme.framework.services.AbstractCreateService;

@Service
public class AdministratorTecnologyRecordCreateService implements AbstractCreateService<Administrator, TecnologyRecord> {

	// Internal state -----------------------------------------------------------

	@Autowired
	AdministratorTecnologyRecordRepository repository;

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
	public void bind(final Request<TecnologyRecord> request, final TecnologyRecord entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);

	}

	@Override
	public TecnologyRecord instantiate(final Request<TecnologyRecord> request) {
		assert request != null;
		TecnologyRecord res;
		res = new TecnologyRecord();
		return res;
	}

	@Override
	public void validate(final Request<TecnologyRecord> request, final TecnologyRecord entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

	}

	@Override
	public void create(final Request<TecnologyRecord> request, final TecnologyRecord entity) {
		assert request != null;
		assert entity != null;

		this.repository.save(entity);
	}

}
