<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<h2>Regular Donor List</h2>
      <table id="donorTableId">
		<thead>
			<tr>
				<th><strong>Name</strong></th>
				<th><strong>Blood Group</strong></th>
				<th><strong>Area</strong></th>
				<th><strong>Contact No</strong></th>
				<th><strong>View</strong></th>
				<th><strong>Edit</strong></th>
				<th><strong>Delete</strong></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="listValue" items="${healthcareDonorDTOList}" varStatus="status">
				<tr>
					<td data-th="Name">${listValue.donorName }</td>
					<td data-th="Blood Group"><c:out value="${listValue.bloodGroup }"/></td>
					<td data-th="Area"><c:out value="${listValue.state }"/>-<c:out value="${listValue.city}"/></td>
					<td data-th="Contact No"><c:out value="${listValue.contactNo }"/></td>
					<td data-th="View"><img src='<c:url value="/resources/images/view-icon.png"/>' width="35%"/></td>
					<td data-th="Edit"><img src='<c:url value="/resources/images/edit-icon.png"/>' width="35%"/></td>
					<td data-th="Delete"><img src='<c:url value="/resources/images/delete-icon.png"/>' width="25%"/></td>
				</tr>
			</c:forEach>
			
			<%-- <tr>
				<td data-th="Name">Poulomi Saha Poulomi Saha</td>
				<td data-th="Blood Group">O+</td>
				<td data-th="Area">Kolkata</td>
				<td data-th="Contact No">+919874795701</td>
				<td data-th="View"><img src='<c:url value="/resources/images/view-icon.png"/>' width="35%"/></td>
				<td data-th="Edit"><img src='<c:url value="/resources/images/edit-icon.png"/>' width="35%"/></td>
				<td data-th="Delete"><img src='<c:url value="/resources/images/delete-icon.png"/>' width="25%"/></td>
			</tr>
			<tr>
				<td data-th="Name">Poulomi Saha Poulomi Saha Poulomi Saha</td>
				<td data-th="Blood Group">O+</td>
				<td data-th="Area">Kolkata</td>
				<td data-th="Contact No">+919874795701</td>
				<td data-th="View"><img src='<c:url value="/resources/images/view-icon.png"/>' width="35%"/></td>
				<td data-th="Edit"><img src='<c:url value="/resources/images/edit-icon.png"/>' width="35%"/></td>
				<td data-th="Delete"><img src='<c:url value="/resources/images/delete-icon.png"/>' width="25%"/></td>
			</tr> --%>
		</tbody>
		</table>
		<div class="addDonorButtonDiv">
			<a href="#addDonorForm" class="addDonorButton popup-with-form">Add Donor</a>		
		</div>