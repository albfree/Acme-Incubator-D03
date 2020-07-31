
package acme.features.administrator.tecnologyRecord;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.records.TecnologyRecord;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Administrator;

@Controller
@RequestMapping("/administrator/tecnology-record/")
public class AdministratorTecnologyRecordController extends AbstractController<Administrator, TecnologyRecord> {

	// Internal state -----------------------------------------------------------------------

	@Autowired
	private AdministratorTecnologyRecordListService		listService;

	@Autowired
	private AdministratorTecnologyRecordShowService		showService;

	@Autowired
	private AdministratorTecnologyRecordCreateService	createService;

	@Autowired
	private AdministratorTecnologyRecordUpdateService	updateService;

	@Autowired
	private AdministratorTecnologyRecordDeleteService	deleteService;


	// Constructors -------------------------------------------------------------------------

	@PostConstruct
	private void inicialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.SHOW, this.showService);
		super.addBasicCommand(BasicCommand.CREATE, this.createService);
		super.addBasicCommand(BasicCommand.UPDATE, this.updateService);
		super.addBasicCommand(BasicCommand.DELETE, this.deleteService);

	}

}
