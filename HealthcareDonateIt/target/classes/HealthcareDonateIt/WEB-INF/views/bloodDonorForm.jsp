<div class="addDonorFormDiv">
		<!-- form itself -->
		<form id="addDonorForm" class="white-popup-block mfp-hide">
			<h1>Add as a donor</h1>
			<fieldset style="border:0;">
				<ol>
					<li>
						<input id="name" name="name" type="text" placeholder="Name" required="">
					</li>
					<li>
						<input id="email" name="email" type="email" placeholder="example@domain.com" required="">
					</li>
					<li>
						<input id="phone" name="phone" type="tel" placeholder="Eg. +447500000000" required="">
					</li>
					<li>
						<input id="password" name="password" type="password" placeholder="Password" required="">
					</li>
					<li>
						<input id="bloodGroup" name="bloodGroup" type="text" placeholder="Blood Group" required="">
					</li>
					<li>
						<input id="autocomplete" placeholder="Enter your address" onFocus="geolocate()" type="text"></input>
					</li>
					<li>
						<input class="field" id="street_number" disabled="true" type="text" placeholder="Street Address"></input>
						<input class="field" id="route" disabled="true" type="text" placeholder="Street Address"></input>
					</li>
					<li>
						<input class="field" id="locality" disabled="true" type="text" placeholder="City"></input>
					</li>
					<li>
						<input class="field" id="administrative_area_level_1" disabled="true" type="text" placeholder="State"></input>
					</li>
					<li>
						<input class="field" id="postal_code" disabled="true" type="text" placeholder="Zip code"></input>
					</li>
					<li>
						<input class="field" id="country" disabled="true" type="text" placeholder="Country"></input>
					</li>
				</ol>
				<div class="saveDonorButtonDiv">
					<a href="javascript:void(0);" class="saveDonorButton">Save</a>		
				</div>
			</fieldset>

    
		</form>
	</div>