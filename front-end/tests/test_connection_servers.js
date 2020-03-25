import $ from "jquery";
QUnit.test("test QUnit", function( assert ) {
	var url = "http://127.0.0.1:8080/"
	assert.ok(true, "QUnit OK")
})
QUnit.test("connection server", function( assert ) {
	var url = "http://127.0.0.1:8080/"
	 $.ajax({
		  type: "POST",
		  url: url+"test",
		  data: {},
		  success: function(data, textStatus, jqXHR)
		    {
		        
		    	assert.ok(true, "connection Ok")

		    },
		    error: function (jqXHR, textStatus, errorThrown)
		    {
				assert.ok(false, "connection failed")	 
		    },
		  	dataType: "json"
		});
})