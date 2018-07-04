$( document ).ready(function() {
	$("#uploadVehical").submit(function(event){
		event.preventDefault();
		uploadVehical();
	});
	
	// UPLOADING VEHICAL FROM USER SIDE
	function uploadVehical(){
		
		var vehicalData = {
				title : $("#title").val(),
				brand: $("#brand").val(),
				type : $("#vehicalType").val(),
				yearModel : $("#vehicalYearModel").val(),
				state : $("#vehicalState").val(),
				price : $("#vehicalPrice").val(),
				provice : $("#ownerProvince").val(),
				ownerPhoneNumber : $("#ownerContactno").val(),
				description :$("#description").val(),
				fuel : $("#vehicalUsingFuel").val(),
				KMDriven : $("#kmDriven").val(),
				ownerAddress : $("#ownerAddress").val(),
				madeOfCountry : $("#madeOfCountry").val(),
				noOfSets : $("#noOfSets").val(),
				insuranceExpireDate : $("#insuranceExpireDate").val(),
				priceMonetaryUnit : $("#monetaryUnit").val(),
				color : $("#vehicalColor").val(),
				image1 : $("#firstPhoto").val(),
				image2 : $("#secondPhoto").val(),
				image3 : $("#thirdPhoto").val(),
				image4 : $("#forthPhoto").val(),
				image5 : $("#fifthPhoto").val()
		}
		$.ajax({
			type : "POST",
			contentType : "application/json",
			url : "/vehicals/uploadVehical",
			data : JSON.stringify(vehicalData),
			dataType : 'json',
			success : function(result){
				if(result.message != null){
					alert("your vehical is uploaded successfully");
					$("#resultMessage").html("your vehical is uploaded successfully");
					}
				},
			error : function(e){
				$("#resultMessage").html("You have error! Please enter proper data");
			}
		});
		resetVehicalUploadData();
	}
	function resetVehicalUploadData(){
		title : $("#title").val("");
	brand: $("#brand").val("Select vehicalbrand");
	type : $("#vehicalType").val("Vehical type");
	yearModel : $("#vehicalYearModel").val("");
	state : $("#vehicalState").val("");
	price : $("#vehicalPrice").val("");
	provice : $("#ownerProvince").val("Select provice");
	ownerPhoneNumber : $("#ownerContactno").val("");
	description :$("#description").val("");
	fuel : $("#vehicalUsingFuel").val("");
	KMDriven : $("#kmDriven").val("");
	ownerAddress : $("#ownerAddress").val("");
	madeOfCountry : $("#madeOfCountry").val("");
	noOfSets : $("#noOfSets").val("");
	insuranceExpireDate : $("#insuranceExpireDate").val("");
	priceMonetaryUnit : $("#monetaryUnit").val("");
	color : $("#vehicalColor").val("");
	image1 : $("#firstPhoto").val();
	image2 : $("#secondPhoto").val();
	image3 : $("#thirdPhoto").val();
	image4 : $("#forthPhoto").val();
	image5 : $("#fifthPhoto").val();
	}
	
})