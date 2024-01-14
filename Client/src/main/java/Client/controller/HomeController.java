package Client.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
 private RestTemplate restTemplate= new RestTemplate();
 @RequestMapping("/")
 public ModelAndView getIndex(){
	 String url="http://localhost:7070/Server/HocSinhController/getHocSinh";
	 ResponseEntity<String> response = restTemplate.getForEntity(url,String.class);
	 return new ModelAndView("list","rs",response.getBody());
	 
 }
 @RequestMapping("getHocSinh")
	public ModelAndView getGiangViens() {
		String url = "http://localhost:7070/Server/HocSinhController/getHocSinh";
     ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
		
		return new ModelAndView("list", "rs", response.getBody());
	}
	
	@RequestMapping("deleteHocSinh")
	public String deleteGiangViens(HttpServletRequest request) {
		String url = "http://localhost:7070/Server/HocSinhController/deleteHocSinh?id=" + request.getParameter("id");
     ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
		
     return "redirect:/getHocSinh";
     
	}
}
