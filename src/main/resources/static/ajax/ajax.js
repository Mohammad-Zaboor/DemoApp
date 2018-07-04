$( document ).ready(function() {
	// SUBMIT FORM
    $("#regesterationForm").submit(function(event) {
		// Prevent the form from submitting via the browser.
		event.preventDefault();
		ajaxPost();
	});
    
	// SUBMIT FORM
    $("#forgotMyPassword").submit(function(event) {
		// Prevent the form from submitting via the browser.
		event.preventDefault();
		ajaxForgotPassword();
	});
    
	// SUBMIT FORM
    $("#frm33").submit(function(event) {
		// Prevent the form from submitting via the browser.
		event.preventDefault();
		changeUserPassword()
	});
    
    // SUBMIT FORM FOR CHANGE USER EMAIL
    $("#frm22").submit(function(event){
    	event.preventDefault();
    	changeUserEmail();
    	
    });
    
    // SUBMIT FORM FOR CAHNGE USER CONTACT
    $("#frm").submit(function(event){
    	event.preventDefault();
    	changeUseContact();
    });
    
    //SUBMIT FORM FOR FEEDBACK
    $("#frm_fdback").submit(function(event){
    	event.preventDefault();
    	submitUserFeedback();
    });
    
    function ajaxPost(){
    	
    	// PREPARE FORM DATA
    	var userData = {
    		userFirstName : $("#userFirstName").val(),
    		userLastName :  $("#userLastName").val(),
    		provice :  $("#provice").val(),
    		userEmail :  $("#userEmail").val(),
    		userPhoneNumber :  $("#userPhoneNumber").val(),
    		userAddress  :  $("#userAddress").val(),
    		userPassword :  $("#userPassword").val()
    	}
    	
    	// DO POST 
    	$.ajax({
			type : "POST",
			contentType : "application/json",
			url :  "/burkaFarkhar/creatAccount",
			data : JSON.stringify(userData),
			dataType : 'json',
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
    	
    	// Reset FormData after Posting
    	resetUserData();
    }
    function resetUserData(){
    	$("#userFirstName").val("");
    	$("#userLastName").val("");
    	$("#userEmail").val("");
    	$("#userPhoneNumber").val("");
    	$("#userFirstName").val("");
    	$("#userAddress").val("");
    	$("#userPassword").val("");
    	$("#provice").val("Select City");
    }
    function ajaxForgotPassword(){
    	
    	// PREPARE FORM DATA
    	var usermessage = {
    			userEmail : $("#userEmail2").val()
        		
        	
    	}
    		
    	
    	// DO POST 
    	$.ajax({
			type : "POST",
			contentType : "application/json",
			url :  "/burkaFarkhar/forgotPassword",
			data : JSON.stringify(usermessage),
			dataType : 'json',
			success : function(result) {
				if(result.message !=null){
					alert(result.message);}
				
			},
			error : function(e) {
				alert("Error! Please enter proper data"),
				console.log();
			}
		});
    	//resetData();
    }
    
    function resetData(){
        // When the user clicks anywhere outside of the modal, close it
    	 $("#id01").remove();
       
    }
    
    function changeUserPassword(){
    	
    	// PREPARE FORM DATA FOR CHANGE PASSWORD
    	var userData = {
    		userFirstName : $("#newPass").val(),
    		confirmPassword: $("#confirmPass").val(),
    		userPassword :  $("#currentPass").val()
    	}
    	
    	// DO POST CHANGE PASSWORD
    	$.ajax({
			type : "POST",
			contentType : "application/json",
			url :  "/burkaFarkhar/userChangePassword",
			data : JSON.stringify(userData),
			dataType : 'json',
			success : function(result) {
				if(result.message !=null){
					$("#frm33").animate( {
			            height:'toggle'
	    				});
					alert(result.message);}
				
			},
			error : function(e) {
				alert("You have an Error! try again"),
				console.log();
			}
		});
    	
    	// Reset FormData after Posting
    	resetUserChangePassData();
 
    }
    function resetUserChangePassData(){
    	$("#newPass").val("");
    	$("#confirmPass").val("");
    	$("#currentPass").val("");
    }
    
    // FORM DATE FOR USER FEEDBACK
    function submitUserFeedback(){
    	
    	var userData = {
    		userEmail : $("#userEmailFeedbacku").val(),	
    		feedbackSubject : $("#fdbttn").val(),
    		feedbackText : $("#feedbackText").val()
    	}
    	// DO POST FOR USER FEEDBACK
    	$.ajax({
    		type : "POST",
			contentType : "application/json",
			url :  "/feedback/saveUserFeedback",
			data : JSON.stringify(userData),
			dataType : 'json',
    		success : function(result){
    			if(result.message !=null){
    				alert(result.message);}
    		},
    		error : function(e) {
				alert("You have an Error! try again"),
				console.log();
			}
    		
    	});
    	resetFeedbackData();
    }
    
    function resetFeedbackData(){
    	$("#userEmailFeedbacku").val("");
    	$("#fdbttn").val("");
    	$("#feedbackText").val("");
    }
    
    //FUNCTION FOR CHNGING USER EMAIL
    function changeUserEmail(){
    	
    	var userData={
    			userEmail :  $("#eml").val()
    	}
    	$.ajax({
    		type : "POST",
    		contentType : "application/json",
    		url : "/burkaFarkhar/changeEmail",
    		data : JSON.stringify(userData),
    		dataType : 'json',
    		success : function(result){
    			if(result.message != null){
    				$("#frm22").animate( {
    		           height:'toggle'
        				});
    				alert(result.message);
    			}
    		},
    		error : function(e) {
				alert("You have an Error! try again");
				console.log();
			}
    	});
    	resetUserChangeEmail();
    }
    function resetUserChangeEmail(){
    	$("#eml").val("");
    }
    
    //FUNCTION FOR CHANGING USER CONTACT DETAILS
    function changeUseContact(){
    	var userDate = {
    		provice :  $("#cty").val(),
    		userPhoneNumber :  $("#num").val(),
    		userAddress  :  $("#add").val()
    		
    	}
    	$.ajax({
    		type : "POST",
    		contentType : "application/json",
    		url : "/burkaFarkhar/changeUserContact",
    		data : JSON.stringify(userDate),
    		dataType : 'json',
    		success : function(result){
    			if(result.message != null) 
    				$("#frm").animate( {
		            height:'toggle'
    				});
    				alert(result.message);
    		},
    		
    		error : function(e) {
    			alert("You have an Error! try again");
    		}
    	});
    	resetUserContactDetails();
    }
    function resetUserContactDetails(){
    	$("#cty").val("Select Province");
    	$("#num").val("");
    	$("#add").val("");
    }
})
