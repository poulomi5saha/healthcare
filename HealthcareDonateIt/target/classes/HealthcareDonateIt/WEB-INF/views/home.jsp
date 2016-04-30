<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
  	<%@ page isELIgnored="false" %>
    <meta charset="utf-8">
    <title>Healthcare Donate It!</title>
    <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1"">
    <link rel="shortcut icon" href='<c:url value="/resources/icons/favicon.ico"/>' type="image/x-icon">
	<link rel="icon" href='<c:url value="/resources/icons/favicon.ico"/>' type="image/x-icon">    
    <link rel="stylesheet" href='<c:url value="/resources/css/styles.css"/>'>
	<link href="http://www.jqueryscript.net/css/jquerysctipttop.css" rel="stylesheet" type="text/css">
	<link rel="stylesheet" type="text/css" href='<c:url value="/resources/css/demo.css"/>'>
    <link rel="stylesheet" type="text/css" href='<c:url value="/resources/css/jquery.accordion.css"/>'>
    <link rel="stylesheet" href='<c:url value="/resources/css/magnific-popup.css"/>'>
	<link type="text/css" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500">    
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
      <link rel="stylesheet" href="css/ie.css">
    <![endif]-->
    <script src='<c:url value="/resources/js/responsive-nav.js"/>'></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script> 
	<script type="text/javascript" src='<c:url value="/resources/js/jquery.accordion.js"/>'></script>
	<script src='<c:url value="/resources/js/jquery.magnific-popup.min.js"/>'></script>
	<script src='<c:url value="/resources/js/jquery.magnific-popup.js"/>'></script>
	<script src='<c:url value="/resources/js/healthcare.js"/>'></script>
	<script>
	$(document).ready(function() {	
		$('#only-one [data-accordion]').accordion();
		
		$('.popup-with-form').magnificPopup({
			type: 'inline',
			preloader: false,
			focus: '#name',

			// When elemened is focused, some mobile browsers in some cases zoom in
			// It looks not nice, so we disable it:
			callbacks: {
				beforeOpen: function() {
					if($(window).width() < 700) {
						this.st.focus = false;
					} else {
						this.st.focus = '#name';
					}
				}
			}
			});			
	});
	</script> 
  </head>
  <body>

    <header>
      <a href="#bloodDonate" class="logo" data-scroll><img src='<c:url value="/resources/images/logo.png"/>' width="22%"/></a>
      <nav class="nav-collapse">
        <ul>
          <li class="menu-item active"><a href="#bloodDonate" data-scroll>Blood Donation</a></li>
		  <li class="menu-item"><a href="#ambulance" data-scroll>Ambulance</a></li>
          <li class="menu-item"><a href="#fundDonate" data-scroll>Fund Donation</a></li>          
        </ul>
      </nav>
    </header>

    <section id="bloodDonate">
      <h1>Blood Donation</h1>
	  <jsp:include page="/WEB-INF/views/bloodDonorList.jsp" />
		<jsp:include page="/WEB-INF/views/bloodRequestList.jsp" />
    </section>

	<section id="ambulance">
		 <h1>Get an ambulance</h1>
		 
    </section>
	
    <section id="fundDonate">
      <h1>Fund Donation</h1>
		
    </section>  	
	
	<jsp:include page="/WEB-INF/views/loginForm.jsp" />
	<jsp:include page="/WEB-INF/views/bloodDonorForm.jsp" />
	<jsp:include page="/WEB-INF/views/bloodRequestForm.jsp" />
	
    <script src='<c:url value="/resources/js/fastclick.js"/>'></script>
    <script src='<c:url value="/resources/js/scroll.js"/>'></script>
    <script src='<c:url value="/resources/js/fixed-responsive-nav.js"/>'></script>
    <script>
		var placeSearch, autocomplete, autocomplete2;
      var componentForm = {
        street_number: 'short_name',
        route: 'long_name',
        locality: 'long_name',
        administrative_area_level_1: 'short_name',
        country: 'long_name',
        postal_code: 'short_name'
      };

      function initAutocomplete() {
        // Create the autocomplete object, restricting the search to geographical
        // location types.
        autocomplete = new google.maps.places.Autocomplete(
            /** @type {!HTMLInputElement} */(document.getElementById('autocomplete')),
            {types: ['geocode']});
        autocomplete2 = new google.maps.places.Autocomplete(
                /** @type {!HTMLInputElement} */(document.getElementById('autocomplete2')),
                {types: ['geocode']});
        // When the user selects an address from the dropdown, populate the address
        // fields in the form.
        autocomplete.addListener('place_changed', fillInAddress);
        autocomplete2.addListener('place_changed', fillInAddress);
      }

      function fillInAddress() {
        // Get the place details from the autocomplete object.
        var place = autocomplete.getPlace();
        var place2 = autocomplete2.getPlace();
		
        for (var component in componentForm) {
          document.getElementById(component).value = '';
          document.getElementById(component).disabled = false;
        }

        // Get each component of the address from the place details
        // and fill the corresponding field on the form.
        if(place != undefined){
            for (var i = 0; i < place.address_components.length; i++) {
                var addressType = place.address_components[i].types[0];
                if (componentForm[addressType]) {
                  var val = place.address_components[i][componentForm[addressType]];
                  document.getElementById(addressType).value = val;
                }
              }
        }
        else{
            for (var i = 0; i < place2.address_components.length; i++) {
                var addressType = place2.address_components[i].types[0];
                if (componentForm[addressType]) {
                  var val = place2.address_components[i][componentForm[addressType]];
                  document.getElementById(addressType).value = val;
                }
              }
        }
      }

      // Bias the autocomplete object to the user's geographical location,
      // as supplied by the browser's 'navigator.geolocation' object.
      function geolocate() {
        if (navigator.geolocation) {
          navigator.geolocation.getCurrentPosition(function(position) {
            var geolocation = {
              lat: position.coords.latitude,
              lng: position.coords.longitude
            };
            var circle = new google.maps.Circle({
              center: geolocation,
              radius: position.coords.accuracy
            });
            autocomplete.setBounds(circle.getBounds());
            autocomplete2.setBounds(circle.getBounds());
          });
        }
      }
	</script>
	<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDfVUzzpGDHEOoWKVHYIE5nzdBB-XklqT8&libraries=places&callback=initAutocomplete"async defer></script>
	
  </body>
</html>
