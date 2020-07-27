
package acme.features.authenticated.tecnologyRecord;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.records.TecnologyRecord;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Authenticated;

@Controller
@RequestMapping("/authenticated/tecnology-record/")
public class AuthenticatedTecnologyRecordController extends AbstractController<Authenticated, TecnologyRecord> {

	// Internal state -----------------------------------------------------------------------

	@Autowired
	private AuthenticatedTecnologyRecordListService	listService;

	@Autowired
	private AuthenticatedTecnologyRecordShowService	showService;


	// Constructors -------------------------------------------------------------------------

	@PostConstruct
	private void inicialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.SHOW, this.showService);
	}

}
