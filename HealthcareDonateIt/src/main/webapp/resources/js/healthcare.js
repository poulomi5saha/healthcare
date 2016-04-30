$(document).ready(function(){
	
	$('.saveDonorButton').click(function(){
		var donorName = $('input[id=name]').val();
		var bloodGroup = $('input[id=bloodGroup]').val();
		var contactNo = $('input[id=phone]').val();
		var email = $('input[id=email]').val();
		var password = $('input[id=password]').val();
		var address = $('input[id=autocomplete]').val();
		var streetAddress = $('input[id=street_number]').val(); + " " + $('input[id=route]').val();
		var state = $('input[id=administrative_area_level_1]').val();
		var city = $('input[id=locality]').val();
		var zipcode = $('input[id=postal_code]').val();
		var country = $('input[id=country]').val();
		var data = {donorName:donorName,bloodGroup:bloodGroup,contactNo:contactNo,email:email,password:password,address:address,
				streetAddress:streetAddress,state:state,city:city,zipcode:zipcode,country:country};
		$.ajax({
			url:'saveDonor',
			type:'post',
			data:JSON.stringify(data),
			dataType:'json',
			contentType:'application/json',
			success:function(responseData){
				console.log(responseData);
				$('#donorTableId tbody').empty();
				$('#donorTableId tbody').append('<tr><td data-th="Name">'+responseData.donorName+'</td><td data-th="Blood Group">'+responseData.bloodGroup+'</td><td data-th="Area">'+responseData.city+'</td><td data-th="Contact No">'+responseData.contactNo+'</td><td data-th="View"><img src="resources/images/view-icon.png" width="35%"/></td><td data-th="Edit"><img src="resources/images/edit-icon.png" width="35%"/></td><td data-th="Delete"><img src="resources/images/delete-icon.png" width="25%"/></td></tr>');
				$.magnificPopup.instance.close();
			}
		})
	})
	
	$('.saveRequestButton').click(function(){
		var patientName = $('input[id=name]').val();
		var bloodGroup = $('input[id=bloodGroup]').val();
		var units = $('input[id=units]').val();
		var donationDate = $('input[id=date]').val();
		var contactNo = $('input[id=phone]').val();
		var email = $('input[id=email]').val();
		var password = $('input[id=password]').val();
		var hospitalName = $('input[id=hospitalName]').val();
		var address = $('input[id=autocomplete2]').val();
		var streetAddress = $('input[id=street_number]').val(); + " " + $('input[id=route]').val();
		var state = $('input[id=administrative_area_level_1]').val();
		var city = $('input[id=locality]').val();
		var zipcode = $('input[id=postal_code]').val();
		var country = $('input[id=country]').val();
		var data = {patientName:patientName,bloodGroup:bloodGroup,units:units,donationDate:donationDate,contactNo:contactNo,email:email,password:password,
				hospitalName:hospitalName,address:address,streetAddress:streetAddress,state:state,city:city,zipcode:zipcode,country:country};
		$.ajax({
			url:'saveBloodRequest',
			type:'post',
			data:JSON.stringify(data),
			dataType:'json',
			contentType:'application/json',
			success:function(responseData){
				console.log(responseData);
				$('#bloodRequestTableId tbody').empty();
				$('#bloodRequestTableId tbody').append('<tr><td data-th="Name">'+responseData.patientName+'</td><td data-th="Blood Group">'+responseData.bloodGroup+'</td><td data-th="Area">'+responseData.city+'</td><td data-th="Contact No">'+responseData.contactNo+'</td><td data-th="Units">'+responseData.units+'</td><td data-th="Date">'+responseData.donationDate+'</td><td data-th="View"><img src="resources/images/view-icon.png" width="35%"/></td><td data-th="Edit"><img src="resources/images/edit-icon.png" width="35%"/></td><td data-th="Delete"><img src="resources/images/delete-icon.png" width="25%"/></td></tr>');
				$.magnificPopup.instance.close();
			}
		})
	})
});