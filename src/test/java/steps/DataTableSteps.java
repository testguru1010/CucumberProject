package steps;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Then;

public class DataTableSteps {

@Then("user enters firstname and lastname from DT aslist")
public void user_enters_firstname_and_lastname_from_DT_asList(io.cucumber.datatable.DataTable dataTable) {
   System.out.println(">>>This is Data table code<<<");
   
   List<List<String>> data = dataTable.asLists();
   System.out.println("List Dat >> First Name is : " + data.get(0).get(0));
   System.out.println("List Data >> Last Name is : " + data.get(0).get(1));
   
    
}
	@Then("user enters firstname and lastname from DT asMap")
	public void user_enters_firstname_and_lastname_from_DT_asMap(io.cucumber.datatable.DataTable dataTable) {
		System.out.println(">>>This is Data table code<<<");


		for (Map<String, String> data : dataTable.asMaps(String.class, String.class))
			
		{
			System.out.println("MAP Data >> First Name is : " + data.get("FirstName") + "--- Last Name is : "
					+ data.get("LastName"));

		}

	}

}
