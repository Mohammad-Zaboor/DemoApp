$( document ).ready(function() {
	$("#uploadVehical").submit(function(event){
		event.preventDefault();
		uploadItem();
	});
	
	// UPLOADING ITEM FROM 
	function uploadItem(){
		
		 var form = $('#uploadVehical')[0];
			var itemData=new FormData(form);
		$.ajax({
			type : "POST",
			url :  "/item/uploadItem",
			enctype: 'multipart/form-data',
			data : itemData,
			processData : false,
			cache : false,
			contentType : false,
			success : function(result) {
				if(result.message !=null){
				alert(result.message);
				//window.location.href = "/burkaFarkhar/mainPage1";
				}
				
			},
			error : function(e) {
				alert("Error! please enter proper data"),
				console.log();
			}
		});
	}
})