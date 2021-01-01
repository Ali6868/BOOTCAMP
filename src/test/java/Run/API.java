package Run;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import java.io.File;

public class API {
  @Test
  public void f() {
	  Response it = get("https://reqres.in/api/users?page=2");
	  it.prettyPrint();
	  
	  
  }

@Test
public void f2() {
	File fl = new File("/Users/arash/eclipse-workspace/BOOTCAMP/Entry.json");
	Response to = given().contentType(ContentType.JSON).body(fl).post("http://dummy.restapiexample.com/api/v1/create");
	to.prettyPrint();
}
}

