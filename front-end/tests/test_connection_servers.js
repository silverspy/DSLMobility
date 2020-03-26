var request = require("request");
QUnit.test("test QUnit", function( assert ) {
	assert.ok(true, "QUnit OK")
})

QUnit.test("test QUnit", function( assert ) {
	var done = assert.async();
	var url = "http://54.36.98.109:8080/test"

	request.post(
		url,
		{
		json: {
		  
		}
		},
		(error, res, body) => {
		if (error) {

		  assert.ok(false,"connection server failed")
		  done();
		  return
		}
		else{
			assert.ok(true, "connection server ok");
			done();
		}

	});
})
/*	
})*/