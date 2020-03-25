var request = require("request");
QUnit.test("test QUnit", function( assert ) {
	var url = "http://127.0.0.1:8080/"
	assert.ok(true, "QUnit OK")
})
QUnit.test("connection server", function( assert ) {
	var url = "http://127.0.0.1:8080/test"
	expect(0);
	request.post(
		url,
		{
		json: {
		  
		}
		},
		(error, res, body) => {
		if (error) {

		  assert.ok(false,"connection server failed")
		  return
		}
		else{
			assert.ok(true, "connection server ok");
		}

	});
})