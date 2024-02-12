package com.blueyonder.team4;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class ViewProductApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	
	//Get Product
	@Test
	public void testGetAllProduct() throws Exception {
        mockMvc.perform(get("/product/get"))
               .andExpect(status().isOk())
               .andExpect(jsonPath("$").isArray())
               .andExpect(jsonPath("$[0].name").value("product20"))
               .andExpect(jsonPath("$[1].name").value("product3"));
    }
	
	//Post Product
	@Test
    public void testPostProduct() throws Exception {
		String data = "{\"P_id\": 13, \"category\": {\"category_id\": 2},\"name\": \"product13\",\"thumbnail\": \"thumbnail13\",\"price\":15.00,\"details\":\"details13\",\"qty\":2}";
		mockMvc.perform(post("/product/addProduct")
	            .contentType(MediaType.APPLICATION_JSON)
	            .content(data))
	            .andExpect(status().isOk())
	            .andExpect(jsonPath("$.name").value("product13"))
	            .andExpect(jsonPath("$.category.category_id").value(2));
    }
	
	//Put Product
	@Test
    public void testPutProduct() throws Exception {
		String data = "{\"p_id\": 6, \"category\": {\"category_id\": 2},\"name\": \"product6\",\"thumbnail\": \"thumbnail3\",\"price\":15.00,\"details\":\"details3\",\"qty\":2}";
		mockMvc.perform(put("/product/update")
	            .contentType(MediaType.APPLICATION_JSON)
	            .content(data))
	            .andExpect(status().isOk())
	            .andExpect(jsonPath("$.name").value("product6"))
	            .andExpect(jsonPath("$.category.category_id").value(2));
    }
	
	//Delete Product
	@Test
	public void testDeleteProduct() throws Exception {
	    mockMvc.perform(delete("/product/delete/{id}",7))
	            .andExpect(status().isOk());
	}
	
	
	//Get Customized Product
	@Test
	public void testGetAllCategory() throws Exception {
        mockMvc.perform(get("/category/getCategory"))
               .andExpect(status().isOk())
               .andExpect(jsonPath("$").isArray())
               .andExpect(jsonPath("$[0].category_name").value("cat1"))
               .andExpect(jsonPath("$[1].category_name").value("cat2"));
    }
		
		
	//Post Product Category
	@Test
    public void testPostProductCategory() throws Exception {
		String data = "{\"category_name\": \"category3\"}";
		mockMvc.perform(post("/category/addCategory")
	            .contentType(MediaType.APPLICATION_JSON)
	            .content(data))
	            .andExpect(status().isOk())
	            .andExpect(jsonPath("$.category_name").value("category3"));
    }
	
	//Get Customized Product
	@Test
	public void testGetAllCustomisedProduct() throws Exception {
        mockMvc.perform(get("/customised/get"))
               .andExpect(status().isOk())
               .andExpect(jsonPath("$").isArray())
               .andExpect(jsonPath("$[0].p_id").value(1));
    }
	
	//Get Customer Review
	@Test
	public void testGetAllFeedBack() throws Exception {
        mockMvc.perform(get("/review/getFeedback"))
               .andExpect(status().isOk())
               .andExpect(jsonPath("$").isArray())
               .andExpect(jsonPath("$[0].r_stars").value(5));
    }
	
	//Get Order Details
	@Test
	public void testGetAllOrderDetails() throws Exception {
        mockMvc.perform(get("/order/get"))
               .andExpect(status().isOk())
               .andExpect(jsonPath("$").isArray())
               .andExpect(jsonPath("$[0].o_id").value(1));
    }

	//Put Product
	@Test
    public void testPutOrder() throws Exception {
		mockMvc.perform(put("/order/update")
				.param("o_id","1")
				.param("staff_id", "1"))
	            .andExpect(status().isOk());
    }

}
