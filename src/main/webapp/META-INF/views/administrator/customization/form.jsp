
<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form readonly="true">
	<acme:form-textarea code="administrator.customization.form.label.spam-words" path="spamWords" />
	<acme:form-textbox code="administrator.customization.form.label.threshold" path="threshold" />
	<acme:form-textarea code="administrator.customization.form.label.activity-sectors" path="activitySectors" />
		
  	<acme:form-return code="administrator.customization.form.button.return"/>
</acme:form>
