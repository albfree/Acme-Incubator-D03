
package acme.features.anonymous.tecnologyRecord;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.records.TecnologyRecord;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Anonymous;

@Controller
@RequestMapping("/anonymous/tecnology-record/")
public class AnonymousTecnologyRecordController extends AbstractController<Anonymous, TecnologyRecord> {

	// Internal state -----------------------------------------------------------------------

	@Autowired
	private AnonymousTecnologyRecordListService	listService;

	@Autowired
	private AnonymousTecnologyRecordShowService	showService;


	// Constructors -------------------------------------------------------------------------

	@PostConstruct
	private void inicialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.SHOW, this.showService);
	}

}
