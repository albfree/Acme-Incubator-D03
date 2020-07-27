<%--
- form.jsp
-
- Copyright (c) 2019 Rafael Corchuelo.
-
- In keeping with the traditional purpose of furthering education and research, it is
- the policy of the copyright owner to permit non-commercial use and redistribution of
- this software. It has been tested carefully, but it is not guaranteed for any particular
- purposes.  The copyright owner does not offer any warranties or representations, nor do
- they accept any liabilities with respect to them.
--%>

<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="anonymous.tool-record.list.label.title" path="title" />
	<acme:form-textbox code="anonymous.tool-record.list.label.activitySector" path="activitySector" />
	<acme:form-textbox code="anonymous.tool-record.list.label.inventorsName" path="inventorsName" />	
	<acme:form-textarea code="anonymous.tool-record.list.label.description" path="description" />
	<acme:form-url code="anonymous.tool-record.list.label.website" path="website" />
	<acme:form-textbox code="anonymous.tool-record.list.label.email" path="email" />	
	<acme:form-textbox code="anonymous.tool-record.list.label.indicator" path="indicator" />
	<acme:form-textbox code="anonymous.tool-record.list.label.starsRate" path="starsRate" />

</acme:form>
